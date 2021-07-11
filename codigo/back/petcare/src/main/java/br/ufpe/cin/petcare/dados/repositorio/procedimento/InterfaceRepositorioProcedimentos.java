package br.ufpe.cin.petcare.dados.repositorio.procedimento;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.procedimento.Procedimento;

public interface InterfaceRepositorioProcedimentos {
    public List<Procedimento> listar(List<Long> IDs);
}
