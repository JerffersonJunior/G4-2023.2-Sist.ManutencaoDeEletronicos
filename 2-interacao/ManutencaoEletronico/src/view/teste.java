package view;



/*----- imports padrao ----- */

import database.*;
import model.*;
import java.util.Scanner;
import controller.Controladora;
import java.sql.SQLException;

import java.util.Scanner;

import view.ViewRegistrarOS;
import model.*;
import java.util.Scanner;
import controller.Controladora;
import java.sql.SQLException;

import java.util.Scanner;

import view.ViewRegistrarOS;
import view.viewCancelarOS;
/*----------------------------------------------------------------------------------------------------------------------------------*/

/*
public class teste
{
	public static void main(String[] args) throws SQLException, ConectException
	{
		OSDAO OSD = new OSDAO();
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o id");
		
		int id = leitura.nextInt();
		
		OSD.cancelarOS(id);
		
		
		
		
		
		
	}
}
*/


public class teste
{
	public static void main(String[] args) throws SQLException, ConectException
	{
		
		
		
		//ViewRegistrarOS view = new ViewRegistrarOS();
		//view.setVisible(true);
		
		viewCancelarOS view = new viewCancelarOS();
		view.setVisible(true);
		
		
		
	}
}





/*------- buscando nome do cliente -----*/



/*
public class teste
{
	public static void main(String[] args)throws SQLException, ConectException
	{
		Scanner leitura = new Scanner(System.in);
		
		String buscaTelefone = leitura.nextLine();
		
		Controladora control = new Controladora();
		
		String result =control.buscaNome(buscaTelefone);
		
		System.out.println("resultado: " + result);
		
		
		
		
		
	}
}
*/



/*
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



/*-----inserindo dados na OS-----*/




/*
public class teste {
    public static void main(String[] args) throws ConectException {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Controladora contro = new Controladora();
        System.out.println("Inserir uma nova OS");



        System.out.println("Informe a data de início: ");
        String dataInicio = scanner.nextLine();


        System.out.println("Informe a reclamação: ");
        String reclamacao = scanner.nextLine();

        System.out.println("Informe a análise do técnico: ");
        String analiseTecnico = scanner.nextLine();

        System.out.println("Informe o status: ");
        String status = scanner.nextLine();

        System.out.println("Informe a data de fechamento: ");
        String dataFechamento = scanner.nextLine();

        System.out.println("Informe o valor da manutenção: ");
        float valorManutencao = scanner.nextFloat();
        scanner.close(); // Fechar o scanner


        try {
            contro.RegistrarOS(0, dataInicio, reclamacao, analiseTecnico, status, null, valorManutencao);
            System.out.println("OS inserida com sucesso no banco de dados.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao inserir a OS: " + e.getMessage());
        }
    }
}
*/




/*-----busca funcionario-----*/




/*


public class teste {
    public static void main(String[] args) {
  
		Scanner leitura = new Scanner(System.in);
		/*
		FuncionarioDAO funcDAO = new FuncionarioDAO();
		

        try {
        	
        	System.out.printf("digite nome do funcionario que deseja buscar: ");
        	
            String buscaNome = leitura.nextLine();


            Funcionario funcionarioEncontrado = FuncionarioDAO.buscaTecnico(buscaNome);

            if (funcionarioEncontrado != null)
            {
            	System.out.println();
                System.out.println("Funcionario Encontrado:");
                System.out.println("Nome: " + funcionarioEncontrado.getNome());
                /*
                System.out.println("Endereço: " + funcionarioEncontrado.getEndereco());
                System.out.println("Telefone: " + funcionarioEncontrado.getNumeroTelefone());
                
            } else {
                System.out.println("Funcionario não registrado no sistema! ");
                System.out.println("com o nome de " + buscaNome + ".");
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



/*----- inserindo cliente-----*/



/*
public class teste {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Connection conexao = null;
        PreparedStatement stmt = null;

        try {

            System.out.print("Nome: ");
            String nome = ler.nextLine();
            System.out.print("Telefone: ");
            String telefone = ler.nextLine();
            System.out.print("Endereço: ");
            String endereco = ler.nextLine();

            String sql = "INSERT INTO clientes (nome, telefone, endereco) VALUES (?, ?, ?)";

            conexao = Conect.getConect();

     
            stmt = conexao.prepareStatement(sql);

     
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, endereco);

       
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
