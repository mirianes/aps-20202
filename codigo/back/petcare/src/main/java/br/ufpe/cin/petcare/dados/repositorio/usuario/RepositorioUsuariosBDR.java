package br.ufpe.cin.petcare.dados.repositorio.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;

@Component
public class RepositorioUsuariosBDR implements InterfaceRepositorioUsuarios {
    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public Usuario inserir(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    @Override
    public List<Usuario> buscarPeloEmail(String email) {
        return usuarioDAO.findByEmail(email);
    }
}
