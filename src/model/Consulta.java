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
    private Integer codProcedimento;
    private String procedimento;
    
    private Integer codigo;
    private Integer codMedico;
    private Integer codPaciente;

    public Consulta(Date data, String observacao, Integer codMedico, Integer codPaciente, Integer codProcedimento) {
        this.data = data;
        this.observacao = observacao;
        this.codMedico = codMedico;
        this.codPaciente = codPaciente;
        this.codProcedimento = codProcedimento;
    }

    public Consulta() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public Integer getCodProcedimento() {
        return codProcedimento;
    }

    public void setCodProcedimento(Integer codProcedimento) {
        this.codProcedimento = codProcedimento;
    }
    
}
