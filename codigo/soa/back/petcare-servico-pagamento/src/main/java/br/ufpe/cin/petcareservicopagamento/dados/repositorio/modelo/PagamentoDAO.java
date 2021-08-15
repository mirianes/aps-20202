package br.ufpe.cin.petcareservicopagamento.dados.repositorio.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoDAO extends JpaRepository<Pagamento, Long>{
	
}
