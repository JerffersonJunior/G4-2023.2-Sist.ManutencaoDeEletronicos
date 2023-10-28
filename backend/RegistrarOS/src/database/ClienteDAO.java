package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;

public class ClienteDAO {
    
    public Cliente buscarCliente(String telefone) throws SQLException, ConectException {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conexao = Conect.getConect();

            String sql = "SELECT * FROM clientes WHERE telefone = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, telefone);

            rs = stmt.executeQuery();
            Cliente cli = null;
            
            if (rs.next()) {
                cli = new Cliente(
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("telefone")
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


