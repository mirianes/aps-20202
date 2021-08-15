import { CartaoEntity } from "../../dados/entidade/cartao"
import { ValidateCartao } from "../../dados/validacao/cartao"

class Fachada {
    private validateCartao: ValidateCartao

    constructor() {
        this.validateCartao = new ValidateCartao()
    }

    validate(cartao: CartaoEntity){
        return this.validateCartao.validarCartao(cartao)
    }
}

export default Fachada