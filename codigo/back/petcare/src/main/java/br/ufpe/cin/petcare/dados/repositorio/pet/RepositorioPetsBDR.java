package br.ufpe.cin.petcare.dados.repositorio.pet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;

@Component
public class RepositorioPetsBDR implements InterfaceRepositorioPets{
	@Autowired
	private PetDAO petDAO;

	@Override
	public Pet inserir(Pet pet) {
		return this.petDAO.save(pet);
	}

	@Override
	public List<Pet> buscar(String nome) {
		return this.petDAO.findByNome(nome);
	}

	@Override
	public Pet buscar(Long ID) {
		Optional<Pet> pet = this.petDAO.findById(ID);

		if (pet.isPresent()) {
			return pet.get();
		} else {
			return null;
		}
	}
}
