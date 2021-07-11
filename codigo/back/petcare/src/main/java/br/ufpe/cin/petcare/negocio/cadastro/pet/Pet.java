package br.ufpe.cin.petcare.negocio.cadastro.pet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;

@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long ID;
	private String nome;
	private Date dataNascimento;
	private Usuario tutor;
	
	public Pet(String nome, Date dataNascimento, Usuario tutor) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setTutor(tutor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Usuario getTutor() {
		return tutor;
	}

	public void setTutor(Usuario tutor) {
		this.tutor = tutor;
	}
}
