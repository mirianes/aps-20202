<template>
  <div class="container grid-xs py-2">
    <div class="input-group mb-6">
      <input
        type="text"
        class="form-control"
        placeholder="Digite o id do Pet"
        aria-label="Buscar Comanda"
        aria-describedby="basic-addon2"
        v-model="idPet"
      />
      <div class="input-group-append">
        <button
          class="btn btn-outline-secondary"
          type="button"
          @click="getListarEmAberto(idPet)"
        >
          Buscar
        </button>
      </div>
    </div>
    <div>
      <table class="table table-borderless table-hover">
        <thead class="my-style-table">
          <tr>
            <th>Comandas</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="comanda in resultComandas" :key="comanda.id">
            <td>
              {{ comanda }}
            </td>
            <td>
              <b-button v-b-modal.modal-2 pill variante="Primary"
                @click="(idComandaField = comanda.id), (valorField = comanda.valorTotal), (dataField = comanda.dataPagamento), (numeroField = comanda.numero)">Pagar</b-button
              >
            </td>
          </tr>
        </tbody>
        <tfoot></tfoot>
      </table>
    </div>
    <EfetuarPagamentoPage :idComanda="idComandaField" :valor="valorField" :data="dataField" :numero="numeroField"/>
  </div>
</template>

<script>
import axios from "axios";
import http from "http";

import EfetuarPagamentoPage from "../Pagamento/EfetuarPagamentoPage.vue";

export default {
  components: {
    EfetuarPagamentoPage
  },

  data() {
    return {
      resultComandas: [],
      namePet: undefined,
      selected: [],
      flag: false,
      idComanda: undefined,
      idPet: undefined,
      idComandaField: undefined,
      valorField: undefined,
      dataField: undefined,
      numeroField: undefined
    };
  },
  methods: {
    getListarEmAberto(idPet) {
      try {
        axios({
          method: "GET",
          url: "http://localhost:8081/comanda/listarEmAberto",
          httpAgent: new http.Agent({ rejectUnauthorized: false }),
          params: { idPet: idPet },
          responseType: "json",
        }).then((response) => {
          this.resultComandas = response.data;
        });
      } catch (error) {
        console.log(error);
      }
    },
  },
};
</script>