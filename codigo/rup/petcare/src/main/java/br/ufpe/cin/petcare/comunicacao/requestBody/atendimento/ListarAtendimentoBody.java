package br.ufpe.cin.petcare.comunicacao.requestBody.atendimento;

public class ListarAtendimentoBody {
    private String token;
    private String nomePet;

    public String getToken() {
        return this.token;
    }

    public String getNomePet() {
        return this.nomePet;
    }
}
