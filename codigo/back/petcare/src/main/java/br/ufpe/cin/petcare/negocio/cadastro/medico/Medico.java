package br.ufpe.cin.petcare.negocio.cadastro.medico;

import javax.persistence.Id;

import br.ufpe.cin.petcare.negocio.cadastro.especialidade.Especialidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private String crm;
	private Especialidade[] especialidades;
	
	public Medico(String crm, Especialidade[] especialidades) {
		this.setCrm(crm);
		this.setEspecialidades(especialidades);
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Especialidade[] getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Especialidade[] especialidades) {
		this.especialidades = especialidades;
	}
}
