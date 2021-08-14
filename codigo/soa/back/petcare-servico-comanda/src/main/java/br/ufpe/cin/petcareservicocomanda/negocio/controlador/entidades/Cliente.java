package br.ufpe.cin.petcareservicocomanda.negocio.controlador.entidades;

import javax.persistence.Entity;

@Entity
public class Cliente extends Perfil {

    public Cliente(Long ID, String nome, String email, String senha, String cpf) {
        super(ID, nome, email, senha, cpf);
    }
}
