package br.ufpe.cin.petcareservicoprocedimento.dados.repositorio;

import java.util.List;

import br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo.Procedimento;

public interface InterfaceRepositorioProcedimentos {
    
    public List<Procedimento> listar(Long idPet);
}
