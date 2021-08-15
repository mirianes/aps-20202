package br.ufpe.cin.petcareservicocomanda.negocio.fachada;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcareservicocomanda.dados.repositorio.InterfaceRepositorioComandas;
import br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo.Comanda;
import br.ufpe.cin.petcareservicocomanda.negocio.controlador.ControladorComanda;
import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Procedimento;

public class Fachada {
    
    private static Fachada instance;
    private ControladorComanda controladorComanda;

    private Fachada(ApplicationContext context) {
        InterfaceRepositorioComandas repositorioComandas = (InterfaceRepositorioComandas) context.getBean("repositorioComandas");
        this.controladorComanda = new ControladorComanda(repositorioComandas);
    }

    public static Fachada getInstance(ApplicationContext context) {
        if (instance == null) {
            instance = new Fachada(context);
        }

        return instance;
    }

    public Comanda inserir(Long idUsuario, Long idPet, List<Procedimento> listaProcedimentos) {
        return this.controladorComanda.inserir(idUsuario, idPet, listaProcedimentos);
    }

    public List<Comanda> listar(Long idPet) {
        return this.controladorComanda.listar(idPet);
    }

    public void encerrar(String numeroComanda) {
        this.controladorComanda.encerrar(numeroComanda);
    }
}
