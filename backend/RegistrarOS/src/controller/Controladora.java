package controller;

import java.sql.SQLException;

import model.*;
import database.*;

public class Controladora 
{
    ClienteDAO cliDAO = new ClienteDAO();
    FuncionarioDAO funcDAO = new FuncionarioDAO();
    OSDAO OSD = new OSDAO();
    
    Cliente cli;

	     



	public void registrarOS(String nomeTecnico, String nomeCliente, OS os) throws SQLException, ConectException {
	    
	    if (existeFuncionario(nomeTecnico) && existeCliente(nomeCliente)) {
	       
	        os.setAnaliseTecnico(nomeTecnico);

	        int id = os.getId();
	        String dataInicio = os.getDataInicio();
	        String reclamacao = os.getReclamacao();
	        String analiseTecnico = os.getAnaliseTecnico();

	        String status = os.getStatus();
	        String dataFechamento = os.getDataFechamento();
	        float valorManutencao = os.getValorManutencao();

	      
	        OSD.adicionarOS(id, dataInicio, reclamacao, analiseTecnico, status, dataFechamento, valorManutencao);
	    }
	}
	
	
	public void telefonePreenchido(String telefone) {

        if (telefone != null && !telefone.isEmpty()) {

            System.out.println("Telefone preenchido: " + telefone);

        } else {

            System.out.println("Telefone não preenchido.");

        }
    }

   






    public void seriePreenchido(String serie) {

        if (serie != null && !serie.isEmpty()) {

            System.out.println("Série preenchida: " + serie);

        } else {

            System.out.println("Série não preenchida.");

        }
    }

    public void dataInicioPreenchido(String dataInicio) {

        if (dataInicio != null && !dataInicio.isEmpty()) {

            System.out.println("Data de início preenchida: " + dataInicio);
        } else {

            System.out.println("Data de início não preenchida.");
        }
    }


    public void reclamacaoPreenchido(String reclamacao) {

        if (reclamacao != null && !reclamacao.isEmpty()) 
        {
        	
            System.out.println("Reclamação preenchida!!: " + reclamacao);
        } else {

            System.out.println("Data de início não preenchida.");
        }
    }
    
    
	public void analiseTecnicoPreenchido(String analiseTecnico) {
	    if (analiseTecnico != null && !analiseTecnico.isEmpty()) {
	        System.out.println("Análise do técnico preenchida: " + analiseTecnico);
	    } else {
	        System.out.println("Análise do técnico não preenchida.");
	    }
	}


  
	public boolean existeCliente(String telefone) throws ConectException {
        try {
            if (cliDAO.buscaCliente(telefone) != null) {
                cli = cliDAO.buscaCliente(telefone);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
	

	
	public boolean existeFuncionario(String nome) {

	    try {
	        Funcionario funcionarioEncontrado = funcDAO.buscaTecnico(nome);
	        return funcionarioEncontrado != null;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ConectException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	
	public boolean existeOS(int id) {

	    try {
	        OS osEncontrada = OSD.buscaOS(id);
	        return osEncontrada != null;
	        
	    } catch (SQLException e) {
	        e.printStackTrace();

	    } catch (ConectException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	
	



}
