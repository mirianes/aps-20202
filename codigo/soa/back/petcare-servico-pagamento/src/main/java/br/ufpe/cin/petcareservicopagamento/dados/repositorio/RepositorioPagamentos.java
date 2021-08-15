package br.ufpe.cin.petcareservicopagamento.dados.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcareservicopagamento.dados.repositorio.modelo.Pagamento;
import br.ufpe.cin.petcareservicopagamento.dados.repositorio.modelo.PagamentoDAO;

@Component
public class RepositorioPagamentos implements InterfaceRepositorioPagamentos {

    @Autowired
    public PagamentoDAO pagamentoDAO;

    @Override
    public Pagamento inserir(Pagamento pagamento) {
        return this.pagamentoDAO.save(pagamento);
    }
}
