package model;

public class Funcionario 
{
	private String nome;
	private String endereco;
	private String numeroTelefone;
	private String email;
	private String senha;
	private String tipoFuncionario;
	
	
	public Funcionario(String nome, String endereco, String numeroTelefone, String email, String senha,String tipoFuncionario) 
	{
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
		this.senha = senha;
		this.tipoFuncionario = tipoFuncionario;
	}
	
	/* segundo contrutor*/
	public Funcionario(String nome) {
		super();
		this.nome = nome;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}


	
	
	
	
	
	
}
