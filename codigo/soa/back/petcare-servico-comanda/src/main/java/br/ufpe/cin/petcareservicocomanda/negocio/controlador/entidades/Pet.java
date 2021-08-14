package br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long ID;
    public String nome;
    public Date dataNascimento;
    @OneToOne
    public Cliente tutor;
    public String tipo;
    public String sexo;

    public Pet(Long ID, String nome, Date dataNascimento, Cliente tutor, String tipo, String sexo) {
        this.ID = ID;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tutor = tutor;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cliente getTutor() {
        return this.tutor;
    }

    public void setTutor(Cliente tutor) {
        this.tutor = tutor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
