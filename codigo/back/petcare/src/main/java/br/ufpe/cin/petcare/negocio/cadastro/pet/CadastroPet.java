package br.ufpe.cin.petcare.negocio.cadastro.pet;

import java.util.List;

import br.ufpe.cin.petcare.dados.repositorio.pet.InterfaceRepositorioPets;

public class CadastroPet {
	private InterfaceRepositorioPets repositorioPets;
	
	public CadastroPet(InterfaceRepositorioPets repositorioPets) {
		this.repositorioPets = repositorioPets;
	}
	
	public Pet inserir(Pet pet) {
		return this.repositorioPets.inserir(pet);
	}

	public List<Pet> buscar(String nome) {
		return this.repositorioPets.buscar(nome);
	}

	public Pet buscar(Long ID) {
		return this.repositorioPets.buscar(ID);
	}
}
