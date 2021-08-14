package br.ufpe.cin.petcareservicocomanda.negocio.controlador;

import java.util.List;

import br.ufpe.cin.petcareservicocomanda.dados.repositorio.InterfaceRepositorioComandas;
import br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo.Comanda;
import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Procedimento;

public class ControladorComanda {
    public InterfaceRepositorioComandas repositorioComandas;

    public ControladorComanda(InterfaceRepositorioComandas repositorioComandas) {
        this.repositorioComandas = repositorioComandas;
    }

    // public Comanda inserir(Long idUsuario, Long idPet, List<Procedimento> procedimentos) {
        
    // }
}
