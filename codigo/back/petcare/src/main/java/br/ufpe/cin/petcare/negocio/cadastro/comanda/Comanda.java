package br.ufpe.cin.petcare.negocio.cadastro.comanda;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;

@Entity
public class Comanda {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private String numero;
	@OneToOne
	private Usuario tutor;
	@OneToOne
	private Pet pet;
	@ManyToMany
	private List<Atendimento> atendimentos;
	private double valorTotal;
	private Date dataEntrada;
	private Date dataVencimento;
	private boolean encerrada;
	
	public Comanda(String numero, Usuario tutor, Pet pet, List<Atendimento> atendimentos, double valorTotal, Date dataEntrada, Date dataVencimento, boolean encerrada) {
		this.numero = numero;
		this.tutor = tutor;
		this.pet = pet;
		this.atendimentos = atendimentos;
		this.valorTotal = valorTotal;
		this.dataEntrada = dataEntrada;
		this.dataVencimento = dataVencimento;
		this.encerrada = encerrada;
	}

	public Comanda() {}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario getTutor() {
		return tutor;
	}

	public void setTutor(Usuario tutor) {
		this.tutor = tutor;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
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

	public boolean getEncerrada() {
		return this.encerrada;
	}

	public void setEncerrada(boolean encerrada) {
		this.encerrada = encerrada;
	}
}
