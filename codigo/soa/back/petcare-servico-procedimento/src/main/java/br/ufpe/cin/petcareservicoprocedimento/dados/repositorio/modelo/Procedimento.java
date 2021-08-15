package br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Procedimento {
    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long ID;
    public String protocolo;
    public Long idPet;
    public boolean concluido;
    public double valor;
    public boolean pago;

    public Procedimento(Long ID, String protocolo, Long idPet, boolean concluido, double valor, boolean pago) {
        this.ID = ID;
        this.protocolo = protocolo;
        this.idPet = idPet;
        this.concluido = concluido;
        this.valor = valor;
        this.pago = pago;
    }

    public Procedimento() {}

    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getProtocolo() {
        return this.protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Long getIDPet() {
        return this.idPet;
    }

    public void setIDPet(Long idPet) {
        this.idPet = idPet;
    }

    public boolean getConcluido() {
        return this.concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean getPago() {
        return this.pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
