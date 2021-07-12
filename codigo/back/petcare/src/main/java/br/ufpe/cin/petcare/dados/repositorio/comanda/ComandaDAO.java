package br.ufpe.cin.petcare.dados.repositorio.comanda;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.ufpe.cin.petcare.negocio.cadastro.comanda.Comanda;

@Repository
public interface ComandaDAO extends JpaRepository<Comanda, Long>{
    @Query("SELECT c FROM Comanda c WHERE pet_id = :petId")
    List<Comanda> buscarComandasPeloPetId(@Param("petId") Long petId);

    @Transactional
    @Modifying
    @Query("UPDATE Comanda SET data_vencimento = now(), encerrada = true WHERE Id = :Id")
    void encerrarComanda(@Param("Id") Long Id);
}
