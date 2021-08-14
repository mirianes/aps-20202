package br.ufpe.cin.petcare.dados.repositorio.comanda;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;

public interface InterfaceRepositorioComandas {
	public Comanda inserir(Comanda comanda);
	public List<Comanda> buscarComandasPeloPetId(Long petId);
	public void encerrarComanda(Long Id);
	public Comanda buscarComanda(Long id);
}
