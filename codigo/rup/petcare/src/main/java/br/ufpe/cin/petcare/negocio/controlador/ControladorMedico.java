package br.ufpe.cin.petcare.negocio.controlador;

import br.ufpe.cin.petcare.negocio.cadastro.medico.CadastroMedico;
import br.ufpe.cin.petcare.negocio.cadastro.medico.Medico;

public class ControladorMedico {
    private CadastroMedico cadastroMedico;

    public ControladorMedico(CadastroMedico cadastroMedico) {
        this.cadastroMedico = cadastroMedico;
    }

    public Medico buscar(Long ID) {
        return this.cadastroMedico.buscar(ID);
    }
}
