package br.ufpe.cin.petcareservicocomanda.dados.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo.Comanda;
import br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo.ComandaDAO;

@Component
public class RepositorioComandas implements InterfaceRepositorioComandas {

    @Autowired
    public ComandaDAO comandaDAO;

    @Override
    public Comanda inserir(Comanda comanda) {
        return this.comandaDAO.save(comanda);
    }

    @Override
    public List<Comanda> listar(Long idPet) {
        return this.comandaDAO.buscarPeloIDPet(idPet);
    }

    @Override
    public void encerrar(String numeroComanda) {
        this.comandaDAO.encerrar(numeroComanda);
    }
}
