package br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades;

public class Procedimento {
    
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
