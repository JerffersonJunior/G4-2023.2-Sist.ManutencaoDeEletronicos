package model;

public class Eletronico 
{
	private String categoria;
	private String marca;
	private String modelo;
	private String serie;
	public Eletronico(String categoria, String marca, String modelo, String serie) {
		super();
		this.categoria = categoria;
		this.marca = marca;
		this.modelo = modelo;
		this.serie = serie;
	}
	
	/*segundo construtor*/
	
	
	
	public String getCategoria() {
		return categoria;
	}
	public Eletronico(String serie) {
		super();
		this.serie = serie;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	
}
