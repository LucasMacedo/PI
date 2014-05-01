/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.MedicoDao;
import java.util.ArrayList;
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
        }
        if(medico.getCpf().isEmpty()){
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
    
    
}
