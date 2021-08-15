package br.ufpe.cin.petcareservicopagamento.negocio.fachada;

import org.springframework.context.ApplicationContext;

import br.ufpe.cin.petcareservicopagamento.dados.repositorio.InterfaceRepositorioPagamentos;
import br.ufpe.cin.petcareservicopagamento.dados.repositorio.modelo.Pagamento;
import br.ufpe.cin.petcareservicopagamento.negocio.controlador.ControladorPagamento;
import br.ufpe.cin.petcareservicopagamento.negocio.controlador.entidades.Cartao;

public class Fachada {
    
    private static Fachada instance;
    private ControladorPagamento controladorPagamento;

    private Fachada(ApplicationContext context) {
        InterfaceRepositorioPagamentos repositorioPagamentos = (InterfaceRepositorioPagamentos) context.getBean("repositorioPagamentos");
        this.controladorPagamento = new ControladorPagamento(repositorioPagamentos);
    }

    public static Fachada getInstance(ApplicationContext context) {
        if (instance == null) {
            instance = new Fachada(context);
        }

        return instance;
    }

    public Pagamento inserir(Pagamento pagamento) {
        return this.controladorPagamento.inserir(pagamento);
    }
    
    public boolean enviarPagamento(Pagamento pagamento, Cartao cartao) {
    	return this.controladorPagamento.enviarPagamento(pagamento, cartao);
    }
}
