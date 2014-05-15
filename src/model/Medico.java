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
public class Medico extends Pessoa {
    
    private Integer codigo;
    private Integer crm;
    private Integer codigoEspecialidade;

    public Medico(Integer codigo, Integer crm, Integer codigoEspecialidade, String nome,String cpf, String endereco, String email, String telefone) {
        super(nome,cpf, endereco, email, telefone);
        this.codigo = codigo;
        this.crm = crm;
        this.codigoEspecialidade = codigoEspecialidade;
    }

    public Medico(Integer crm, Integer codigoEspecialidade, String nome,String cpf, String endereco, String email, String telefone) {
        super(nome,cpf, endereco, email, telefone);
        this.crm = crm;
        this.codigoEspecialidade = codigoEspecialidade;
    }

    public Medico(Integer crm, Integer codigoEspecialidade, String nome) {
        super(nome);
        this.crm = crm;
        this.codigoEspecialidade = codigoEspecialidade;
    }

    
    
    
    public Medico() {
        super();
    }

    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public Integer getCodigoEspecialidade() {
        return codigoEspecialidade;
    }

    public void setCodigoEspecialidade(Integer codigoEspecialidade) {
        this.codigoEspecialidade = codigoEspecialidade;
    }
    
    
    
}
