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
public class Consulta_Paciente {
    private Integer consultaCodigo;
    private Integer pacienteCodigo;
    private String pacienteNome;
    private String pacienteCPF;
    private Integer codProcedimento;
    private Date consultaData;

    public Consulta_Paciente(Integer pacienteCodigo, String pacienteNome, String pacienteCPF, Integer codProcedimento, Date consultaData) {
        this.pacienteCodigo = pacienteCodigo;
        this.pacienteNome = pacienteNome;
        this.pacienteCPF = pacienteCPF;
        this.codProcedimento = codProcedimento;
        this.consultaData = consultaData;
    }

    public Consulta_Paciente() {
    }

    public Integer getConsultaCodigo() {
        return consultaCodigo;
    }

    public void setConsultaCodigo(Integer consultaCodigo) {
        this.consultaCodigo = consultaCodigo;
    }

    public Integer getPacienteCodigo() {
        return pacienteCodigo;
    }

    public void setPacienteCodigo(Integer pacienteCodigo) {
        this.pacienteCodigo = pacienteCodigo;
    }

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }

    public String getPacienteCPF() {
        return pacienteCPF;
    }

    public void setPacienteCPF(String pacienteCPF) {
        this.pacienteCPF = pacienteCPF;
    }

    public Integer getCodProcedimento() {
        return codProcedimento;
    }

    public void setCodProcedimento(Integer codProcedimento) {
        this.codProcedimento = codProcedimento;
    }

    public Date getConsultaData() {
        return consultaData;
    }

    public void setConsultaData(Date consultaData) {
        this.consultaData = consultaData;
    }
    
    
    
}
