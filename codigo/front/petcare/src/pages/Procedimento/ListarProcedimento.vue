<template>
  <b-modal
    id="modal-1"
    scrollable
    title="Procedimentos"
    @ok="insertComanda(1, selected)"
  >
    <div>
      <table class="table table-borderless table-hover">
        <thead class="my-style-table">
          <tr>
            <td></td>
          </tr>
        </thead>
        <tbody>
          <tr v-for="procedimento in procedimentos" :key="procedimento.ID">
            <td>{{ procedimento }}</td>
            <td>
              <b-form-group v-slot="{ ariaDescribedby }">
                <b-form-checkbox
                  v-model="selected"
                  :key="procedimento.ID"
                  :value="procedimento.ID"
                  :aria-describedby="ariaDescribedby"
                >
                </b-form-checkbox>
              </b-form-group>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
    <b-button variant="primary" @click="getListarEmAberto()">listar</b-button>
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
      idPetParam: undefined,
      listaProcedimentosParam: undefined,
    };
  },

  methods: {
    async getListarEmAberto() {
      console.log(this.idPet);
      try {
       await axios({
          method: "GET",
          url: "http://localhost:8088/procedimento/listarEmAberto",
          httpAgent: new http.Agent({ rejectUnauthorized: false }),
          params: { idPet: this.idPet },
          responseType: 'json',
        }).then((response) => {
          this.procedimentos = response.data;
        });
      } catch (error) {
        console.log(error);
      }
    },

    async insertComanda(idUsuarioParam, listaProcedimentosParam) {
      this.procedimentos = []
      try {
       await axios({
          method: "POST",
          url: "http://localhost:8081/comanda/inserir",
          httpAgent: new http.Agent({ rejectUnauthorized: false }),
          data: {
            idUsuario: idUsuarioParam,
            idPet: this.idPet,
            listaProcedimentos: listaProcedimentosParam,
          },
        });
      } catch (error) {
        console.log(error);
      }
    },
  },
};
</script>