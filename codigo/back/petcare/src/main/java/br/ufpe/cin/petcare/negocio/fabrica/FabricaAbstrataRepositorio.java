package br.ufpe.cin.petcare.negocio.fabrica;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcare.dados.repositorio.usuario.InterfaceRepositorioUsuarios;

public interface FabricaAbstrataRepositorio {
    InterfaceRepositorioUsuarios criarRepositorioUsuarios(ApplicationContext context);
}
