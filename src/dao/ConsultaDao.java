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
import model.Consulta_Paciente;
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
        sql.append("INSERT INTO CONSULTA(DATA,OBSERVACAO,CODMEDICO,CODPACIENTE,CODPROCEDIMENTO) VALUES (?,?,?,?,?)");
        
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
        sql.append("    WHERE estado = 'Ativo' ");
        
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
                consulta.setCodProcedimento(rs.getInt("CODPROCEDIMENTO"));
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
    
    public List<Consulta_Paciente> listarEspecial() throws SQLException{
        List<Consulta_Paciente> consultas = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM CONSULTA C");
        sql.append("    INNER JOIN PESSOA PE");
        sql.append("        ON C.CODPACIENTE = PE.CODIGO");
        sql.append("            GROUP BY C.CODPACIENTE");
        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Consulta_Paciente consulta = new Consulta_Paciente();
                consulta.setConsultaCodigo(rs.getInt("C.CODIGO"));
                consulta.setPacienteCodigo(rs.getInt("PE.CODIGO"));
                consulta.setPacienteNome(rs.getString("PE.NOME"));
                consulta.setPacienteCPF(rs.getString("PE.CPF"));
                consulta.setCodProcedimento(rs.getInt("C.CODPROCEDIMENTO"));
                consulta.setConsultaData(rs.getDate("C.DATA"));
                consultas.add(consulta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return consultas;
    }
    
    public List<Consulta_Paciente> listarData(java.util.Date dtInicio,java.util.Date dtFim) throws SQLException{
        List<Consulta_Paciente> consultas = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM CONSULTA C");
        sql.append("    INNER JOIN PESSOA PE");
        sql.append("        ON C.CODPACIENTE = PE.CODIGO");
        sql.append("          WHERE C.DATA >= ? AND C.DATA <= ?   ");
        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            st.setDate(1, new Date(dtInicio.getTime()));
            st.setDate(2, new Date(dtFim.getTime()));
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Consulta_Paciente consulta = new Consulta_Paciente();
                consulta.setConsultaCodigo(rs.getInt("C.CODIGO"));
                consulta.setPacienteCodigo(rs.getInt("PE.CODIGO"));
                consulta.setPacienteNome(rs.getString("PE.NOME"));
                consulta.setPacienteCPF(rs.getString("PE.CPF"));
                consulta.setCodProcedimento(rs.getInt("C.CODPROCEDIMENTO"));
                consulta.setConsultaData(rs.getDate("C.DATA"));
                consultas.add(consulta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return consultas;
    }

    public List<Consulta> listarConsultaData(java.util.Date dtInicio, java.util.Date dtFim) throws SQLException {
        List<Consulta> consultas = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM CONSULTA C");
        sql.append("    INNER JOIN PESSOA PE");
        sql.append("        ON C.CODPACIENTE = PE.CODIGO");
        sql.append("          WHERE C.DATA >= ? AND C.DATA <= ?   ");
        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            st.setDate(1, new Date(dtInicio.getTime()));
            st.setDate(2, new Date(dtFim.getTime()));
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Consulta consulta = new Consulta();
                consulta.setCodMedico(rs.getInt("CODMEDICO"));
                consulta.setCodPaciente(rs.getInt("CODPACIENTE"));
                consulta.setCodigo(rs.getInt("CODIGO"));
                consulta.setData(rs.getDate("DATA"));
                consulta.setObservacao(rs.getString("OBSERVACAO"));
                consulta.setCodProcedimento(rs.getInt("CODPROCEDIMENTO"));
                consultas.add(consulta);
            }        
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return consultas;
    }

    public void remover(Integer codigo) throws SQLException {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE consulta SET estado = 'Inativo' ");
            sql.append("WHERE codigo = ?");
            
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            st.setInt(1, codigo);
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }finally{
            ConnectionManager.closeConnection();
        }
    }

   
    
    
}
