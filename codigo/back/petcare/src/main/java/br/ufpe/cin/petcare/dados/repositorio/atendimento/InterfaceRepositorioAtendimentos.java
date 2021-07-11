package br.ufpe.cin.petcare.dados.repositorio.atendimento;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;

public interface InterfaceRepositorioAtendimentos {
	public Atendimento inserir(Atendimento atendimento);
	public List<Atendimento> listar(String nomePet);
	public List<Atendimento> listar(List<Long> IDs);
}
