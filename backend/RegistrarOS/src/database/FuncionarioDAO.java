package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;

public class FuncionarioDAO
{
	public Funcionario buscaTecnico(String nome) throws SQLException, ConectException 
	{
		
		Connection conexao = null;
		PreparedStatement stmt = null;
	        ResultSet rs = null;
	        
	        try {
	            conexao = Conect.getConect();

	            String sql = "SELECT * FROM Funcionarios WHERE nome = ?";
	            stmt = conexao.prepareStatement(sql);
	            stmt.setString(1, nome);

	            rs = stmt.executeQuery();
	            Funcionario func = null;
	            
	            if (rs.next()) {
	                func = new Funcionario(
	                    rs.getString("nome")

	                    
	                );
	            }

	            return func;
	        }
	        finally
	        {
	            if (rs != null) 
	            {
	            	rs.close();
	            }
	            if (stmt != null) 
	            {
	                stmt.close();
	            }
	            if (conexao != null) 
	            {
	                conexao.close();
	            }
	        }
	    }
}




