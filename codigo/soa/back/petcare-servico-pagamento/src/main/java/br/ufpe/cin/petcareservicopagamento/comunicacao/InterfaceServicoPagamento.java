package br.ufpe.cin.petcareservicopagamento.comunicacao;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcareservicopagamento.comunicacao.body.EfetuarPagamentoBody;
import br.ufpe.cin.petcareservicopagamento.dados.repositorio.modelo.Pagamento;
import br.ufpe.cin.petcareservicopagamento.negocio.controlador.entidades.Cartao;
import br.ufpe.cin.petcareservicopagamento.negocio.fachada.Fachada;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/pagamento")
@Slf4j
public class InterfaceServicoPagamento {

    private Fachada fachada;

    public InterfaceServicoPagamento(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }

    @PostMapping("/efetuarPagamento")
    public Pagamento efetuarPagamento(@RequestBody EfetuarPagamentoBody body) {
        Long numeroComanda = body.getNumeroComanda();
        double valor = body.getValor();
        int numeroParcelas = body.getNumeroParcelas();
        Date data = body.getData();
        String numeroCartao = body.getNumeroCartao();
        String validadeCartao = body.getValidadeCartao();
        int codigoCartao = body.getCodigoCartao();
        
        Cartao cartao = new Cartao(numeroCartao, validadeCartao, codigoCartao);

        Pagamento pagamento = new Pagamento(numeroComanda, valor, numeroParcelas, data);
        
        this.fachada.enviarPagamento(pagamento, cartao);
        
        Pagamento response = this.fachada.inserir(pagamento);
        
        this.fachada.encerrarComanda(numeroComanda);
        
        return response;
    }
}
