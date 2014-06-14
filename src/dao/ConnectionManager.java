package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class ConnectionManager {

	private static Connection connection;

	public static Connection getConnection() {
            try {
                if (connection == null || connection.isClosed()) {

                        Class.forName("com.mysql.jdbc.Driver");
                        String url = "jdbc:mysql://localhost:3306/pi";
                        String user = "root";
                        String password = "admin";

                        connection = DriverManager.getConnection(url, user,password);
                        connection.setAutoCommit(false);

                        Logger.getLogger(ConnectionManager.class.getName()).log(Level.INFO, "Conexão estabelecida.");
                } 
            } catch (ClassNotFoundException e) {
                Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, "Driver não encontrado.", e);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, "Conexão NÃO estabelecida.", ex);
            } 
            return connection;
	}

	public static void closeConnection(){
            try {
                connection.commit();
                if(!connection.isClosed())connection.close();
            } catch (SQLException e) {
                Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, "Erro ao salvar dados.", e);
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, "Erro ao fazer rollback dos dados.", ex);
                }
            }
	}
}
