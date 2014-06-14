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
import model.Especialidade;
import util.SqlHelper;

/**
 *
 * @author Lucas
 */
public class EspecialidadeDao extends SqlHelper{
    
    private static EspecialidadeDao instanciaRep;
    
    public static EspecialidadeDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new EspecialidadeDao();
        }
        return instanciaRep;
    }
        
    public void cadastar(Especialidade esp) throws SQLException{
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO ESPECIALIDADE(NOME) VALUES (?)");

            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            st.setString(1, esp.getNome());
            
            st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } finally {
            ConnectionManager.closeConnection();
        }
    }
    
    public List<Especialidade> listar() throws SQLException{
        List<Especialidade> especialidades = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM ESPECIALIDADE");
        
        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Especialidade especialidade = new Especialidade(
                    rs.getInt("CODIGO"), 
                    rs.getString("NOME")
                );
                especialidades.add(especialidade);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } 
        return especialidades;
    }
    
    
}
