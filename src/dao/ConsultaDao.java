/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Consulta;

/**
 *
 * @author lucas_macedo
 */
public class ConsultaDao {
    
    private static ConsultaDao instanciaRep;
    private ArrayList<Consulta> listaConsulta;
            
    public static ConsultaDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new ConsultaDao();
        }
        return instanciaRep;
    }
    
    public ConsultaDao(){
        this.listaConsulta = new ArrayList<Consulta>();
    }
    
    public void incluir(Consulta consulta){
        this.listaConsulta.add(consulta);
    }
    
    public ArrayList listar(){
        return this.listaConsulta;
    }
    
    
}
