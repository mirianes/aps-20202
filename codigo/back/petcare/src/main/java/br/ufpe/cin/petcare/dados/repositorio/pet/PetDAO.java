package br.ufpe.cin.petcare.dados.repositorio.pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;

@Repository
public interface PetDAO extends JpaRepository<Pet, Long>{

}
