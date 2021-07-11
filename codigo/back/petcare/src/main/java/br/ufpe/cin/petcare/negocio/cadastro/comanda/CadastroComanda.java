package br.ufpe.cin.petcare.negocio.cadastro.comanda;

import br.ufpe.cin.petcare.dados.repositorio.comanda.InterfaceRepositorioComandas;

public class CadastroComanda {
	private InterfaceRepositorioComandas repositorioComandas;
	
	public CadastroComanda(InterfaceRepositorioComandas repositorioComandas) {
		this.repositorioComandas = repositorioComandas;
	}
	
	public Comanda inserir(Comanda comanda) {
		return this.repositorioComandas.inserir(comanda);
	}
}
