package br.ufpe.cin.petcare.negocio.fachada;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcare.dados.repositorio.atendimento.InterfaceRepositorioAtendimentos;
import br.ufpe.cin.petcare.dados.repositorio.comanda.InterfaceRepositorioComandas;
import br.ufpe.cin.petcare.dados.repositorio.medico.InterfaceRepositorioMedicos;
import br.ufpe.cin.petcare.dados.repositorio.pagamento.InterfaceRepositorioPagamentos;
import br.ufpe.cin.petcare.dados.repositorio.pet.InterfaceRepositorioPets;
import br.ufpe.cin.petcare.dados.repositorio.procedimento.InterfaceRepositorioProcedimentos;
import br.ufpe.cin.petcare.dados.repositorio.usuario.InterfaceRepositorioUsuarios;
import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.cadastro.atendimento.CadastroAtendimento;
import br.ufpe.cin.petcare.negocio.cadastro.comanda.CadastroComanda;
import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;
import br.ufpe.cin.petcare.negocio.cadastro.medico.CadastroMedico;
import br.ufpe.cin.petcare.negocio.cadastro.medico.Medico;
import br.ufpe.cin.petcare.negocio.cadastro.pagamento.CadastroPagamento;
import br.ufpe.cin.petcare.negocio.cadastro.pagamento.Pagamento;
import br.ufpe.cin.petcare.negocio.cadastro.pet.CadastroPet;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;
import br.ufpe.cin.petcare.negocio.cadastro.procedimento.CadastroProcedimento;
import br.ufpe.cin.petcare.negocio.cadastro.procedimento.Procedimento;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.CadastroUsuario;

import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;
import br.ufpe.cin.petcare.negocio.controlador.ControladorAtendimento;
import br.ufpe.cin.petcare.negocio.controlador.ControladorComanda;
import br.ufpe.cin.petcare.negocio.controlador.ControladorGerarComanda;
import br.ufpe.cin.petcare.negocio.controlador.ControladorMedico;
import br.ufpe.cin.petcare.negocio.controlador.ControladorPagamento;
import br.ufpe.cin.petcare.negocio.controlador.ControladorPet;
import br.ufpe.cin.petcare.negocio.controlador.ControladorProcedimento;
import br.ufpe.cin.petcare.negocio.controlador.ControladorUsuario;
import br.ufpe.cin.petcare.negocio.fabrica.FabricaAbstrataRepositorio;
import br.ufpe.cin.petcare.negocio.fabrica.FabricaRepositorioBDR;

public class Fachada {
    private static Fachada instance;
    private ControladorUsuario controladorUsuario;
    private ControladorPet controladorPet;
    private ControladorAtendimento controladorAtendimento;
    private ControladorGerarComanda controladorGerarComanda;
    private ControladorProcedimento controladorProcedimento;
    private ControladorMedico controladorMedico;
    private ControladorComanda controladorComanda;
    private ControladorPagamento controladorPagamento;

    private Fachada(ApplicationContext context) {
        // Fábrica
        FabricaAbstrataRepositorio fabrica = new FabricaRepositorioBDR();

        // Usuário
        InterfaceRepositorioUsuarios repositorioUsuarios = fabrica.criarRepositorioUsuarios(context);
        CadastroUsuario cadastroUsuario = new CadastroUsuario(repositorioUsuarios);
        this.controladorUsuario = new ControladorUsuario(cadastroUsuario);

        // Pet
        InterfaceRepositorioPets repositorioPets = fabrica.criarRepositorioPets(context);
        CadastroPet cadastroPet = new CadastroPet(repositorioPets);
        this.controladorPet = new ControladorPet(cadastroPet);

        // Atendimento
        InterfaceRepositorioAtendimentos repositorioAtendimentos = fabrica.criarRepositorioAtendimentos(context);
        CadastroAtendimento cadastroAtendimento = new CadastroAtendimento(repositorioAtendimentos);
        this.controladorAtendimento = new ControladorAtendimento(cadastroAtendimento);

        // Comanda
        InterfaceRepositorioComandas repositorioComandas = fabrica.criarRepositorioComandas(context);
        CadastroComanda cadastroComanda = new CadastroComanda(repositorioComandas);

        // Gerar Comanda
        this.controladorGerarComanda = new ControladorGerarComanda(cadastroAtendimento, cadastroComanda);

        // Procedimentos
        InterfaceRepositorioProcedimentos repositorioProcedimentos = fabrica.criarRepositorioProcedimentos(context);
        CadastroProcedimento cadastroProcedimento = new CadastroProcedimento(repositorioProcedimentos);
        this.controladorProcedimento = new ControladorProcedimento(cadastroProcedimento);

        // Medicos
        InterfaceRepositorioMedicos repositorioMedicos = fabrica.criarRepositorioMedicos(context);
        CadastroMedico cadastroMedico = new CadastroMedico(repositorioMedicos);
        this.controladorMedico = new ControladorMedico(cadastroMedico);

        // Comanda
        this.controladorComanda = new ControladorComanda(cadastroComanda);

        // Pagamento
        InterfaceRepositorioPagamentos repositorioPagamentos = fabrica.criarRepositorioPagamentos(context);
        CadastroPagamento cadastroPagamento = new CadastroPagamento(repositorioPagamentos);
        this.controladorPagamento = new ControladorPagamento(cadastroPagamento);
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

    public Pet buscarPet(Long ID) {
        return this.controladorPet.buscar(ID);
    }

    public Atendimento inserirAtendimento(String token, Atendimento atendimento) throws Exception {
        if (token.equals("")) {
            throw new Exception("Token inválido.");
        } else {
            return this.controladorAtendimento.inserir(atendimento);
        }
    }

    public List<Atendimento> listarAtendimentos(String token, String nomePet) throws Exception {
        if (token.equals("")) {
            throw new Exception("Token inválido.");
        } else {
            return this.controladorGerarComanda.listarAtendimentos(nomePet);
        }
    }

    public List<Atendimento> listarAtendimentos(List<Long> IDs) {
        return this.controladorAtendimento.listar(IDs);
    }

    public Comanda inserirComanda(String token, Comanda comanda) throws Exception {
        if (token.equals("")) {
            throw new Exception("Token inválido.");
        } else {
            return this.controladorGerarComanda.inserirComanda(comanda);
        }
    }

    public List<Procedimento> listarProcedimentos(List<Long> procedimentosIDs) {
        return this.controladorProcedimento.listar(procedimentosIDs);
    }

    public Medico buscarMedico(Long ID) {
        return this.controladorMedico.buscar(ID);
    }

    public List<Comanda> buscarComandasPeloPetId(Long petId) {
        return this.controladorComanda.buscarComandasPeloPetId(petId);
    }

    public void encerrarComanda(Long Id) {
        this.controladorComanda.encerrarComanda(Id);
    }

    public Pagamento inserirPagamento(Pagamento pagamento) {
        return this.controladorPagamento.inserir(pagamento);
    }

    public Comanda buscarComanda(Long id) {
        return this.controladorComanda.buscarComanda(id);
    }
}
