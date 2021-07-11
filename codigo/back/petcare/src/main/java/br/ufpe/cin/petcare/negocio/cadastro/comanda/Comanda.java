package br.ufpe.cin.petcare.negocio.cadastro.comanda;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.ufpe.cin.petcare.negocio.cadastro.atendimento.Atendimento;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;

@Entity
public class Comanda {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private String numero;
	private Usuario tutor;
	private Pet pet;
	private Atendimento[] atendimentos;
	private double totalValue;
	private Date dataEntrada;
	private Date dataVencimento;
	
	public Comanda(String numero, Usuario tutor, Pet pet, Atendimento[] atendimentos, double totalValue, Date dataEntrada, Date dataVencimento) {
		this.numero = numero;
		this.tutor = tutor;
		this.pet = pet;
		this.atendimentos = atendimentos;
		this.totalValue = totalValue;
		this.dataEntrada = dataEntrada;
		this.dataVencimento = dataVencimento;
	}

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

	public Atendimento[] getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(Atendimento[] atendimentos) {
		this.atendimentos = atendimentos;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
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
}
