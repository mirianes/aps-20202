package br.ufpe.cin.petcare.comunicacao.requestBody.pet;

import java.util.Date;

public class InserirPetBody {
    private String token;
    private String nome;
    private Date dataNascimento;
    private Long tutorID;

    public String getToken() {
        return this.token;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public Long getTutorID() {
        return this.tutorID;
    }
}
