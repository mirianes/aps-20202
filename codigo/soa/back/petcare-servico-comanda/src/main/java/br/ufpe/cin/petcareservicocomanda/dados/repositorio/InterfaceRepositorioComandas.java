package br.ufpe.cin.petcareservicocomanda.dados.repositorio;

import java.util.List;

import br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo.Comanda;

public interface InterfaceRepositorioComandas {
    
    public Comanda inserir(Comanda comanda);
    public List<Comanda> listar(Long idPet);
    public void encerrar(String numeroComanda);
}
