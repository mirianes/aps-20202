package br.ufpe.cin.petcareservicoprocedimento.negocio.fachada;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.InterfaceRepositorioProcedimentos;
import br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo.Procedimento;
import br.ufpe.cin.petcareservicoprocedimento.negocio.controlador.ControladorProcedimento;

public class Fachada {
    
    private static Fachada instance;
    private ControladorProcedimento controladorProcedimento;

    private Fachada(ApplicationContext context) {
        InterfaceRepositorioProcedimentos repositorioProcedimentos = (InterfaceRepositorioProcedimentos) context.getBean("repositorioProcedimentos");
        this.controladorProcedimento = new ControladorProcedimento(repositorioProcedimentos);
    }

    public static Fachada getInstance(ApplicationContext context) {
        if (instance == null) {
            instance = new Fachada(context);
        }

        return instance;
    }

    public List<Procedimento> listar(Long idPet) {
        return this.controladorProcedimento.listar(idPet);
    }
}
