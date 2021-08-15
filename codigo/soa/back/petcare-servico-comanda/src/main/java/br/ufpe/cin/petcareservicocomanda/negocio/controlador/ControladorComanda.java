package br.ufpe.cin.petcareservicocomanda.negocio.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import br.ufpe.cin.petcareservicocomanda.dados.repositorio.InterfaceRepositorioComandas;
import br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo.Comanda;
import br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades.Procedimento;

public class ControladorComanda {

    public InterfaceRepositorioComandas repositorioComandas;

    public ControladorComanda(InterfaceRepositorioComandas repositorioComandas) {
        this.repositorioComandas = repositorioComandas;
    }

    public Comanda inserir(Long idUsuario, Long idPet, List<Procedimento> listaProcedimentos) {
        String numero = UUID.randomUUID().toString();
        List<Long> idProcedimentos = new ArrayList<>();
        Double valorTotal = 0.0;
        Date data = new Date();

        for (Procedimento procedimento : listaProcedimentos) {
            idProcedimentos.add(procedimento.ID);
            valorTotal += procedimento.valor;
        }

        Comanda comanda = new Comanda(numero, idUsuario, idPet, idProcedimentos, valorTotal, data, data, null, false);

        return this.repositorioComandas.inserir(comanda);
    }

    public List<Comanda> listar(Long idPet) {
        return this.repositorioComandas.listar(idPet);
    }

    public void encerrar(String numeroComanda) {
        this.repositorioComandas.encerrar(numeroComanda);
    }
}
