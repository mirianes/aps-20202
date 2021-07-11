package br.ufpe.cin.petcare.dados.repositorio.usuario;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;

public interface InterfaceRepositorioUsuarios {
    public Usuario inserir(Usuario usuario);
    public List<Usuario> buscarPeloEmail(String email);
}
