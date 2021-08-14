package br.ufpe.cin.petcare.dados.repositorio.pagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufpe.cin.petcare.negocio.cadastro.pagamento.Pagamento;

@Repository
public interface PagamantoDAO extends JpaRepository<Pagamento, Long>{
	
}
