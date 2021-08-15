package br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comanda {

    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long ID;
	private String numero;
	private Long idTutor;
	private Long idPet;
	@ElementCollection
	private List<Long> idProcedimentos;
	private double valorTotal;
	private Date dataEntrada;
	private Date dataVencimento;
	private Date dataPagamento;
	private boolean encerrada;
	
	public Comanda(
		String numero, Long idTutor, Long idPet, List<Long> idProcedimentos, double valorTotal,
		Date dataEntrada, Date dataVencimento, Date dataPagamento, boolean encerrada
	) {
		this.numero = numero;
		this.idTutor = idTutor;
		this.idPet = idPet;
		this.idProcedimentos = idProcedimentos;
		this.valorTotal = valorTotal;
		this.dataEntrada = dataEntrada;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.encerrada = encerrada;
	}

	public Comanda() {}

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Long getIDTutor() {
		return idTutor;
	}

	public void setIDTutor(Long idTutor) {
		this.idTutor = idTutor;
	}

	public Long getIDPet() {
		return idPet;
	}

	public void setIDPet(Long idPet) {
		this.idPet = idPet;
	}

	public List<Long> getIDProcedimentos() {
		return idProcedimentos;
	}

	public void setIDProcedimentos(List<Long> idProcedimentos) {
		this.idProcedimentos = idProcedimentos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public boolean getEncerrada() {
		return this.encerrada;
	}

	public void setEncerrada(boolean encerrada) {
		this.encerrada = encerrada;
	}
}
