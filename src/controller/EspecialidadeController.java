/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


import dao.EspecialidadeDao;
import java.util.ArrayList;
import model.Especialidade;

/**
 *
 * @author Lucas
 */
public class EspecialidadeController {
    
    private static EspecialidadeController instanciaRep;
    
    public static EspecialidadeController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new EspecialidadeController();
        }
        return instanciaRep;
    }
    
    public void cadastra(Especialidade esp){
        EspecialidadeDao.obterInstancia().cadastar(esp);
    }
    
    public ArrayList obterLista(){
        return EspecialidadeDao.obterInstancia().listar();
    }
    
}
