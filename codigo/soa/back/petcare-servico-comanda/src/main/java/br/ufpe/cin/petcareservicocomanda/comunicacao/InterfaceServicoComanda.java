package br.ufpe.cin.petcareservicocomanda.comunicacao;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo.Comanda;
import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Procedimento;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/comanda")
@Slf4j
public class InterfaceServicoComanda {

    @PostMapping("/inserir")
    public Comanda inserir(Long idUsuario, Long idPet, List<Procedimento> listaProcedimentos) {
        System.out.println("cheguei aqui mané");
        return null;
    }

    @GetMapping("/listar")
    public List<Comanda> listar(Long idUsuario) {

        return null;
    }

    @PutMapping("/encerrar")
    public void encerrar(String numeroComanda) {

    }
}
