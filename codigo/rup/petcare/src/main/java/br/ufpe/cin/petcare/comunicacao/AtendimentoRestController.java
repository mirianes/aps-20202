package br.ufpe.cin.petcare.comunicacao;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcare.comunicacao.requestBody.atendimento.InserirAtendimentoBody;
import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.cadastro.medico.Medico;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;
import br.ufpe.cin.petcare.negocio.cadastro.procedimento.Procedimento;
import br.ufpe.cin.petcare.negocio.fachada.Fachada;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoRestController {
    private Fachada fachada;

    public AtendimentoRestController(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }

    @PostMapping("inserir")
    public Atendimento inserirAtendimento(@RequestBody InserirAtendimentoBody body) throws Exception {
        String token = body.getToken();
        Long petID = body.getPetID();
        List<Long> procedimentosIDs = body.getProcedimentosIDs();
        Long veterinarioID = body.getVeterinarioID();
        Date dataAtendimento = body.getDataAtendimento();
        double valor = body.getValor();

        Pet pet = this.fachada.buscarPet(petID);

        if (pet == null) {
            throw new Exception("Não existe um pet com o ID informado.");
        }

        List<Procedimento> procedimentos = this.fachada.listarProcedimentos(procedimentosIDs);

        if (procedimentos == null || procedimentos.size() == 0) {
            throw new Exception("Não existe procedimentos com os IDs informados.");
        }

        Medico veterinario = this.fachada.buscarMedico(veterinarioID);

        if (veterinario == null) {
            throw new Exception("Não existe um veterinário com o ID informado.");
        }

        Atendimento atendimento = new Atendimento(pet, procedimentos, veterinario, dataAtendimento, false, valor);

        return this.fachada.inserirAtendimento(token, atendimento);
    }
}
