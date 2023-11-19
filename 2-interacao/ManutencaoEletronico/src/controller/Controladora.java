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
    

	
	public String buscaNome(String telefone) throws ConectException, SQLException
	{
		return ClienteDAO.buscaNome(telefone);
	}
	
	
	
	
	public void adicionarOS(int id, String dataInicio, String reclamacao, String analiseTecnico, String status, String dataFechamento, float valorManutencao) throws SQLException, ConectException 
    {

        OSD.adicionarOS(id, dataInicio, reclamacao, analiseTecnico, "Em análise", dataFechamento, valorManutencao);
        
         
    }
    
	
    public boolean buscaEletronico(String serie)throws SQLException, ConectException
    {
    	return EletronicoDAO.buscaEletronico(serie);
    	
    	
    }
    
    
    

/*
    public void adicionarOS(int id, String dataInicio, String reclamacao, String analiseTecnico, String status, String dataFechamento, float valorManutencao) throws SQLException, ConectException 
    {
    	
        OSD.adicionarOS(id, dataInicio, reclamacao, analiseTecnico, status, dataFechamento, valorManutencao);
    }
    
   */
    
    


	



}




/* revisar */

/*
 * 
	public boolean existecliente(String telefone) throws ConectException {
        try {
            if (ClienteDAO.buscaNome(telefone) != null) {
                ClienteDAO.buscaNome(telefone);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
   
	

	
	public boolean existeFuncionario(String nome) {

	    try {
	        Funcionario funcionarioEncontrado = FuncionarioDAO.buscaTecnico(nome);
	        return funcionarioEncontrado != null;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ConectException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

 */










/*


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
*/