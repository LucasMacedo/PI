/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Consulta;
import util.SqlHelper;

/**
 *
 * @author lucas_macedo
 */
public class ConsultaDao extends SqlHelper{
    
    private static ConsultaDao instanciaRep;
            
    public static ConsultaDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new ConsultaDao();
        }
        return instanciaRep;
    }
    
    public void incluir(Consulta consulta) throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO CONSULTA(DATA,OBSERVACAO,CODMEDICO,CODPACIENTE,CODPROCEDIMENTO) VALUES (?,?,?,?)");
        
        try {
            PreparedStatement st = getPreparedStatement(sql, RETURN_KEY);
            st.setDate(1, new Date(consulta.getData().getTime()));
            st.setString(2, consulta.getObservacao());
            st.setInt(3, consulta.getCodMedico());
            st.setInt(4, consulta.getCodPaciente());
            st.setInt(5, consulta.getCodProcedimento());
            
            st.executeUpdate();
        } catch (SQLException ex) {
             Logger.getLogger(ConsultaDao.class.getName()).log(Level.SEVERE, null, ex);
             throw ex;
        } finally {
            ConnectionManager.closeConnection();
        }
    }
    
    public List<Consulta> listar() throws SQLException{
        List<Consulta> consultas = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM CONSULTA");
        
        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Consulta consulta = new Consulta();
                consulta.setCodMedico(rs.getInt("CODMEDICO"));
                consulta.setCodPaciente(rs.getInt("CODPACIENTE"));
                consulta.setCodigo(rs.getInt("CODIGO"));
                consulta.setData(rs.getDate("DATA"));
                consulta.setObservacao(rs.getString("OBSERVACAO"));
                consultas.add(consulta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return consultas;
    }

    public void alterar(Consulta consultaAnt) {
        
    }
    
    
}
