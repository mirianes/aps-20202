package br.ufpe.cin.petcareservicopagamento.dados.repositorio.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamento {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private Long numeroComanda;
	private double valor;
	private int numeroParcelas;
	private Date data;

	public Pagamento(Long numeroComanda, double valor, int numeroParcelas, Date data) {
		this.numeroComanda = numeroComanda;
		this.valor = valor;
		this.numeroParcelas = numeroParcelas;
		this.data = data;
	}

	public Long getId() {
		return Id;
	}

	public Long getIdComanda() {
		return numeroComanda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "{valor: "+valor+", numeroParcelas: "+numeroParcelas+"}";
	}
}
