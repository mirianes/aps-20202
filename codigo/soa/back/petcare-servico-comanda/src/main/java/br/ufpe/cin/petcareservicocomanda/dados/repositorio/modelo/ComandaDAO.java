package br.ufpe.cin.petcareservicocomanda.dados.repositorio.modelo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ComandaDAO extends JpaRepository<Comanda, Long> {

    @Query("SELECT c FROM Comanda c WHERE id_pet = :idPet AND encerrada = false")
    List<Comanda> buscarPeloIDPet(@Param("idPet") Long idPet);

    @Transactional
    @Modifying
    @Query("UPDATE Comanda SET data_pagamento = now(), encerrada = true WHERE numero = :numero")
    void encerrar(@Param("numero") String numero);
}
