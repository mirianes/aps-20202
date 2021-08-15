package br.ufpe.cin.petcareservicoprocedimento.dados.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo.Procedimento;
import br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo.ProcedimentoDAO;

@Component
public class RepositorioProcedimentos implements InterfaceRepositorioProcedimentos {

    @Autowired
    public ProcedimentoDAO procedimentoDAO;

    @Override
    public List<Procedimento> listar(Long idPet) {
        return this.procedimentoDAO.buscarPeloIDPet(idPet);
    }
}
