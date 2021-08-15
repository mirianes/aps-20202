package br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exame extends Procedimento {
    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long ID;
    public String tipo;
    public Long idMedicoSolicitante;
    public Date dataSolicitacao;
    public Date dataRealizacao;

    public Exame(String tipo, Long idMedicoSolicitante, Date dataSolicitacao, Date dataRealizacao) {
        this.tipo = tipo;
        this.idMedicoSolicitante = idMedicoSolicitante;
        this.dataSolicitacao = dataSolicitacao;
        this.dataRealizacao = dataRealizacao;
    }

    public Exame() {}

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getIDMedicoSolicitante() {
        return this.idMedicoSolicitante;
    }

    public void setIDMedicoSolicitante(Long idMedicoSolicitante) {
        this.idMedicoSolicitante = idMedicoSolicitante;
    }

    public Date getDataSolicitacao() {
        return this.dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Date getDataRealizacao() {
        return this.dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }
}
