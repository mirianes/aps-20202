package br.ufpe.cin.petcare.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.cadastro.atendimento.CadastroAtendimento;
import br.ufpe.cin.petcare.negocio.cadastro.comanda.CadastroComanda;
import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;

public class ControladorGerarComanda {
	private CadastroAtendimento cadastroAtendimento;
	private CadastroComanda cadastroComanda;
	
	public ControladorGerarComanda(CadastroAtendimento cadastroAtendimento, CadastroComanda cadastroComanda) {
		this.cadastroAtendimento = cadastroAtendimento;
		this.cadastroComanda = cadastroComanda;
	}

	public List<Atendimento> listarAtendimentos(String nomePet) {
		return this.cadastroAtendimento.listar(nomePet);
	}

	public Comanda inserirComanda(Comanda comanda) {
		return this.cadastroComanda.inserir(comanda);
	}
}
