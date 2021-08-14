package br.ufpe.cin.petcare.comunicacao.requestBody.comanda;

import java.util.Date;
import java.util.List;

public class InserirComandaBody {
    private String token;
    private String numero;
    private Long tutorID;
    private Long petID;
    private List<Long> atendimentosIDs;
    private double valorTotal;
    private Date dataEntrada;
    private Date dataVencimento;

    public String getToken() {
        return this.token;
    }

    public String getNumero() {
        return this.numero;
    }

    public Long getTutorID() {
        return this.tutorID;
    }

    public Long getPetID() {
        return this.petID;
    }

    public List<Long> getAtendimentosIDs() {
        return this.atendimentosIDs;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public Date getDataEntrada() {
        return this.dataEntrada;
    }

    public Date getDataVencimento() {
        return this.dataVencimento;
    }
}
