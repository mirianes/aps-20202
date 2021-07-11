package br.ufpe.cin.petcare.negocio.controlador;

import br.ufpe.cin.petcare.negocio.cadastro.comanda.CadastroComanda;
import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;

public class ControladorComanda {
	private CadastroComanda cadastroComanda;
	
	public ControladorComanda(CadastroComanda cadastroComanda) {
		this.cadastroComanda = cadastroComanda;
	}
	
	public Comanda inserir(Comanda comanda) {
		return this.cadastroComanda.inserir(comanda);
	}
}
