package br.ufpe.cin.petcareservicoprocedimento.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.InterfaceRepositorioProcedimentos;
import br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo.Procedimento;

public class ControladorProcedimento {

    public InterfaceRepositorioProcedimentos repositorioProcedimentos;

    public ControladorProcedimento(InterfaceRepositorioProcedimentos repositorioProcedimentos) {
        this.repositorioProcedimentos = repositorioProcedimentos;
    }

    public List<Procedimento> listar(Long idPet) {
        return this.repositorioProcedimentos.listar(idPet);
    }
}
