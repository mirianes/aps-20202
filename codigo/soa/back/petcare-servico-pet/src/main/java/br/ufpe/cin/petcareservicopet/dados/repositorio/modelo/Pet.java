package br.ufpe.cin.petcareservicopet.dados.repositorio.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long ID;
    public String nome;
    public Date dataNascimento;
    public Long idTutor;
    public String tipo;
    public String sexo;

    public Pet(Long ID, String nome, Date dataNascimento, Long idTutor, String tipo, String sexo) {
        this.ID = ID;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idTutor = idTutor;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public Pet() {}

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

    public Long getIDTutor() {
        return this.idTutor;
    }

    public void setIDTutor(Long idTutor) {
        this.idTutor = idTutor;
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
