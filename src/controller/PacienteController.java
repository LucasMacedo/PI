/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.MedicoDao;
import dao.PacienteDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Paciente;

/**
 *
 * @author Lucas
 */
public class PacienteController {
    
    private static PacienteController instanciaRep;
    private List<Paciente> listaPaciente;
    
    public static PacienteController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new PacienteController();
        }
        return instanciaRep;
    }
    
    public void cadastrar(Paciente paciente) throws Exception{
        if(paciente.getNome().isEmpty()){
            throw new Exception("Nome inválido!");
        }else{
            this.verificaNome(paciente.getNome());
        }
        if(paciente.getCpf().equals("   .   .   -  ")){
            throw new Exception("CPF inválido!");
        }else{
            this.verificaCPF(paciente.getCpf());
        }
        if(paciente.getTelefone().isEmpty()){
            throw new Exception("Telefone inválido!");
        }
        if(paciente.getEndereco().isEmpty()){
            throw new Exception("Endereço inválido!");
        }
                
        PacienteDao.obterInstancia().incluir(paciente);
    }
    
    public List listarPaciente() throws Exception{
        return PacienteDao.obterInstancia().obterLista();
    }

    public void alterar(Paciente pacienteAnt) throws Exception {
        if(pacienteAnt.getNome().isEmpty()){
            throw new Exception("Nome esta invalido !!");
        }else{
            this.verificaNome(pacienteAnt.getNome());
        }
        if(pacienteAnt.getCpf().equals("   .   .   -  ")){
            throw new Exception("CPF esta invalido !!");
        }else{
            this.verificaCPF(pacienteAnt.getCpf());
        }
        if(pacienteAnt.getTelefone().isEmpty()){
            throw new Exception("Telefone invalido !!");
        }
        if(pacienteAnt.getEndereco().isEmpty()){
            throw new Exception("Endereço invalido !!");
        }
                   
        PacienteDao.obterInstancia().alterar(pacienteAnt);
    }
    
    private void verificaNome(String paciente)  throws Exception{
        for(int i=0; i<paciente.length();i++){
              if(Character.isDigit(paciente.charAt(i))){
                   throw new Exception("Contem numero no nome");
              }
         }
    }

    public void remover(Integer codigo) throws Exception {
        PacienteDao.obterInstancia().remover(codigo);
    }
    
    private void verificaCPF(String cpf) throws Exception{
        try {
            listaPaciente = PacienteDao.obterInstancia().obterLista();
        } catch (SQLException ex) {
            Logger.getLogger(MedicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0; i< this.listaPaciente.size();i++){
            if(this.listaPaciente.get(i).getCpf().equals(cpf)){
                throw new Exception("CPF Invalido !! CPF já existe");
            }
        }
    }
}
