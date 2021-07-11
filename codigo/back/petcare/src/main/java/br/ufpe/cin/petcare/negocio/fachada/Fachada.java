package br.ufpe.cin.petcare.negocio.fachada;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcare.dados.repositorio.usuario.InterfaceRepositorioUsuarios;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.CadastroUsuario;

import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;
import br.ufpe.cin.petcare.negocio.controlador.ControladorUsuario;
import br.ufpe.cin.petcare.negocio.fabrica.FabricaRepositorioBDR;

public class Fachada {
    private static Fachada instance;
    private ControladorUsuario controladorUsuario;

    private Fachada(ApplicationContext context) {
        InterfaceRepositorioUsuarios fabrica = new FabricaRepositorioBDR().criarRepositorioUsuarios(context);
        CadastroUsuario cadastroUsuario = new CadastroUsuario(fabrica);
        this.controladorUsuario = new ControladorUsuario(cadastroUsuario);
    }

    public static Fachada getInstance(ApplicationContext context) {
        if (instance == null) {
            instance = new Fachada(context);
        }

        return instance;
    }

    public Usuario inserirUsuario(Usuario usuario) {
        return this.controladorUsuario.inserir(usuario);
    }

    public String login(String email, String senha) throws Exception {
        return this.controladorUsuario.login(email, senha);
    }
}
