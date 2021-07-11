package br.ufpe.cin.petcare.dados.repositorio.atendimento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;

@Repository
public interface AtendimentoDAO extends JpaRepository<Atendimento, Long>{
    @Query("SELECT a FROM Atendimento a INNER JOIN Pet p ON p.id = a.pet WHERE p.nome = :nomePet")
    List<Atendimento> listar(@Param("nomePet") String nomePet);
}
