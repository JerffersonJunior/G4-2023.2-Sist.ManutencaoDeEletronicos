package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;

public class ClienteDAO 
{

	public static String buscaCliente(String telefone) throws ConectException, SQLException
	{
		Connection conexao = Conect.getConect();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    
	    
	    
	    String sql = "SELECT nome FROM clientes WHERE telefone = ?";
	    stmt = conexao.prepareStatement(sql);
	    stmt.setString(1, telefone);
	
	    rs = stmt.executeQuery();
	    
	    
	    if (rs.next()) {
	        
	    	return rs.getString("nome");
	           
	    }
	    else
	    {
	    	return "Cliente nao encontrado";
	    }


	}
}


