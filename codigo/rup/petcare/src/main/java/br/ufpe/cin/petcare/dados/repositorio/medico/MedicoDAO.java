package br.ufpe.cin.petcare.dados.repositorio.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufpe.cin.petcare.negocio.cadastro.medico.Medico;

@Repository
public interface MedicoDAO extends JpaRepository<Medico, Long> {
    
}
