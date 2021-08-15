package br.ufpe.cin.petcareservicoprocedimento.dados.repositorio.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consulta extends Procedimento {
    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long ID;
    public Long idEspecialidade;
    public Long idMedico;
    public Date data;

    public Consulta(Long idEspecialidade, Long idMedico, Date data) {
        this.idEspecialidade = idEspecialidade;
        this.idMedico = idMedico;
        this.data = data;
    }

    public Consulta() {}

    public Long getIDEspecialidade() {
        return this.idEspecialidade;
    }

    public void setIDEspecialidade(Long idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public Long getIDMedico() {
        return this.idMedico;
    }

    public void setIDMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
