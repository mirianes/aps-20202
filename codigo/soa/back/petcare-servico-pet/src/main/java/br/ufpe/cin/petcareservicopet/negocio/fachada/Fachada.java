package br.ufpe.cin.petcareservicopet.negocio.fachada;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcareservicopet.dados.repositorio.InterfaceRepositorioPets;
import br.ufpe.cin.petcareservicopet.dados.repositorio.modelo.Pet;
import br.ufpe.cin.petcareservicopet.negocio.controlador.ControladorPet;

public class Fachada {

    private static Fachada instance;
    private ControladorPet controladorPet;

    private Fachada(ApplicationContext context) {
        InterfaceRepositorioPets repositorioPets = (InterfaceRepositorioPets) context.getBean("repositorioPets");
        this.controladorPet = new ControladorPet(repositorioPets);
    }

    public static Fachada getInstance(ApplicationContext context) {
        if (instance == null) {
            instance = new Fachada(context);
        }

        return instance;
    }

    public List<Pet> buscar(String nome) {
        return this.controladorPet.buscar(nome);
    }

    public List<Pet> listar() {
        return this.controladorPet.listar();
    }
}