package br.ufpe.cin.petcare.negocio.cadastro.comanda;

import java.util.List;

import br.ufpe.cin.petcare.dados.repositorio.comanda.InterfaceRepositorioComandas;

public class CadastroComanda {
	private InterfaceRepositorioComandas repositorioComandas;
	
	public CadastroComanda(InterfaceRepositorioComandas repositorioComandas) {
		this.repositorioComandas = repositorioComandas;
	}
	
	public Comanda inserir(Comanda comanda) {
		return this.repositorioComandas.inserir(comanda);
	}

	public List<Comanda> buscarComandasPeloPetId(Long petId) {
		return this.repositorioComandas.buscarComandasPeloPetId(petId);
	}

	public void encerrarComanda(Long id) {
		this.repositorioComandas.encerrarComanda(id);
	}

	public Comanda buscarComanda(Long id) {
		return this.repositorioComandas.buscarComanda(id);
	}
}
