package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conect 
{
    private static final String url = "jdbc:mysql://localhost:3306/cliente";
    private static final String user = "root";
    private static final String password = "7415369";
    
    private static Connection conn;
    
    public static Connection getConect() throws ConectException { // Lançando a exceção personalizada
        try {
            if (conn == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                System.out.printf("conectado");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new ConectException("Erro ao conectar ao banco de dados", e); // Lança a exceção personalizada
        }
        return conn;
    }
    
    
    
	public static void closeConnect() throws ConectException {
		if ( conn != null) {
			
			try {
				conn.close();
			} catch (SQLException e) {
				throw new ConectException(e.getMessage());
			}
			
		}
	}
}





