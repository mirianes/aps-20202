package br.ufpe.cin.petcareservicopet.dados.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcareservicopet.dados.repositorio.modelo.Pet;
import br.ufpe.cin.petcareservicopet.dados.repositorio.modelo.PetDAO;

@Component
public class RepositorioPets implements InterfaceRepositorioPets {

    @Autowired
    public PetDAO petDAO;

    @Override
    public List<Pet> buscar(String nome) {
        return this.petDAO.buscar(nome);
    }

    @Override
    public List<Pet> listar() {
        return this.petDAO.findAll();
    }
}
