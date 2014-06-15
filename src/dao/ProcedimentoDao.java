/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Procedimento;
import util.SqlHelper;

/**
 *
 * @author Lucas
 */
public class ProcedimentoDao extends SqlHelper{
    
    private static ProcedimentoDao instanciaRep;

    public static ProcedimentoDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new ProcedimentoDao();
        }
        return instanciaRep;
    }
    
    public List<Procedimento> obterLista() throws SQLException {
        List<Procedimento> procedimentos = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM PROCEDIMENTO");
        
        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Procedimento procedimento = new Procedimento(
                        rs.getInt("CODIGO"),
                        rs.getString("DESCRICAO")
                );
                procedimentos.add(procedimento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProcedimentoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return procedimentos;
    }
}
