/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.ProcedimentoDao;
import java.util.ArrayList;
import java.util.List;
import model.Procedimento;

/**
 *
 * @author Lucas
 */
public class ProcedimentoController {
    
    private static ProcedimentoController instanciaRep;
    
    public static ProcedimentoController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new ProcedimentoController();
        }
        return instanciaRep;
    }

    public List<Procedimento> obterLista() throws Exception {
        List<Procedimento> procedimentos = new ArrayList<>();
        procedimentos.add(new Procedimento(0, "Selecione"));
        procedimentos.addAll(ProcedimentoDao.obterInstancia().obterLista());
        return procedimentos;
    }
    
    
}
