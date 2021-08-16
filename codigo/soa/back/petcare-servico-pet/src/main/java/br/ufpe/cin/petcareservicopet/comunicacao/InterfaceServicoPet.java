package br.ufpe.cin.petcareservicopet.comunicacao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcareservicopet.dados.repositorio.modelo.Pet;
import br.ufpe.cin.petcareservicopet.negocio.fachada.Fachada;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/pet")
@Slf4j
public class InterfaceServicoPet {

    private Fachada fachada;

    public InterfaceServicoPet(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }
    
    @GetMapping("buscarPeloNome")
    public List<Pet> buscar(@RequestParam("nome") String nome) {
        return this.fachada.buscar(nome);
    }

    @GetMapping("listar")
    public List<Pet> listar() {
        return this.fachada.listar();
    }

    @GetMapping("listarPeloIDTutor")
    public List<Pet> listar(Long idTutor) {
        return this.fachada.listar(idTutor);
    }
}
