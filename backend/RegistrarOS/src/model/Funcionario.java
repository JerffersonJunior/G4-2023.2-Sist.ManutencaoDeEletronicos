package model;

public class Funcionario 
{
	private String nome;
	private String endereco;
	private String numeroTelefone;
	private String email;
	private String serie;
	private String tipoFuncionario;
	
	
	public Funcionario(String nome, String endereco, String numeroTelefone, String email, String serie,
			String tipoFuncionario) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
		this.serie = serie;
		this.tipoFuncionario = tipoFuncionario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	
	
	
	
	
}
