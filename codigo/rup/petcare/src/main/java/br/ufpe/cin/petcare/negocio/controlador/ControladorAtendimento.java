package br.ufpe.cin.petcare.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.cadastro.atendimento.CadastroAtendimento;

public class ControladorAtendimento {
	private CadastroAtendimento cadastroAtendimento;
	
	public ControladorAtendimento(CadastroAtendimento cadastroAtendimento) {
		this.cadastroAtendimento = cadastroAtendimento;
	}
	
	public Atendimento inserir(Atendimento atendimento) {
		return this.cadastroAtendimento.inserir(atendimento);
	}

	public List<Atendimento> listar(List<Long> IDs) {
		return this.cadastroAtendimento.listar(IDs);
	}
}
