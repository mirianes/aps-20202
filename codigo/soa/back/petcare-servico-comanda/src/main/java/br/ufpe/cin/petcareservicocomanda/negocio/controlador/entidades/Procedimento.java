package br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Procedimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long ID;
    public String protocolo;
    @OneToOne
    public Pet pet;
    public boolean concluido;
    public boolean pago;

    public Procedimento(Long ID, String protocolo, Pet pet, boolean concluido, boolean pago) {
        this.ID = ID;
        this.protocolo = protocolo;
        this.pet = pet;
        this.concluido = concluido;
        this.pago = pago;
    }

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

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public boolean getConcluido() {
        return this.concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public boolean getPago() {
        return this.pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
