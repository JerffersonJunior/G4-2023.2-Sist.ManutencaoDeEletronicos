package database;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.OS;


public class OSDAO 
{
    
 
	public void RegistrarOS(int id, String dataInicio, String reclamacao, String analiseTecnico, String status, String dataFechamento, float valorManutencao) throws SQLException 
	{
	       Connection conexao = null;
	       
			try {
				conexao = Conect.getConect();
				System.out.println(conexao);
			} catch (ConectException e) {
				
				e.printStackTrace();
			}
			
			String sql = "INSERT INTO os(datainicio, reclamacao, analisetecnico, status, datafechamento, valormanutencao)VALUES (?,?,?,?,?,?)";
			
		    PreparedStatement stmt = conexao.prepareStatement(sql);
		    stmt.setString(1, dataInicio);
		    stmt.setString(2, reclamacao);
		    stmt.setString(3, analiseTecnico);
		    stmt.setString(4, status);
		    stmt.setString(5, dataFechamento);
		    stmt.setFloat(6, valorManutencao);
		    
		    
		    stmt.execute();
		    stmt.close();
		    
	
	
	}

	
	public OS buscaOS(int id) throws SQLException, ConectException 
    {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conexao = Conect.getConect();

            String sql = "SELECT * FROM os WHERE id = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();
            OS OSD = null;
            
            if (rs.next()) {
                OSD = new OS(
                    rs.getInt("id"),
                    rs.getString("dataInicio"),
                    rs.getString("reclamacao"),
                    rs.getString("analiseTecnico"),
                    rs.getString("status"),
                    rs.getString("dataFechamento"),
                    rs.getFloat("valorManutencao")

                );
            }

            return OSD;
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
	public void cancelarOS(int id) throws SQLException, ConectException {
	    Connection conexao = null;
	    PreparedStatement stmt = null;

	    try {
	        conexao = Conect.getConect();
	        System.out.println(conexao);

	        String updateQuery = "UPDATE os SET status = 'cancelado' WHERE id = ?";
	        stmt = conexao.prepareStatement(updateQuery);
	        stmt.setInt(1, id);

	        int linhasAfetadas = stmt.executeUpdate();

	        if (linhasAfetadas > 0) {
	            System.out.println("Ordem de Serviço cancelada com sucesso.");
	        } else {
	            System.out.println("A Ordem de Serviço com o ID " + id + " não foi encontrada.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	        throw e;
	    } finally {
	   
	        if (stmt != null) {
	            stmt.close();
	        }
	        if (conexao != null) {
	            conexao.close();
	        }
	    }
	}
}






