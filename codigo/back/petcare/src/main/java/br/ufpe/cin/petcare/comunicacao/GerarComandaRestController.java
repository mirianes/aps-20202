package br.ufpe.cin.petcare.comunicacao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcare.comunicacao.requestBody.atendimento.ListarAtendimentoBody;
import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.fachada.Fachada;

@RestController
@RequestMapping("/gerarComanda")
public class GerarComandaRestController {
    private Fachada fachada;

    public GerarComandaRestController(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }
    
    @PostMapping("listarAtendimentos")
    public List<Atendimento> listarAtendimentos(@RequestBody ListarAtendimentoBody body) throws Exception {
        String token = body.getToken();
        String nomePet = body.getNomePet();

        return this.fachada.listarAtendimentos(token, nomePet);
    }
}
