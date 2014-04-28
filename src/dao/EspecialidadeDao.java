/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.ArrayList;
import model.Especialidade;

/**
 *
 * @author Lucas
 */
public class EspecialidadeDao {
    
    private static EspecialidadeDao instanciaRep;
    private ArrayList<Especialidade> listaEspecialidade;
    
    public static EspecialidadeDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new EspecialidadeDao();
        }
        return instanciaRep;
    }
    
    public EspecialidadeDao(){
        this.listaEspecialidade = new ArrayList<Especialidade>();
        this.listaEspecialidade.add(new Especialidade(1, "Otorino"));
        this.listaEspecialidade.add(new Especialidade(2, "Clinico Geral"));
    }
    
    public void cadastar(Especialidade esp){
        this.listaEspecialidade.add(esp);
    }
    
    public ArrayList<Especialidade> listar(){
        return this.listaEspecialidade;
    }
    
    
}
