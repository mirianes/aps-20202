package br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ComandaDAO extends JpaRepository<Comanda, Long> {

    @Query("SELECT c FROM Comanda c WHERE pet_id = :idPet")
    List<Comanda> buscarComandasPeloIDPet(@Param("idPet") Long idPet);

    @Transactional
    @Modifying
    @Query("UPDATE Comanda SET data_pagamento = now(), encerrada = true WHERE numero = :numero")
    void encerrarComanda(@Param("numero") String numero);
}
