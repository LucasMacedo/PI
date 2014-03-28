/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Lucas
 */
public class ConsultaProcedimento {
    
    private Integer codConsulta;
    private Integer codProcedimento;

    public ConsultaProcedimento(Integer codConsulta, Integer codProcedimento) {
        this.codConsulta = codConsulta;
        this.codProcedimento = codProcedimento;
    }

    public Integer getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(Integer codConsulta) {
        this.codConsulta = codConsulta;
    }

    public Integer getCodProcedimento() {
        return codProcedimento;
    }

    public void setCodProcedimento(Integer codProcedimento) {
        this.codProcedimento = codProcedimento;
    }
}