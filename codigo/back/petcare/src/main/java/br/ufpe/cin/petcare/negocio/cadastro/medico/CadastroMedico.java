package br.ufpe.cin.petcare.negocio.cadastro.medico;

import br.ufpe.cin.petcare.dados.repositorio.medico.InterfaceRepositorioMedicos;

public class CadastroMedico {
    private InterfaceRepositorioMedicos repositorioMedicos;

    public CadastroMedico(InterfaceRepositorioMedicos repositorioMedicos) {
        this.repositorioMedicos = repositorioMedicos;
    }

    public Medico buscar(Long ID) {
        return this.repositorioMedicos.buscar(ID);
    }
}
