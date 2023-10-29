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
			
			String sql = "INSERT INTO os(id, datainicio, reclamacao, analisetecnico, status, datadefechamento, valormanutencao)VALUES (?,?,?,?,?,?,?)";
			
		    PreparedStatement stmt = conexao.prepareStatement(sql);
		    stmt.setInt(1, id);
		    stmt.setString(2, dataInicio);
		    stmt.setString(3, reclamacao);
		    stmt.setString(4, analiseTecnico);
		    stmt.setString(5, status);
		    stmt.setString(6, dataFechamento);
		    stmt.setFloat(7, valorManutencao);
		    
		    
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

            String sql = "SELECT clientes.nome FROM clientes, os WHERE os.clientes_telefone = clientes.telefone";
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
}




