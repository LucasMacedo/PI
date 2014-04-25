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
public class Paciente extends Pessoa {
    
    private Integer codigo;

    public Paciente(Integer codigo, String nome, String cpf, String endereco, String email, String telefone) {
        super(nome, cpf, endereco, email, telefone);
        this.codigo = codigo;
    }

    public Paciente(String nome, String cpf, String endereco, String email, String telefone) {
        super(nome, cpf, endereco, email, telefone);
    }

    public Paciente(){
        super();
    }
    

   public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
    
}
