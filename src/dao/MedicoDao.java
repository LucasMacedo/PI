/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.ArrayList;
import model.Medico;

/**
 *
 * @author Lucas
 */
public class MedicoDao {
    
    private ArrayList<Medico> listaMedico;
    private static MedicoDao instanciaRep;
    
    public static MedicoDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new MedicoDao();
        }
        return instanciaRep;
    }
    
    public MedicoDao(){
        listaMedico = new ArrayList<Medico>();
    }
    
    public void incluir(Medico medico){
        this.listaMedico.add(medico);
    }
    
    public ArrayList<Medico> obterLista(){
        return this.listaMedico;
    }
    
}
