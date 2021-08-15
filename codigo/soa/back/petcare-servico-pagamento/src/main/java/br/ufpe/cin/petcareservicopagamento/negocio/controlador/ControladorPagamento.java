package br.ufpe.cin.petcareservicopagamento.negocio.controlador;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import br.ufpe.cin.petcareservicopagamento.dados.repositorio.InterfaceRepositorioPagamentos;
import br.ufpe.cin.petcareservicopagamento.dados.repositorio.modelo.Pagamento;
import br.ufpe.cin.petcareservicopagamento.negocio.controlador.entidades.Cartao;

public class ControladorPagamento {

    public InterfaceRepositorioPagamentos repositorioPagamentos;

    public ControladorPagamento(InterfaceRepositorioPagamentos repositorioPagamentos) {
        this.repositorioPagamentos = repositorioPagamentos;
    }

    public Pagamento inserir(Pagamento pagamento) {
        return this.repositorioPagamentos.inserir(pagamento);
    }
    
    public boolean enviarPagamento(Pagamento pagamento, Cartao cartao) {
    	HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        
        map.add("payment", pagamento.toString());
        map.add("card", cartao.toString());

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8001/verifyCreditCard", request , String.class );
        
    	return response.getStatusCodeValue() == HttpStatus.OK.value();
    }
}
