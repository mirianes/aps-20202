package br.ufpe.cin.petcare.dados.repositorio.medico;

import br.ufpe.cin.petcare.negocio.cadastro.medico.Medico;

public interface InterfaceRepositorioMedicos {
    public Medico buscar(Long ID);
}
