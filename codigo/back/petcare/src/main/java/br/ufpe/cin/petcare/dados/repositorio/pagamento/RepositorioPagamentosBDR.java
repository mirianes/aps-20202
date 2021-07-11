package br.ufpe.cin.petcare.dados.repositorio.pagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.pagamento.Pagamento;

@Component
public class RepositorioPagamentosBDR implements InterfaceRepositorioPagamentos {
	@Autowired
	private PagamantoDAO pagamentoDAO;

	@Override
	public Pagamento inserir(Pagamento pagamento) {
		return pagamentoDAO.save(pagamento);
	}

}
