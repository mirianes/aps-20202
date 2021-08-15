import { CartaoEntity } from "../entidade/cartao";
import { checkEmpty, checkYearMonth } from "./util";

class ValidateCartao {
    validarCartao(cartao: CartaoEntity): string {
        if(checkEmpty(cartao.codigoSeguranca)) {
            return "O codigo de segurança do cartão não foi fornecido."
        }

        if(checkEmpty(cartao.numero)) {
            return "O número do cartão não foi fornecido."
        }

        if(checkEmpty(cartao.validade)) {
            return "O validade do cartão não foi fornecido"
        }

        if(!checkYearMonth(cartao.validade)) {
            return "A data de validade do cartão não está no formato correto"
        }

        return null
    }
}

export {
    ValidateCartao
}