package br.ufpe.cin.petcare.negocio.cadastro.atendimento;

import java.util.List;

import br.ufpe.cin.petcare.dados.repositorio.atendimento.InterfaceRepositorioAtendimentos;

public class CadastroAtendimento {
	private InterfaceRepositorioAtendimentos repositorioAtendimentos;
	
	public CadastroAtendimento(InterfaceRepositorioAtendimentos repositorioAtendimentos) {
		this.repositorioAtendimentos = repositorioAtendimentos;
	}
	
	public Atendimento inserir(Atendimento atendimento) {
		return this.repositorioAtendimentos.inserir(atendimento);
	}

	public List<Atendimento> listar(String nomePet) {
		return this.repositorioAtendimentos.listar(nomePet);
	}
}
