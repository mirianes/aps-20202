package br.ufpe.cin.petcare.dados.repositorio.atendimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;

@Component
public class RepositorioAtendimentosBDR implements InterfaceRepositorioAtendimentos{
	@Autowired
	private AtendimentoDAO atendimentoDAO;
	
	@Override
	public Atendimento inserir(Atendimento atendimento) {
		return this.atendimentoDAO.save(atendimento);
	}

	@Override
	public List<Atendimento> listar(String nomePet) {
		return this.atendimentoDAO.listar(nomePet);
	}

	@Override
	public List<Atendimento> listar(List<Long> IDs) {
		return this.atendimentoDAO.findAllById(IDs);
	}
}
