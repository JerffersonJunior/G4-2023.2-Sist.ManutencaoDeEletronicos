package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;

public class FuncionarioDAO
{
	

	

	public class ClienteDAO {
	    
	    public Funcionario buscaTecnico(String telefone) throws SQLException, ConectException {
	        Connection conexao = null;
	        PreparedStatement stmt = null;
	        ResultSet rs = null;
	        
	        try {
	            conexao = Conect.getConect();

	            String sql = "SELECT * FROM Funcionarios WHERE telefone = ?";
	            stmt = conexao.prepareStatement(sql);
	            stmt.setString(1, telefone);

	            rs = stmt.executeQuery();
	            Funcionario cli = null;
	            
	            if (rs.next()) {
	                cli = new Funcionario(
	                    rs.getString("nome"),
	                    rs.getString("endereco"),
	                    rs.getString("telefone"),
	                    rs.getString("email"),
	                    rs.getString("senha"),
	                    rs.getString("tipoFuncionario")
	                    
	                );
	            }

	            return cli;
	        } finally {
	            if (rs != null) {
	                rs.close();
	            }
	            if (stmt != null) {
	                stmt.close();
	            }
	            if (conexao != null) {
	                conexao.close();
	            }
	        }
	    }
	}



}
