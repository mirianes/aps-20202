<template>
  <b-modal
    id="modal-2"
    scrollable
    title="Efetuar Pagamento"
    @ok="
      efetuarPagamento(
        idComanda,
        valor,
        data,
        parcelas,
        numeroCartao,
        validadeCartao,
        codigoCartao
      )
    "
  >
    <div>
      <label for="idComandaField">idComanda </label>
      <b-form-input id="idComandaField" v-model="idComanda" disabled>
      </b-form-input>

      <label for="idValorField">Valor</label>
      <b-form-input id="idValorField" v-model="valor" disabled> </b-form-input>

      <label for="idDataField">Data</label>
      <b-form-input type="text" id="idDataField" v-model="data" disabled>
      </b-form-input>

      <label for="idNumeroParcelasField">Número de Parcelas</label>
      <b-form-input type="number" id="idNumeroParcelasField" v-model="parcelas">
      </b-form-input>

      <label for="idNumeroCartaoField">Número do Cartão</label>
      <b-form-input id="idNumeroCartaoField" v-model="numeroCartao">
      </b-form-input>

      <label for="idValidadeCartaoField">Validade do Cartão</label>
      <b-form-input id="idValidadeCartaoField" v-model="validadeCartao">
      </b-form-input>

      <label for="idCodigoCartaoField">Código do Cartão</label>
      <b-form-input id="idCodigoCartaoField" v-model="codigoCartao">
      </b-form-input>
    </div>
  </b-modal>
</template>
<script>
import axios from "axios";
import http from "http";

export default {
  props: {
    idComanda: {
      type: Number,
      required: false,
    },
    valor: {
      type: Number,
      required: false,
    },
    data: {
      type: String,
      required: false,
    },
    numero: {
      type: String,
      required: false,
    },
  },
  data() {
    return {
      idDisabled: false,
      parcelas: undefined,
      numeroCartao: undefined,
      validadeCartao: undefined,
      codigoCartao: undefined,
    };
  },
  methods: {
   async  encerrarComanda() {
      try {
        await axios({
          method: "PUT",
          url: "http://localhost:8081/comanda/encerrar",
          httpAgent: new http.Agent({ rejectUnauthorized: false }),
          params: {
            numeroComanda: this.numero,
          },
        });
      } catch (error) {
        console.log(error);
      }
    },

   async efetuarPagamento(
      idComandaParam,
      valorParam,
      dataParam,
      parcelasParam,
      numeroCartaoParam,
      validadeCartaoParam,
      codigoCartaoParam
    ) {
      try {
        await axios({
          method: "POST",
          url: "http://localhost:8084/pagamento/efetuarPagamento",
          httpAgent: new http.Agent({ rejectUnauthorized: false }),
          data: {
            idComanda: idComandaParam,
            valor: valorParam,
            numeroParcelas: parcelasParam,
            data: dataParam,
            numeroCartao: numeroCartaoParam,
            validadeCartao: validadeCartaoParam,
            codigoCartao: codigoCartaoParam,
          },
        });
      } catch (error) {
        console.log(error);
      }
      this.encerrarComanda()
    },
  },
};
</script>