/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.ProcedimentoDao;
import java.util.ArrayList;
import model.Procedimento;

/**
 *
 * @author Lucas
 */
public class ProcedimentoController {
    
    private static ProcedimentoController instanciaRep;
    private ArrayList<Procedimento> listaProcedimento;
    
    public static ProcedimentoController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new ProcedimentoController();
        }
        return instanciaRep;
    }

    public ProcedimentoController() {
        this.listaProcedimento = new ArrayList<>();
    }
     
    public ArrayList<Procedimento> obterLista() {
        return ProcedimentoDao.obterInstancia().obterLista();
    }
    
    
}
