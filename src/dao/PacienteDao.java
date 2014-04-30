/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.ArrayList;
import model.Paciente;

/**
 *
 * @author Lucas
 */
public class PacienteDao {
    
    private ArrayList<Paciente> listaPaciente;
    private static PacienteDao instanciaRep;
    
    public static PacienteDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new PacienteDao();
        }
        return instanciaRep;
    }
    
    public PacienteDao(){
        listaPaciente = new ArrayList<Paciente>();
    }
    
    public void incluir(Paciente paciente){
        listaPaciente.add(paciente);
    }
    
    public ArrayList<Paciente> obterLista(){
        return listaPaciente;
    }
    
}