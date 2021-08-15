package br.ufpe.cin.petcareservicopagamento.comunicacao.body;

import java.util.Date;

public class EfetuarPagamentoBody {
    private Long idComanda;
    private double valor;
    private int numeroParcelas;
    private Date data;
    private String numeroCartao;
    private String validadeCartao;
    private int codigoCartao;

    public Long getIdComanda() {
        return this.idComanda;
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

	public double getValor() {
		return this.valor;
	}

    public int getNumeroParcelas() {
		return this.numeroParcelas;
	}

	public Date getData() {
		return this.data;
	}
}
