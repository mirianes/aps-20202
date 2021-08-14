package br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Cliente;
import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Pet;
import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Procedimento;

@Entity
public class Comanda {

    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long ID;
	private String numero;
	@OneToOne
	private Cliente tutor;
	@OneToOne
	private Pet pet;
	@ManyToMany
	private List<Procedimento> procedimentos;
	private double valorTotal;
	private Date dataEntrada;
	private Date dataVencimento;
	private Date dataPagamento;
	private boolean encerrada;
	
	public Comanda(
		String numero, Cliente tutor, Pet pet, List<Procedimento> procedimentos, double valorTotal,
		Date dataEntrada, Date dataVencimento, Date dataPagamento, boolean encerrada
	) {
		this.numero = numero;
		this.tutor = tutor;
		this.pet = pet;
		this.procedimentos = procedimentos;
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

	public Cliente getTutor() {
		return tutor;
	}

	public void setTutor(Cliente tutor) {
		this.tutor = tutor;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public List<Procedimento> getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(List<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
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
