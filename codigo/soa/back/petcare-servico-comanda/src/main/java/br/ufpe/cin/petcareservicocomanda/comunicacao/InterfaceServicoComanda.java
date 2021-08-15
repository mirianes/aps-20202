package br.ufpe.cin.petcareservicocomanda.comunicacao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcareservicocomanda.comunicacao.body.InserirComandaBody;
import br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo.Comanda;
import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Procedimento;
import br.ufpe.cin.petcareservicocomanda.negocio.fachada.Fachada;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/comanda")
@Slf4j
public class InterfaceServicoComanda {

    private Fachada fachada;

    public InterfaceServicoComanda(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }

    @PostMapping("/inserir")
    public Comanda inserir(@RequestBody InserirComandaBody body) {
        Long idUsuario = body.getIDUsuario();
        Long idPet = body.getIDPet();
        List<Procedimento> listaProcedimentos = body.getListaProcedimentos();

        return this.fachada.inserir(idUsuario, idPet, listaProcedimentos);
    }

    @GetMapping("/listarEmAberto")
    public List<Comanda> listar(@RequestParam("idPet") Long idPet) {
        return this.fachada.listar(idPet);
    }

    @PutMapping("/encerrar")
    public void encerrar(@RequestParam("numeroComanda") String numeroComanda) {
        this.fachada.encerrar(numeroComanda);
    }
}
