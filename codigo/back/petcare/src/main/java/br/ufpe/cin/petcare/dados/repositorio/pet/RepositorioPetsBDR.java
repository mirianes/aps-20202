package br.ufpe.cin.petcare.dados.repositorio.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;

@Component
public class RepositorioPetsBDR implements InterfaceRepositorioPets{
	@Autowired
	private PetDAO petDAO;

	@Override
	public Pet inserir(Pet pet) {
		return petDAO.save(pet);
	}

	@Override
	public List<Pet> buscar(String nome) {
		return petDAO.findByNome(nome);
	}
}
