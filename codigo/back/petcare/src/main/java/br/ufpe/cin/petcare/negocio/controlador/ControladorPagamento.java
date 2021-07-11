package br.ufpe.cin.petcare.negocio.controlador;

import br.ufpe.cin.petcare.negocio.cadastro.pagamento.CadastroPagamento;
import br.ufpe.cin.petcare.negocio.cadastro.pagamento.Pagamento;

public class ControladorPagamento {
	private CadastroPagamento cadastroPagamento;
	
	public ControladorPagamento(CadastroPagamento cadastroPagamento) {
		this.cadastroPagamento = cadastroPagamento;
	}
	
	public Pagamento inserir(Pagamento pagamento) {
		return this.cadastroPagamento.inserir(pagamento);
	}
}
