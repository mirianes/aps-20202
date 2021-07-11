package br.ufpe.cin.petcare.dados.repositorio.procedimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.procedimento.Procedimento;

@Component
public class RepositorioProcedimentosBDR implements InterfaceRepositorioProcedimentos {
    @Autowired
    private ProcedimentoDAO procedimentoDAO;

    @Override
    public List<Procedimento> listar(List<Long> IDs) {
        return this.procedimentoDAO.findAllById(IDs);
    }
}
