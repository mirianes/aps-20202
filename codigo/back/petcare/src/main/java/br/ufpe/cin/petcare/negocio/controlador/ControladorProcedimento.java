package br.ufpe.cin.petcare.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.procedimento.CadastroProcedimento;
import br.ufpe.cin.petcare.negocio.cadastro.procedimento.Procedimento;

public class ControladorProcedimento {
    private CadastroProcedimento cadastroProcedimento;

    public ControladorProcedimento(CadastroProcedimento cadastroProcedimento) {
        this.cadastroProcedimento = cadastroProcedimento;
    }

    public List<Procedimento> listar(List<Long> IDs) {
        return this.cadastroProcedimento.listar(IDs);
    }
}
