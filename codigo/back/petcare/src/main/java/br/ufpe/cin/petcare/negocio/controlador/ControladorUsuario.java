package br.ufpe.cin.petcare.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcare.negocio.cadastro.usuario.CadastroUsuario;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;
// import br.ufpe.cin.petcare.negocio.fabrica.FabricaAbstrataRepositorio;

public class ControladorUsuario {
    private CadastroUsuario cadastroUsuario;

    public ControladorUsuario(CadastroUsuario cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }

    public Usuario inserir(Usuario usuario) {
        return this.cadastroUsuario.inserir(usuario);
    }

    public String login(String email, String senha) throws Exception {
        String token = "";
        List<Usuario> usuarios = this.cadastroUsuario.buscarPeloEmail(email);

        if (usuarios.size() == 0) {
            throw new Exception("Não existe um usuário com o e-mail informado.");
        }

        for (Usuario usuario : usuarios) {
            if (usuario.getSenha().equals(senha)) {
                token = usuario.getNome().replaceAll(" ", "") + usuario.getEmail() + usuario.getCPF();
                break;
            } else {
                throw new Exception("E-mail ou senha incorretos.");
            }
        }

        return token;
    }
}
