package br.ufpe.cin.petcareservicopet.dados.repositorio;

import java.util.List;

import br.ufpe.cin.petcareservicopet.dados.repositorio.modelo.Pet;

public interface InterfaceRepositorioPets {
    
    public List<Pet> buscar(String nome);
    public List<Pet> listar();
}
