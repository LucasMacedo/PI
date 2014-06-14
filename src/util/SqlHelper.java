/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import dao.ConnectionManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fernando
 */
public class SqlHelper {
    
    public static final boolean RETURN_KEY = true;
    public static final boolean NO_KEY = false;
    
    /**
     * 
     * @param sql
     * @param retornaCodigo
     * @return 
     * @throws SQLException
     */
    public static PreparedStatement getPreparedStatement(StringBuilder sql, boolean retornaCodigo) throws SQLException {
        return ConnectionManager.getConnection().prepareStatement(sql.toString(), 
                retornaCodigo ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS);
    }
}
