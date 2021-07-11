package br.ufpe.cin.petcare.negocio.cadastro.usuario;

import java.util.List;

import br.ufpe.cin.petcare.dados.repositorio.usuario.InterfaceRepositorioUsuarios;

public class CadastroUsuario {
    private InterfaceRepositorioUsuarios repositorioUsuarios;

    public CadastroUsuario(InterfaceRepositorioUsuarios repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    public Usuario inserir(Usuario usuario) {
        return this.repositorioUsuarios.inserir(usuario);
    }

    public List<Usuario> buscarPeloEmail(String email) {
        return this.repositorioUsuarios.buscarPeloEmail(email);
    }
}
