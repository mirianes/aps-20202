package br.ufpe.cin.petcare.negocio.fachada;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcare.dados.repositorio.pet.InterfaceRepositorioPets;
import br.ufpe.cin.petcare.dados.repositorio.usuario.InterfaceRepositorioUsuarios;
import br.ufpe.cin.petcare.negocio.cadastro.pet.CadastroPet;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.CadastroUsuario;

import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;
import br.ufpe.cin.petcare.negocio.controlador.ControladorPet;
import br.ufpe.cin.petcare.negocio.controlador.ControladorUsuario;
import br.ufpe.cin.petcare.negocio.fabrica.FabricaRepositorioBDR;

public class Fachada {
    private static Fachada instance;
    private ControladorUsuario controladorUsuario;
    private ControladorPet controladorPet;

    private Fachada(ApplicationContext context) {
        // Fábrica
        FabricaRepositorioBDR fabrica = new FabricaRepositorioBDR();

        // Usuário
        InterfaceRepositorioUsuarios repositorioUsuarios = fabrica.criarRepositorioUsuarios(context);
        CadastroUsuario cadastroUsuario = new CadastroUsuario(repositorioUsuarios);
        this.controladorUsuario = new ControladorUsuario(cadastroUsuario);

        // Pet
        InterfaceRepositorioPets repositorioPets = fabrica.criarRepositorioPets(context);
        CadastroPet cadastroPet = new CadastroPet(repositorioPets);
        this.controladorPet = new ControladorPet(cadastroPet);
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

    public Usuario buscarUsuario(Long id) {
        return this.controladorUsuario.buscar(id);
    }

    public Pet inserirPet(String token, Pet pet) throws Exception {
        if (token.equals("")) {
            throw new Exception("Token inválido.");
        } else {
            return this.controladorPet.inserir(pet);
        }
    }

    public List<Pet> buscarPet(String token, String nome) throws Exception {
        if (token.equals("")) {
            throw new Exception("Token inválido.");
        } else {
            return this.controladorPet.buscar(nome);
        }
    }
}
