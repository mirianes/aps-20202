package br.ufpe.cin.petcare.negocio.fabrica;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcare.dados.repositorio.atendimento.InterfaceRepositorioAtendimentos;
import br.ufpe.cin.petcare.dados.repositorio.medico.InterfaceRepositorioMedicos;
import br.ufpe.cin.petcare.dados.repositorio.pet.InterfaceRepositorioPets;
import br.ufpe.cin.petcare.dados.repositorio.procedimento.InterfaceRepositorioProcedimentos;
import br.ufpe.cin.petcare.dados.repositorio.usuario.InterfaceRepositorioUsuarios;

public class FabricaRepositorioBDR implements FabricaAbstrataRepositorio {
    @Override
    public InterfaceRepositorioUsuarios criarRepositorioUsuarios(ApplicationContext context) {
        return (InterfaceRepositorioUsuarios) context.getBean("repositorioUsuariosBDR");
    }

    @Override
    public InterfaceRepositorioPets criarRepositorioPets(ApplicationContext context) {
        return (InterfaceRepositorioPets) context.getBean("repositorioPetsBDR");
    }

    @Override
    public InterfaceRepositorioAtendimentos criarRepositorioAtendimentos(ApplicationContext context) {
        return (InterfaceRepositorioAtendimentos) context.getBean("repositorioAtendimentosBDR");
    }

    @Override
    public InterfaceRepositorioProcedimentos criarRepositorioProcedimentos(ApplicationContext context) {
        return (InterfaceRepositorioProcedimentos) context.getBean("repositorioProcedimentosBDR");
    }

    @Override
    public InterfaceRepositorioMedicos criarRepositorioMedicos(ApplicationContext context) {
        return (InterfaceRepositorioMedicos) context.getBean("repositorioMedicosBDR");
    }
}
