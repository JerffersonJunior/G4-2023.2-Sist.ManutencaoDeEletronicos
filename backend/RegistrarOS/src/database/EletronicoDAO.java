package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Eletronico;

public class EletronicoDAO {
	
	public Eletronico buscaEletronico(String serie) throws SQLException, ConectException {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conexao = Conect.getConect();

            String sql = "SELECT * FROM eletronicos WHERE serie = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, serie);

            rs = stmt.executeQuery();
            Eletronico eletro = null;
            
            if (rs.next()) {
            	eletro = new Eletronico(
                    rs.getString("categoria"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getString("serie")
                );
            }

            return eletro;
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
