package br.ufpe.cin.petcare.dados.repositorio.comanda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;

@Component
public class RepositorioComandasBDR implements InterfaceRepositorioComandas {
	@Autowired
	private ComandaDAO comandaDAO;

	@Override
	public Comanda inserir(Comanda comanda) {
		return this.comandaDAO.save(comanda);
	}

	@Override
	public List<Comanda> buscarComandasPeloPetId(Long petId) {
		return this.comandaDAO.buscarComandasPeloPetId(petId);
	}

	@Override
	public void encerrarComanda(Long Id) {
		this.comandaDAO.encerrarComanda(Id);
	}

	@Override
	public Comanda buscarComanda(Long id) {
		return this.comandaDAO.getById(id);
	}
}
