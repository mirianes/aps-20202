package br.ufpe.cin.petcare.comunicacao.requestBody.atendimento;

import java.util.Date;
import java.util.List;

public class InserirAtendimentoBody {
    private String token;
    private Long petID;
    private List<Long> procedimentosIDs;
    private Long veterinarioID;
    private Date dataAtendimento;
    private double valor;

    public String getToken() {
        return this.token;
    }

    public Long getPetID() {
        return this.petID;
    }

    public List<Long> getProcedimentosIDs() {
        return this.procedimentosIDs;
    }

    public Long getVeterinarioID() {
        return this.veterinarioID;
    }

    public Date getDataAtendimento() {
        return this.dataAtendimento;
    }

    public double getValor() {
        return this.valor;
    }
}
