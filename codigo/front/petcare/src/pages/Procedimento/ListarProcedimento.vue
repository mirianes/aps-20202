<template>
  <b-modal id="modal-1" scrollable title="Procedimentos" @ok="insertComanda(1,procedimento.id_pet,selected)">
    <div>
      <table class="table table-borderless table-hover">
        <thead class="my-style-table">
          <tr>
            <td></td>
          </tr>
        </thead>
        <tbody>
          <tr v-for="procedimento in procedimentos" :key="procedimento.id">
            <td>{{ procedimento }}</td>
            <td>
              <b-form-group v-slot="{ ariaDescribedby }">
                <b-form-checkbox
                  v-model="selected"
                  :key="procedimento.id"
                  :value="procedimento.id"
                  :aria-describedby="ariaDescribedby"
                >
                </b-form-checkbox>
              </b-form-group>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </b-modal>
</template>

<script>
import axios from "axios";
import http from "http";

export default {
  props: {
    idPet: {
      type: Number,
      required: false,
    },
    flag: {
      type: Boolean,
      required: false,
    },
  },

  data() {
    return {
      selected: [],
      procedimentos: [],
      idUsuarioParam: undefined,
      idPetParam:undefined,
      listaProcedimentosParam:undefined
    };
  },

  methods: {
    async created() {
      this.getListarEmAberto(this.idPet)
    },
    getListarEmAberto(idPet) {
      if (this.flag) {
        try {
          axios({
            method: "GET",
            url: "http://localhost:8088/procedimento/listarEmAberto",
            httpAgent: new http.Agent({ rejectUnauthorized: false }),
            params: { idPet: idPet },
            responseType: "json",
          }).then((response) => {
            this.procedimentos = response.data;
          });
        } catch (error) {
          console.log(error);
        }
      }
    },
    
    insertComanda(idUsuarioParam, idPetParam, listaProcedimentosParam) {
      alert(idUsuarioParam, idPetParam, listaProcedimentosParam)
      try {
        axios({
           method: "POST",
           url: "http://localhost:8081/comanda/inserir",
           httpAgent: new http.Agent({ rejectUnauthorized: false }),
           data: {
             idUsuario: idUsuarioParam,
             idPet: idPetParam,
             listaProcedimentos: listaProcedimentosParam
           }
        })
      } catch (error) {
        console.log(error)
      }
    }
  },
};
</script>