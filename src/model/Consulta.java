/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *
 * @author Lucas
 */
public class Consulta {
    
    private Date data;
    private String observacao;
    
    private Integer codMedico;
    private Integer codPaciente;

    public Consulta(Date data, String observacao, Integer codMedico, Integer codPaciente) {
        this.data = data;
        this.observacao = observacao;
        this.codMedico = codMedico;
        this.codPaciente = codPaciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(Integer codMedico) {
        this.codMedico = codMedico;
    }

    public Integer getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(Integer codPaciente) {
        this.codPaciente = codPaciente;
    }

    
    
    
}
