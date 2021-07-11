package br.ufpe.cin.petcare.comunicacao;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcare.comunicacao.requestBody.atendimento.ListarAtendimentoBody;
import br.ufpe.cin.petcare.comunicacao.requestBody.comanda.InserirComandaBody;
import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;
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

    @PostMapping("inserirComanda")
    public Comanda inserirComanda(@RequestBody InserirComandaBody body) throws Exception {
        String token = body.getToken();
        String numero = body.getNumero();
        Long tutorID = body.getTutorID();
        Long petID = body.getPetID();
        List<Long> atendimentosIDs = body.getAtendimentosIDs();
        double valorTotal = body.getValorTotal();
        Date dataEntrada = body.getDataEntrada();
        Date dataVencimento = body.getDataVencimento();

        Usuario tutor = this.fachada.buscarUsuario(tutorID);

        if (tutor == null) {
            throw new Exception("Não existe um usuário com o ID informado.");
        }

        Pet pet = this.fachada.buscarPet(petID);

        if (pet == null) {
            throw new Exception("Não existe um pet com o ID informado");
        }

        List<Atendimento> atendimentos = this.fachada.listarAtendimentos(atendimentosIDs);

        if (atendimentos == null || atendimentos.size() == 0) {
            throw new Exception("Não existe atendimentos com os IDs informados.");
        }

        Comanda comanda = new Comanda(numero, tutor, pet, atendimentos, valorTotal, dataEntrada, dataVencimento, false);

        return this.fachada.inserirComanda(token, comanda);
    }
}
