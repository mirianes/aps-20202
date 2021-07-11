package br.ufpe.cin.petcare.dados.repositorio.pet;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;

public interface InterfaceRepositorioPets {
	public Pet inserir(Pet pet);
	public List<Pet> buscar(String nome);
	public Pet buscar(Long ID);
}
