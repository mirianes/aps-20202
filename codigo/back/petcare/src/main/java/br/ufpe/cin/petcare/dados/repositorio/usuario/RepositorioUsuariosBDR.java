package br.ufpe.cin.petcare.dados.repositorio.usuario;

import java.util.List;
import java.util.Optional;

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
    public List<Usuario> buscar(String email) {
        return usuarioDAO.findByEmail(email);
    }

    @Override
    public Usuario buscar(Long id) {
        Optional<Usuario> usuario = usuarioDAO.findById(id);

        if (usuario.isPresent()) {
            return usuario.get();
        } else {
            return null;
        }
    }
}
