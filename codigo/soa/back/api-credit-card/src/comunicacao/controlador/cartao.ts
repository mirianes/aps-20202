import { CartaoEntity } from "../../dados/entidade/cartao";
import Fachada from "../../negocio/fachada/fachada";

class ControladorCartao {
  public fachada: Fachada;

  constructor() {
    this.fachada = new Fachada()
  }

  async validate(cartao: CartaoEntity) {
    return this.fachada.validate(cartao);
  }
}

export default ControladorCartao;
