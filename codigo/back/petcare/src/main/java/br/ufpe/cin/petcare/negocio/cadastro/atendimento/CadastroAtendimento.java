package br.ufpe.cin.petcare.negocio.cadastro.atendimento;

import br.ufpe.cin.petcare.dados.repositorio.atendimento.InterfaceRepositorioAtendimentos;

public class CadastroAtendimento {
	private InterfaceRepositorioAtendimentos repositorioAtendimentos;
	
	public CadastroAtendimento(InterfaceRepositorioAtendimentos repositorioAtendimentos) {
		this.repositorioAtendimentos = repositorioAtendimentos;
	}
	
	public Atendimento inserir(Atendimento atendimento) {
		return this.repositorioAtendimentos.inserir(atendimento);
	}
}
