package br.ufpe.cin.petcare.dados.repositorio.atendimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;

@Component
public class RepositorioAtendimentosBDR implements InterfaceRepositorioAtendimentos{
	
	@Autowired
	private AtendimentoDAO atendimentoDAO;
	
	@Override
	public Atendimento inserir(Atendimento atendimento) {
		return atendimentoDAO.save(atendimento);
	}
}
