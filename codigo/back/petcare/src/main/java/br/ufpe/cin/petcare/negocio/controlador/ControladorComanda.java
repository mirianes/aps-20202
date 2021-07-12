package br.ufpe.cin.petcare.negocio.controlador;

import java.util.List;

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

    public List<Comanda> buscarComandasPeloPetId(Long petId) {
		return this.cadastroComanda.buscarComandasPeloPetId(petId);
	}

    public void encerrarComanda(Long Id) {
        this.cadastroComanda.encerrarComanda(Id);
    }
}
