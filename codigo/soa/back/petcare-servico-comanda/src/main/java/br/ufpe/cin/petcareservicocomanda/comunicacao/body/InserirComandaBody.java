package br.ufpe.cin.petcareservicocomanda.comunicacao.body;

import java.util.List;

import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Procedimento;

public class InserirComandaBody {
    public Long idUsuario;
    public Long idPet;
    public List<Procedimento> listaProcedimentos;

    public Long getIDUsuario() {
        return this.idUsuario;
    }

    public Long getIDPet() {
        return this.idPet;
    }

    public List<Procedimento> getListaProcedimentos() {
        return this.listaProcedimentos;
    }
}
