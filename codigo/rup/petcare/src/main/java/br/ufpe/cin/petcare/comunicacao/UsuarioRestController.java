package br.ufpe.cin.petcare.comunicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;
import br.ufpe.cin.petcare.negocio.fachada.Fachada;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {
    private Fachada fachada;
    
    @Autowired
    public UsuarioRestController(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }

    @PostMapping("inserir")
    public Usuario inserirUsuario(@RequestBody Usuario body) {
        String nome = body.getNome();
        String email = body.getEmail();
        String senha = body.getSenha();
        String cpf = body.getCPF();

        Usuario usuario = new Usuario(nome, email, senha, cpf);

        return this.fachada.inserirUsuario(usuario);
    }

    @PostMapping("login")
    public String login(@RequestBody Usuario body) {
        try {
            String email = body.getEmail();
            String senha = body.getSenha();
            
            return this.fachada.login(email, senha);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
