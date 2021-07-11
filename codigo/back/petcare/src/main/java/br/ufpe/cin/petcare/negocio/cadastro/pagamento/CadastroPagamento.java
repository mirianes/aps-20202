package br.ufpe.cin.petcare.negocio.cadastro.pagamento;

import br.ufpe.cin.petcare.dados.repositorio.pagamento.InterfaceRepositorioPagamentos;

public class CadastroPagamento {
	private InterfaceRepositorioPagamentos repositorioPagamentos;
	
	public CadastroPagamento(InterfaceRepositorioPagamentos repositorioPagamentos) {
		this.repositorioPagamentos = repositorioPagamentos;
	}
	
	public Pagamento inserir(Pagamento pagamento) {
		return this.repositorioPagamentos.inserir(pagamento);
	}
}
