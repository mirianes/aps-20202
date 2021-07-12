package br.ufpe.cin.petcare.comunicacao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.ufpe.cin.petcare.comunicacao.requestBody.comanda.BuscarComandaPeloPetIdBody;
import br.ufpe.cin.petcare.comunicacao.requestBody.comanda.EncerrarComandaBody;
import br.ufpe.cin.petcare.comunicacao.requestBody.pagamento.InserirPagamentoBody;
import br.ufpe.cin.petcare.negocio.cadastro.cartao.Cartao;
import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;
import br.ufpe.cin.petcare.negocio.cadastro.pagamento.Pagamento;
import br.ufpe.cin.petcare.negocio.fachada.Fachada;


@RestController
@RequestMapping("/pagamento")
public class PagamentoRestController {
    private Fachada fachada;

    @Autowired
    public PagamentoRestController(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }

    @PostMapping("buscarComandasPeloPetId")
    public List<Comanda> buscarComandasPeloPetId(@RequestBody BuscarComandaPeloPetIdBody body) throws Exception {
        Long petId = body.getPetId();

        return this.fachada.buscarComandasPeloPetId(petId);
    }

    @PostMapping("encerrarComanda")
    public void encerrarComanda(@RequestBody EncerrarComandaBody body) throws Exception {
        Long id = body.getId();

        this.fachada.encerrarComanda(id);
    }

    @PostMapping("inserirPagamento")
    public void inserirPagamento(@RequestBody InserirPagamentoBody body) throws Exception {
        Date data = body.getData();
        double valor = body.getValor();
        int numeroParcelas = body.getNumeroParcelas();
        Long comandaId = body.getComandaId();

        String titularCartao = body.getNomeTitular();
        String numeroCartao = body.getNumeroCartao();
        int codigoCartao = body.getCodigoCartao();
        String validadeCartao = body.getValidadeCartao();

        Cartao cartao = new Cartao(titularCartao, numeroCartao, codigoCartao, validadeCartao);

        Comanda comanda = this.fachada.buscarComanda(comandaId);

        Pagamento pagamento = new Pagamento(comanda, valor, numeroParcelas, data);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        
        map.add("payment", pagamento.toString());
        map.add("card", cartao.toString());

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8001/payCreditCard", request , String.class );
        System.out.println(response);

        this.fachada.inserirPagamento(pagamento);
    }
}
