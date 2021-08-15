package br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProcedimentoDAO extends JpaRepository<Procedimento, Long> {
    
    @Query("SELECT p FROM Procedimento p WHERE id_pet = :idPet and pago = false")
    List<Procedimento> buscarPeloIDPet(@Param("idPet") Long idPet);
}
