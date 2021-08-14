package br.ufpe.cin.petcare.comunicacao.requestBody.pagamento;

import java.util.Date;

public class InserirPagamentoBody {
    private Date data;
    private int numeroParcelas;
    private double valor;
    private Long comandaId;
    private String numeroCartao;
    private String validadeCartao;
    private int codigoCartao;
    private String nomeTitular;

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

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public int getCodigoCartao() {
        return codigoCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
}
