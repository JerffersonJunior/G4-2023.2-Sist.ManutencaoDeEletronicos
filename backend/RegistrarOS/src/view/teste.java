package view;



/*
import database.*;
import model.*;


import java.util.Scanner;
import controller.Controladora;
import java.sql.SQLException;

import java.util.Scanner;

public class teste {
   
	public static void main(String[] args) throws SQLException, ConectException {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o ID da OS:");
        int id = ler.nextInt();

        Controladora controladora = new Controladora();
        OSDAO OSD = new OSDAO();

        boolean existeOS = controladora.existeOS(id);

        if (existeOS) {
            System.out.println("A OS com ID " + id + " existe. Detalhes da OS:");

            // Agora, vamos buscar e imprimir os detalhes da OS com base no ID fornecido
            OS os = OSD.buscaOSS(id);


            if (os != null) {
                System.out.println("ID: " + os.getId());
                System.out.println("Data de Início: " + os.getDataInicio());
                System.out.println("Reclamação: " + os.getReclamacao());
                System.out.println("Análise do Técnico: " + os.getAnaliseTecnico());
                System.out.println("Status: " + os.getStatus());
                System.out.println("Data de Fechamento: " + os.getDataFechamento());
                System.out.println("Valor da Manutenção: " + os.getValorManutencao());
            } else {
                System.out.println("Detalhes da OS não encontrados.");
            }
        } else {
            System.out.println("A OS com ID " + id + " não existe.");
        }

      
    }
}


*/











/*
import java.sql.SQLException;
import java.util.Scanner;
import database.OSDAO;
import controller.Controladora;
public class teste {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Controladora contro = new Controladora();
        System.out.println("Inserir uma nova OS");

        System.out.println("Informe o ID da OS: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consuma a quebra de linha

        System.out.println("Informe a data de início: ");
        String dataInicio = scanner.nextLine();
        contro.dataInicioPreenchido(dataInicio); // Verifica se a data de início foi preenchida

        System.out.println("Informe a reclamação: ");
        String reclamacao = scanner.nextLine();
        contro.reclamacaoPreenchido(reclamacao); // Verifica se a reclamação foi preenchida

        System.out.println("Informe a análise do técnico: ");
        String analiseTecnico = scanner.nextLine();

        System.out.println("Informe o status: ");
        String status = scanner.nextLine();

        System.out.println("Informe a data de fechamento: ");
        String dataFechamento = scanner.nextLine();

        System.out.println("Informe o valor da manutenção: ");
        float valorManutencao = scanner.nextFloat();
        scanner.close(); // Fechar o scanner

        OSDAO OSD = new OSDAO();

        try {
            OSD.adicionarOS(id, dataInicio, reclamacao, analiseTecnico, status, dataFechamento, valorManutencao);
            System.out.println("OS inserida com sucesso no banco de dados.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao inserir a OS: " + e.getMessage());
        }
    }
}



/*-----busca funcionario-----*/



/*
import java.sql.SQLException;
import database.FuncionarioDAO;
import database.ConectException;
import model.Funcionario;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        FuncionarioDAO FucionarioDAO = new FuncionarioDAO();
        
        @SuppressWarnings("resource")
		Scanner leitura = new Scanner(System.in);

        try {
        	
        	System.out.printf("digite o numero do cliente que deseja buscar: ");
        	
            String buscarTelefone = leitura.nextLine();


            Funcionario funcionarioEncontrado = FuncionarioDAO.buscaTecnico(buscaTecnico);

            if (funcionarioEncontrado != null)
            {
            	System.out.println();
                System.out.println("Cliente Encontrado:");
                System.out.println("Nome: " + funcionarioEncontrado.getNome());
                System.out.println("Endereço: " + funcionarioEncontrado.getEndereco());
                System.out.println("Telefone: " + funcionarioEncontrado.getNumeroTelefone());
            } else {
                System.out.println("Cliente não encontrado com o número de telefone: " + buscarTelefone);
            }
        } catch (SQLException | ConectException e) {
            e.printStackTrace();
            System.out.println();
            
            System.err.println("Erro ao buscar cliente: " + e.getMessage());
        }
    }
}
*/




/*-----Busca Cliente-----*/

/*

import java.sql.SQLException;
import database.ClienteDAO;
import database.ConectException;
import model.Cliente;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        
        @SuppressWarnings("resource")
		Scanner leitura = new Scanner(System.in);

        try {
        	
        	System.out.printf("digite o numero do cliente que deseja buscar: ");
        	
            String buscarTelefone = leitura.nextLine();


            Cliente clienteEncontrado = clienteDAO.buscaCliente(buscarTelefone);

            if (clienteEncontrado != null)
            {
            	System.out.println();
                System.out.println("Cliente Encontrado:");
                System.out.println("Nome: " + clienteEncontrado.getNome());
                System.out.println("Endereço: " + clienteEncontrado.getEndereco());
                System.out.println("Telefone: " + clienteEncontrado.getNumeroTelefone());
            } else {
                System.out.println("Cliente não encontrado com o número de telefone: " + buscarTelefone);
            }
        } catch (SQLException | ConectException e) {
            e.printStackTrace();
            System.out.println();
            
            System.err.println("Erro ao buscar cliente: " + e.getMessage());
        }
    }
}


*/





























/*
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import database.Conect; // Importa a classe Connect da package database
import database.ConectException;

public class teste {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            // Solicita ao usuário os dados a serem inseridos
            System.out.print("Nome: ");
            String nome = ler.nextLine();
            System.out.print("Telefone: ");
            String telefone = ler.nextLine();
            System.out.print("Endereço: ");
            String endereco = ler.nextLine();

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
            System.out.println("\n");
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
*/