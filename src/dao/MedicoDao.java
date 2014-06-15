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
import model.Medico;
import util.SqlHelper;

/**
 *
 * @author Lucas
 */
public class MedicoDao extends SqlHelper{
    
    private static MedicoDao instanciaRep;
    
    public static MedicoDao obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new MedicoDao();
        }
        return instanciaRep;
    }
    
    public void incluir(Medico medico) throws SQLException{
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO PESSOA(NOME,CPF,ENDERECO,EMAIL,TELEFONE) VALUES (?,?,?,?,?)");

            PreparedStatement st = getPreparedStatement(sql, RETURN_KEY);
            st.setString(1, medico.getNome());
            st.setString(2, medico.getCpf());
            st.setString(3, medico.getEndereco());
            st.setString(4, medico.getEmail());
            st.setString(5, medico.getTelefone());

            st.executeUpdate();
            ResultSet chave = st.getGeneratedKeys();
            if (chave.next()) {
                medico.setCodigo(chave.getInt(1));
            }

            sql = new StringBuilder();
            sql.append("INSERT INTO MEDICO VALUES (?,?,?)");
            st = getPreparedStatement(sql, NO_KEY);
            st.setInt(1, medico.getCodigo());
            st.setInt(2, medico.getCrm());
            st.setInt(3, medico.getCodigoEspecialidade());
            
            st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } finally {
            ConnectionManager.closeConnection();
        }
    }
    
    public List<Medico> obterLista() throws SQLException{
        List<Medico> medicos = new ArrayList<>();
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM MEDICO M");
        sql.append("    INNER JOIN PESSOA P");
        sql.append("        ON M.CODMEDICO = P.CODIGO");

        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Medico medico = new Medico();
                medico.setCodigo(rs.getInt("CODIGO"));
                medico.setCpf(rs.getString("CPF"));
                medico.setEmail(rs.getString("EMAIL"));
                medico.setEndereco(rs.getString("ENDERECO"));
                medico.setNome(rs.getString("NOME"));
                medico.setTelefone(rs.getString("TELEFONE"));
                medico.setCodigoEspecialidade(rs.getInt("CODESPECIALIDADE"));
                medico.setCrm(rs.getInt("CRM"));
                medicos.add(medico);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return medicos;
    }

    public void alterar(Medico medico) throws SQLException {
       try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE PESSOA SET NOME=?,CPF=?,ENDERECO=?,EMAIL=?,TELEFONE=? WHERE CODIGO=?");

            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            st.setString(1, medico.getNome());
            st.setString(2, medico.getCpf());
            st.setString(3, medico.getEndereco());
            st.setString(4, medico.getEmail());
            st.setString(5, medico.getTelefone());
            st.setInt(6, medico.getCodigo());

            st.executeUpdate();
            
            sql = new StringBuilder();
            sql.append("UPDATE MEDICO SET CODESPECIALIDADE=? WHERE CODMEDICO=?");
            
            st = getPreparedStatement(sql, NO_KEY);
            st.setInt(1, medico.getCodigoEspecialidade());
            st.setInt(2, medico.getCodigo());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } finally {
           ConnectionManager.closeConnection();
        }
    }
    
}
