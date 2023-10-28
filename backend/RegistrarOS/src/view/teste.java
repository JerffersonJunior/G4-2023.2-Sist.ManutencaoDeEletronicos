package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import database.Conect; // Importa a classe Connect da package database
import database.ConectException;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            // Solicita ao usuário os dados a serem inseridos
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            // Cria a instrução SQL para inserir os dados na tabela
            String sql = "INSERT INTO clientes (nome, telefone, endereco) VALUES (?, ?, ?)";

            // Obtém a conexão com o banco de dados usando a classe Connect
            conexao = Conect.getConect();

            // Prepara a instrução SQL com a conexão
            stmt = conexao.prepareStatement(sql);

            // Define os valores dos parâmetros da instrução
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, endereco);

            // Executa a instrução SQL para inserir os dados na tabela
            stmt.executeUpdate();

            System.out.println("Dados inseridos com sucesso na tabela.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados na tabela: " + e.getMessage());
        } catch (ConectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}
