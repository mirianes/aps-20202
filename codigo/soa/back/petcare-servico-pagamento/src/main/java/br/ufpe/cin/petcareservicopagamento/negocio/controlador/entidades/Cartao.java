package br.ufpe.cin.petcareservicopagamento.negocio.controlador.entidades;

public class Cartao {
    private String numero;
    private String validade;
    private int codigoSeguranca;

    public Cartao(String numero, String validade, int codigoSeguranca){
        this.numero = numero;
        this.validade = validade;
        this.codigoSeguranca = codigoSeguranca;
    }
    
    public String getNumeroCartao() {
		return numero;
	}

	public String getValidadeCartao() {
		return validade;
	}

	public int getCodigoCartao() {
		return codigoSeguranca;
	}
	
	@Override
	public String toString() {
		return "{\"numero\": \""+ this.numero+"\", \"validade\": \""+this.validade+"\", \"codigoSeguranca\": "+this.codigoSeguranca+"}";
	}
}
