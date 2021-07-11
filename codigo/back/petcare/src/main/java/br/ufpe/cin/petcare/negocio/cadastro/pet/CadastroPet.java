package br.ufpe.cin.petcare.negocio.cadastro.pet;

import br.ufpe.cin.petcare.dados.repositorio.pet.InterfaceRepositorioPets;

public class CadastroPet {
	private InterfaceRepositorioPets repositorioPets;
	
	public CadastroPet(InterfaceRepositorioPets repositorioPets) {
		this.repositorioPets = repositorioPets;
	}
	
	public Pet inserir(Pet pet) {
		return this.repositorioPets.inserir(pet);
	}
}
