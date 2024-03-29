package database;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.OS;


public class OSDAO {
    
 
	public void adicionarOS(int id, String dataInicio, String reclamacao, String analiseTecnico, String status, String dataFechamento, float valorManutencao) throws SQLException 
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
	
	public String buscaNome(String telefone) throws ConectException, SQLException
	{
		Connection conexao = Conect.getConect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        
        String sql = "SELECT nome FROM clientes WHERE telefone = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, telefone);

        rs = stmt.executeQuery();
        
        
        if (rs.next()) {
            
        	System.out.println("nome: " + rs.getString("nome"));
               
        }
        else
        {
        	return "Cliente nao encontrado";
        }


		return "Cliente nao encontrado";
	}
	
	
	
	


}




