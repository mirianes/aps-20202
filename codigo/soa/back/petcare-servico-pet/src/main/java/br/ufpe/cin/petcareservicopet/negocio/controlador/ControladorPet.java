package br.ufpe.cin.petcareservicopet.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcareservicopet.dados.repositorio.InterfaceRepositorioPets;
import br.ufpe.cin.petcareservicopet.dados.repositorio.modelo.Pet;

public class ControladorPet {
    
    public InterfaceRepositorioPets repositorioPets;

    public ControladorPet(InterfaceRepositorioPets repositorioPets) {
        this.repositorioPets = repositorioPets;
    }

    public List<Pet> buscar(String nome) {
        return this.repositorioPets.buscar(nome);
    }

    public List<Pet> listar() {
        return this.repositorioPets.listar();
    }

    public List<Pet> listar(Long idTutor) {
        return this.repositorioPets.listar(idTutor);
    }
}
