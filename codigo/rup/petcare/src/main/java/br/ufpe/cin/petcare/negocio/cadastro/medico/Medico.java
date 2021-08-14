package br.ufpe.cin.petcare.negocio.cadastro.medico;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.ufpe.cin.petcare.negocio.cadastro.especialidade.Especialidade;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long ID;
	private String crm;
	@OneToMany
	private List<Especialidade> especialidades;
	@OneToOne
	private Usuario usuario;
	
	public Medico(String crm, List<Especialidade> especialidades, Usuario usuario) {
		this.crm = crm;
		this.especialidades = especialidades;
		this.usuario = usuario;
	}

	public Medico() {}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
