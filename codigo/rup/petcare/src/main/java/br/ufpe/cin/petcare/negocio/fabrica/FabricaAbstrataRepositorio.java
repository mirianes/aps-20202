package br.ufpe.cin.petcare.negocio.fabrica;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcare.dados.repositorio.atendimento.InterfaceRepositorioAtendimentos;
import br.ufpe.cin.petcare.dados.repositorio.comanda.InterfaceRepositorioComandas;
import br.ufpe.cin.petcare.dados.repositorio.medico.InterfaceRepositorioMedicos;
import br.ufpe.cin.petcare.dados.repositorio.pagamento.InterfaceRepositorioPagamentos;
import br.ufpe.cin.petcare.dados.repositorio.pet.InterfaceRepositorioPets;
import br.ufpe.cin.petcare.dados.repositorio.procedimento.InterfaceRepositorioProcedimentos;
import br.ufpe.cin.petcare.dados.repositorio.usuario.InterfaceRepositorioUsuarios;

public interface FabricaAbstrataRepositorio {
    InterfaceRepositorioUsuarios criarRepositorioUsuarios(ApplicationContext context);
    InterfaceRepositorioPets criarRepositorioPets(ApplicationContext context);
    InterfaceRepositorioAtendimentos criarRepositorioAtendimentos(ApplicationContext context);
    InterfaceRepositorioProcedimentos criarRepositorioProcedimentos(ApplicationContext context);
    InterfaceRepositorioMedicos criarRepositorioMedicos(ApplicationContext context);
    InterfaceRepositorioComandas criarRepositorioComandas(ApplicationContext context);
    InterfaceRepositorioPagamentos criarRepositorioPagamentos(ApplicationContext context);
}
