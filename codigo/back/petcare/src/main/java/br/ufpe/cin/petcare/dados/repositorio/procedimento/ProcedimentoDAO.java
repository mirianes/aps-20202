package br.ufpe.cin.petcare.dados.repositorio.procedimento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufpe.cin.petcare.negocio.cadastro.procedimento.Procedimento;

@Repository
public interface ProcedimentoDAO extends JpaRepository<Procedimento, Long>{
    
}
