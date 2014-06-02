/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.PacienteDao;
import java.util.ArrayList;
import model.Paciente;

/**
 *
 * @author Lucas
 */
public class PacienteController {
    
    private static PacienteController instanciaRep;
    private static Integer id;
    
    public static PacienteController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new PacienteController();
            id = 0;
        }
        id++;
        return instanciaRep;
    }
    
    public void cadastrar(Paciente paciente) throws Exception{
        if(paciente.getNome().isEmpty()){
            throw new Exception("Nome esta invalido !!");
        }
        if(paciente.getCpf().equals("   .   .   -  ")){
            throw new Exception("CPF esta invalido !!");
        }
        if(paciente.getTelefone().isEmpty()){
            throw new Exception("Telefone invalido !!");
        }
        if(paciente.getEndereco().isEmpty()){
            throw new Exception("Endereço invalido !!");
        }
            paciente.setCodigo(id);
        
        PacienteDao.obterInstancia().incluir(paciente);
    }
    
    public ArrayList listarPaciente(){
        return PacienteDao.obterInstancia().obterLista();
    }

    public void alterar(Paciente pacienteAnt) throws Exception {
        if(pacienteAnt.getNome().isEmpty()){
            throw new Exception("Nome esta invalido !!");
        }
        if(pacienteAnt.getCpf().equals("   .   .   -  ")){
            throw new Exception("CPF esta invalido !!");
        }
        if(pacienteAnt.getTelefone().isEmpty()){
            throw new Exception("Telefone invalido !!");
        }
        if(pacienteAnt.getEndereco().isEmpty()){
            throw new Exception("Endereço invalido !!");
        }
                   
        PacienteDao.obterInstancia().alterar(pacienteAnt);
    }
    
}
