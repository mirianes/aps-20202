package br.ufpe.cin.petcare.negocio.cadastro.cartao;

public class Cartao {
    private String nomeTitular;
	private String numero;
	private int codigo;
	private String validade;

    public Cartao(String nomeTitular, String numero, int codigo, String validade) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.codigo = codigo;
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "{nomeTitular: "+nomeTitular+", numero: "+numero+", codigo: "+codigo+", validade: "+validade+"}";
    }
}
