package br.ufpe.cin.petcare.comunicacao.requestBody.pet;

public class BuscarPetNomeBody {
    private String token;
    private String nome;

    public String getToken() {
        return this.token;
    }

    public String getNome() {
        return this.nome;
    }
}
