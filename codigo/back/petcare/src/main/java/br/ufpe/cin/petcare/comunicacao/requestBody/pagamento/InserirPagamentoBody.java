package br.ufpe.cin.petcare.comunicacao.requestBody.pagamento;

import java.util.Date;

public class InserirPagamentoBody {
    private Date data;
    private int numeroParcelas;
    private double valor;
    private Long comandaId;

    public Date getData() {
        return data;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public double getValor() {
        return valor;
    }

    public Long getComandaId() {
        return comandaId;
    }
}
