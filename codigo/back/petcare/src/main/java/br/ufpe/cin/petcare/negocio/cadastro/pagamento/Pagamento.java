package br.ufpe.cin.petcare.negocio.cadastro.pagamento;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;

@Entity
public class Pagamento {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	@ManyToOne
	private Comanda comanda;
	private double valor;
	private int numeroParcelas;
	private Date data;

	public Pagamento(Comanda comanda, double valor, int numeroParcelas, Date data) {
		this.comanda = comanda;
		this.valor = valor;
		this.numeroParcelas = numeroParcelas;
		this.data = data;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Comanda getComanda() {
		return comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
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
}
