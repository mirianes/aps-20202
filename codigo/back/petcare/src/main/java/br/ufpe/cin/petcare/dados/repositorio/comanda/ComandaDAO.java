package br.ufpe.cin.petcare.dados.repositorio.comanda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;

@Repository
public interface ComandaDAO extends JpaRepository<Comanda, Long>{

}
