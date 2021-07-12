package br.ufpe.cin.petcare.comunicacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcare.comunicacao.requestBody.comanda.BuscarComandaPeloPetIdBody;
import br.ufpe.cin.petcare.comunicacao.requestBody.comanda.EncerrarComandaBody;
import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;
import br.ufpe.cin.petcare.negocio.fachada.Fachada;

@RestController
@RequestMapping("/pagamento")
public class PagamentoRestController {
    private Fachada fachada;

    @Autowired
    public PagamentoRestController(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }

    @PostMapping("buscarComandasPeloPetId")
    public List<Comanda> buscarComandasPeloPetId(@RequestBody BuscarComandaPeloPetIdBody body) throws Exception {
        Long petId = body.getPetId();

        return this.fachada.buscarComandasPeloPetId(petId);
    }

    @PostMapping("encerrarComanda")
    public void encerrarComanda(@RequestBody EncerrarComandaBody body) throws Exception {
        Long id = body.getId();

        this.fachada.encerrarComanda(id);
    }
}
