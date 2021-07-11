package br.ufpe.cin.petcare.dados.repositorio.atendimento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;

@Repository
public interface AtendimentoDAO extends JpaRepository<Atendimento, Long>{

}
