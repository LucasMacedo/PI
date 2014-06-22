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
import model.Consulta_Paciente;
import static util.SqlHelper.NO_KEY;
import static util.SqlHelper.getPreparedStatement;

/**
 *
 * @author Lucas
 */
public class RelatorioDao {
    
   public List<Consulta_Paciente> listarEspecial(Integer codPaciente) throws SQLException{
        List<Consulta_Paciente> consultas = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM CONSULTA C ");
        sql.append("    INNER JOIN PESSOA PE ");
        sql.append("        ON C.CODPACIENTE = PE.CODIGO ");
        sql.append("             WHERE PE.CODIGO = ? ");
        try {
            PreparedStatement st = getPreparedStatement(sql, NO_KEY);
            st.setInt(1, codPaciente);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Consulta_Paciente consulta = new Consulta_Paciente();
                consulta.setConsultaCodigo(rs.getInt("C.CODIGO"));
                consulta.setPacienteCodigo(rs.getInt("PE.CODIGO"));
                consulta.setPacienteNome(rs.getString("PE.NOME"));
                consulta.setPacienteCPF(rs.getString("PE.CPF"));
                consulta.setPacienteEndereco(rs.getString("PE.ENDERECO"));
                consulta.setPacienteFone(rs.getString("PE.TELEFONE"));
                consulta.setPacienteEmail(rs.getString("PE.EMAIL"));
                consulta.setMedicoCodigo(rs.getInt("C.CODMEDICO"));
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
}
