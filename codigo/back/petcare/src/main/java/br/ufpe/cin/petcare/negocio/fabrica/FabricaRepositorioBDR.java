package br.ufpe.cin.petcare.negocio.fabrica;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcare.dados.repositorio.usuario.InterfaceRepositorioUsuarios;

public class FabricaRepositorioBDR implements FabricaAbstrataRepositorio {
    @Override
    public InterfaceRepositorioUsuarios criarRepositorioUsuarios(ApplicationContext context) {
        return (InterfaceRepositorioUsuarios) context.getBean("repositorioUsuariosBDR");
    }
}
