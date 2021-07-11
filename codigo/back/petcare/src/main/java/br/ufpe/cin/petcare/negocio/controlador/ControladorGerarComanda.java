package br.ufpe.cin.petcare.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.cadastro.atendimento.CadastroAtendimento;

public class ControladorGerarComanda {
	private CadastroAtendimento cadastroAtendimento;
	
	public ControladorGerarComanda(CadastroAtendimento cadastroAtendimento) {
		this.cadastroAtendimento = cadastroAtendimento;
	}

	public List<Atendimento> listarAtendimentos(String nomePet) {
		return this.cadastroAtendimento.listar(nomePet);
	}
}
