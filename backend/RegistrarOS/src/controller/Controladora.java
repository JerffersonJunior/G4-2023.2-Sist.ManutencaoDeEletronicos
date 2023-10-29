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
    



/*
    public void registrarOS(String nomeTecnico, String nomeCliente, OS os) {
        // Verifique se o técnico e o cliente existem
        if (existeFuncionario(nomeTecnico) && existeCliente(nomeCliente)) {
            // Associe o técnico à OS
            os.setTecnico(nomeTecnico);
            
            // Registre a OS no banco de dados
            try {
                osDAO.buscaOS(os);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    */

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


}
