package br.ufpe.cin.petcareservicopet.dados.repositorio.modelo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PetDAO extends JpaRepository<Pet, Long> {
    
    @Query("SELECT p FROM Pet p WHERE UPPER(nome) LIKE UPPER(concat('%', :nome, '%'))")
    List<Pet> buscar(@Param("nome") String nome);

    @Query("SELECT p FROM Pet p WHERE id_tutor = :idTutor")
    List<Pet> listar(@Param("idTutor") Long idTutor);
}
