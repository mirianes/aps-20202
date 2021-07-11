package br.ufpe.cin.petcare.negocio.cadastro.procedimento;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Procedimento {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private String protocolo;
	
	public Procedimento(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getNome() {
		return protocolo;
	}

	public void setNome(String protocolo) {
		this.protocolo = protocolo;
	}
}
