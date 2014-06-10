/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ConsultaDao;
import java.util.ArrayList;
import model.Consulta;

/**
 *
 * @author lucas_macedo
 */
public class ConsultaController {
    
    private static ConsultaController instanciaRep;
    private static Integer id;
    
    public static ConsultaController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new ConsultaController();
            id = 0;
        }
        id++;
        return instanciaRep;
    }
    
    public void cadastrar(Consulta consulta) throws Exception{
        consulta.setCodigo(id);
           
        if(consulta.getCodMedico() == null){
            throw new Exception("Medico não foi selecionado !");
        }
        if(consulta.getCodPaciente() == null){
            throw new Exception("Paciente não foi selecionado !");
        }
        if(consulta.getObservacao().isEmpty()){
            throw new Exception("Observação esta invalido !");
        }
        if(consulta.getProcedimento().isEmpty()){
            throw new Exception("Procedimento esta invalido !");
        }
        if(consulta.getData().equals("  /  /   ")){
            throw new Exception("A data esta invalida !");
        }
        
        ConsultaDao.obterInstancia().incluir(consulta);
    }
    
    public ArrayList listar(){
        return ConsultaDao.obterInstancia().listar();
    }

    public void alterar(Consulta consultaAnt) throws Exception {
        if(consultaAnt.getCodMedico() == null){
            throw new Exception("Medico não foi selecionado !");
        }
        if(consultaAnt.getCodPaciente() == null){
            throw new Exception("Paciente não foi selecionado !");
        }
        if(consultaAnt.getObservacao().isEmpty()){
            throw new Exception("Observação esta invalido !");
        }
        if(consultaAnt.getProcedimento().isEmpty()){
            throw new Exception("Procedimento esta invalido !");
        }
        if(consultaAnt.getData().equals("  /  /   ")){
            throw new Exception("A data esta invalida !");
        }
        
        ConsultaDao.obterInstancia().alterar(consultaAnt);
    }
}
