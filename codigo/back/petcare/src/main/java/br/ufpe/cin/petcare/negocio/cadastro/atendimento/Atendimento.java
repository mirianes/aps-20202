package br.ufpe.cin.petcare.negocio.cadastro.atendimento;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import br.ufpe.cin.petcare.negocio.cadastro.medico.Medico;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;
import br.ufpe.cin.petcare.negocio.cadastro.procedimento.Procedimento;

@Entity
public class Atendimento {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long ID;
	@OneToOne
	private Pet pet;
	@ManyToMany
	private List<Procedimento> procedimentos;
	@OneToOne
	private Medico veterinario;
	private Date dataAtendimento;
	private boolean pago;
	private double valor;
	
	public Atendimento(Pet pet, List<Procedimento> procedimentos, Medico veterinario, Date dataAtendimento, boolean pago, double valor) {
		this.pet = pet;
		this.procedimentos = procedimentos;
		this.veterinario = veterinario;
		this.dataAtendimento = dataAtendimento;
		this.pago = pago;
		this.valor = valor;
	}
	
	public Atendimento() {}

	public Long getID() {
		return ID;
	}
	
	public void setID(Long iD) {
		ID = iD;
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
	
	public Medico getVeterinario() {
		return veterinario;
	}
	
	public void setVeterinario(Medico veterinario) {
		this.veterinario = veterinario;
	}
	
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	
	public boolean isPago() {
		return pago;
	}
	
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
