package model;

public class OS 
{
	private int id;
	private String dataInicio;
	private String reclamacao;
	private String analiseTecnico;
	private	String status;
	private String dataFechamento;
	private	float valorManutencao;
	
	

	public OS(int id, String dataInicio, String reclamacao, String status) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
		this.reclamacao = reclamacao;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getReclamacao() {
		return reclamacao;
	}

	public void setReclamacao(String reclamacao) {
		this.reclamacao = reclamacao;
	}

	public String getAnaliseTecnico() {
		return analiseTecnico;
	}

	public void setAnaliseTecnico(String analiseTecnico) {
		this.analiseTecnico = analiseTecnico;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public float getValorManutencao() {
		return valorManutencao;
	}

	public void setValorManutencao(float valorManutencao) {
		this.valorManutencao = valorManutencao;
	}
	
	
	
	
	
	
	
	
}