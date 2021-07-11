package br.ufpe.cin.petcare.dados.repositorio.comanda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;

@Component
public class RepositorioComandasBDR implements InterfaceRepositorioComandas {
	@Autowired
	private ComandaDAO comandaDAO;

	@Override
	public Comanda inserir(Comanda comanda) {
		return comandaDAO.save(comanda);
	}
}
