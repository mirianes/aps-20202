package br.ufpe.cin.petcare.dados.repositorio.medico;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.petcare.negocio.cadastro.medico.Medico;

@Component
public class RepositorioMedicosBDR implements InterfaceRepositorioMedicos {
    @Autowired
    private MedicoDAO medicoDAO;

    @Override
    public Medico buscar(Long ID) {
        Optional<Medico> medico = this.medicoDAO.findById(ID);

        if (medico.isPresent()) {
            return medico.get();
        } else {
            return null;
        }
    }
}
