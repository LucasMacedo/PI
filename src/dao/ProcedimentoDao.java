/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.ArrayList;
import model.Procedimento;

/**
 *
 * @author Lucas
 */
public class ProcedimentoDao {
    
    private static ProcedimentoDao instanciaRep;
    private ArrayList<Procedimento> listaProcedimento;

    public static ProcedimentoDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new ProcedimentoDao();
        }
        return instanciaRep;
    }
    
    public ProcedimentoDao() {
        this.listaProcedimento = new ArrayList<>();
        this.listaProcedimento.add(new Procedimento(1, "Cirugia"));
        this.listaProcedimento.add(new Procedimento(2, "Nada"));
    }
    
    public ArrayList<Procedimento> obterLista() {
        return this.listaProcedimento;
    }
}
