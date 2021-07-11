package br.ufpe.cin.petcare.negocio.cadastro.procedimento;

import java.util.List;

import br.ufpe.cin.petcare.dados.repositorio.procedimento.InterfaceRepositorioProcedimentos;

public class CadastroProcedimento {
    private InterfaceRepositorioProcedimentos repositorioProcedimentos;

    public CadastroProcedimento(InterfaceRepositorioProcedimentos repositorioProcedimentos) {
        this.repositorioProcedimentos = repositorioProcedimentos;
    }

    public List<Procedimento> listar(List<Long> IDs) {
        return this.repositorioProcedimentos.listar(IDs);
    }
}
