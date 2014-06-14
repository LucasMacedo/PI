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
import model.Paciente;
import util.SqlHelper;

/**
 *
 * @author Lucas
 */
public class PacienteDao extends SqlHelper{

    private static PacienteDao instanciaRep;

    public static PacienteDao obterInstancia() {
        if (instanciaRep == null) {
            instanciaRep = new PacienteDao();
        }
        return instanciaRep;
    }

    public void incluir(Paciente paciente) throws SQLException {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO PESSOA(NOME,CPF,ENDERECO,EMAIL,TELEFONE) VALUES (?,?,?,?,?)");

            PreparedStatement st = getPreparedStatement(sql, RETURN_KEY);
            st.setString(1, paciente.getNome());
            st.setString(2, paciente.getCpf());
            st.setString(3, paciente.getEndereco());
            st.setString(4, paciente.getEmail());
            st.setString(5, paciente.getTelefone());

            st.executeUpdate();
            ResultSet chave = st.getGeneratedKeys();
            if (chave.next()) {
                paciente.setCodigo(chave.getInt(1));
            }

            sql = new StringBuilder();
            sql.append("INSERT INTO PACIENTE VALUES (?)");
            st = getPreparedStatement(sql, NO_KEY);
            st.setInt(1, paciente.getCodigo());
            
            st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } finally {
            ConnectionManager.closeConnection();
        }
    }

    public List<Paciente> obterLista() throws SQLException {
        List<Paciente> pacientes = new ArrayList<>();
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM PACIENTE P");
        sql.append("    INNER JOIN PESSOA PE");
        sql.append("        ON P.CODPACIENTE = PE.CODIGO");

        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setCodigo(rs.getInt("CODIGO"));
                paciente.setCpf(rs.getString("CPF"));
                paciente.setEmail(rs.getString("EMAIL"));
                paciente.setEndereco(rs.getString("ENDERECO"));
                paciente.setNome(rs.getString("NOME"));
                paciente.setTelefone(rs.getString("TELEFONE"));
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return pacientes;
    }

    public void alterar(Paciente paciente) throws SQLException {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE PESSOA SET NOME=?,CPF=?,ENDERECO=?,EMAIL=?,TELEFONE=? WHERE CODIGO=?");

            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            st.setString(1, paciente.getNome());
            st.setString(2, paciente.getCpf());
            st.setString(3, paciente.getEndereco());
            st.setString(4, paciente.getEmail());
            st.setString(5, paciente.getTelefone());
            st.setInt(6, paciente.getCodigo());

            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } finally {
            ConnectionManager.closeConnection();
        }
    }

}
