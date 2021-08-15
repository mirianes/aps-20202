package br.ufpe.cin.petcareservicoprocedimento.comunicacao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo.Procedimento;
import br.ufpe.cin.petcareservicoprocedimento.negocio.fachada.Fachada;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/procedimento")
@Slf4j
public class InterfaceServicoProcedimento {
    
    private Fachada fachada;

    public InterfaceServicoProcedimento(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }

    @GetMapping("listarEmAberto")
    public List<Procedimento> listar(@RequestParam("idPet") Long idPet) {
        return this.fachada.listar(idPet);
    }
}
