package br.ufpe.cin.petcare.dados.repositorio.pet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;

@Repository
public interface PetDAO extends JpaRepository<Pet, Long>{
    @Query("SELECT p FROM Pet p WHERE p.nome = :nome")
    List<Pet> findByNome(@Param("nome") String nome);
}
