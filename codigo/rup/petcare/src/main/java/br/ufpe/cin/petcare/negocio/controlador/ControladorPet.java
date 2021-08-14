package br.ufpe.cin.petcare.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.pet.CadastroPet;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;

public class ControladorPet {
	private CadastroPet cadastroPet;
	
	public ControladorPet(CadastroPet cadastroPet) {
		this.cadastroPet = cadastroPet;
	}
	
	public Pet inserir(Pet pet) {
		return this.cadastroPet.inserir(pet);
	}

	public List<Pet> buscar(String nome) {
		return this.cadastroPet.buscar(nome);
	}

	public Pet buscar(Long ID) {
		return this.cadastroPet.buscar(ID);
	}
}
