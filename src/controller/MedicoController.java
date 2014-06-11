/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.MedicoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Medico;

/**
 *
 * @author Lucas
 */
public class MedicoController {
    
    private static MedicoController instanciaRep;
    
    
    public static MedicoController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new MedicoController();
        }
        return instanciaRep;
    }
    
    public void cadastar(Medico medico) throws Exception{
        if(medico.getNome().isEmpty()){
            throw new Exception("Nome Invalido !!");
        }else{
           this.verificarNome(medico.getNome());
        }
        if(medico.getCpf().equals("   .   .   -  ")){
            throw new Exception("CPF Invalido !!");
        }
        if(medico.getCrm() == null){
            throw new Exception("CRM Invalido !!");
        }
        
        if(medico.getCodigoEspecialidade().equals(0)){
            throw new Exception("Especialidade Invalido !!");
        }
        if(medico.getTelefone().isEmpty()){
            throw new Exception("Telefone Invalido !!");
        }
        if(medico.getEndereco().isEmpty()){
            throw new Exception("Endereço Invalido !!");
        }
        
        MedicoDao.obterInstancia().incluir(medico);
    }
    
    public ArrayList listarMedico(){
        return MedicoDao.obterInstancia().obterLista();
    }

    public void alterar(Medico medicoAnt) throws Exception {
        if(medicoAnt.getNome().isEmpty()){
            throw new Exception("Nome Invalido !!");
        }else{
            this.verificarNome(medicoAnt.getNome());
        }
        if(medicoAnt.getCpf().equals("   .   .   -  ")){
            throw new Exception("CPF Invalido !!");
        }
        if(medicoAnt.getCrm() == null){
            throw new Exception("CRM Invalido !!");
        }
        if(medicoAnt.getCodigoEspecialidade().equals(0)){
            throw new Exception("Especialidade Invalido !!");
        }
        if(medicoAnt.getTelefone().isEmpty()){
            throw new Exception("Telefone Invalido !!");
        }
        if(medicoAnt.getEndereco().isEmpty()){
            throw new Exception("Endereço Invalido !!");
        }
        
        MedicoDao.obterInstancia().alterar(medicoAnt);
    }
    
    private void verificarNome(String medico) throws Exception{
         for(int i=0;i<medico.length();i++){
                if(Character.isDigit(medico.charAt(i))){
                     throw new Exception("Contem numero no nome");
                }
          }
    }

   
    
}
