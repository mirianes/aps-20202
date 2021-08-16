<template>
  <div class="container grid-xs py-2">
    <div class="input-group mb-6">
      <input
        type="text"
        class="form-control"
        placeholder="Digite o nome do Pet"
        aria-label="Buscar Pet"
        aria-describedby="basic-addon2"
        v-model="namePet"
      />
      <div class="input-group-append">
        <button
          class="btn btn-outline-secondary"
          type="button"
          @click="getBuscarPeloNome(namePet)"
        >
          Buscar
        </button>
      </div>
    </div>
    <div>
      <table class="table table-borderless table-hover">
        <thead class="my-style-table">
          <tr>
            <th>Nome</th>
            <th>Ver Procedimentos</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="pet in resultPets" :key="pet.ID">
            <td >
              Nome: {{ pet.nome }} <br> Data Nascimento:{{pet.dataNascimento}} <br> Sexo: {{pet.sexo}} <br> Tipo: {{pet.tipo}} <br> idTutor: {{pet.idTutor}}
            </td>
            <td>
              <b-button  v-b-modal.modal-1 @click="(idPetField = pet.ID), (flagField = true)" >
                <b-icon icon="card-checklist"></b-icon>
              </b-button>
            </td>
          </tr>
        </tbody>
        <tfoot></tfoot>
      </table>
    </div>
    <ListarProcedimento :idPet="idPetField" :flag="flagField"/>
  </div>
</template>

<script>
import ListarProcedimento from "../Procedimento/ListarProcedimento.vue";

import axios from "axios";
import http from 'http'

export default {
  components: {
    ListarProcedimento,
  },

  data() {
    return {
      arrayPets: [],
      resultPets: [],
      namePet: undefined,
      idPetField: undefined,
      flagField: false,
    };
  },
  methods: {
     getBuscarPeloNome(namePet) {
      try {
        axios({
          method: "GET",
          url: "http://localhost:8082/pet/buscarPeloNome",
          httpAgent: new http.Agent({ rejectUnauthorized: false }),
          params: { nome: namePet },
          responseType: 'json'
        }).then(response => {
          this.resultPets = response.data
        });
      } catch (error) {
        console.log(error)
      }
    },
    setFlag() {
      if(this.flagField) {
        this.flagField = false
      }else{
        this.flagField = true
      }
    }
  },
};
</script>