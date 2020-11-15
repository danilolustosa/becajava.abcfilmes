package br.abcfilmes.app.request;

public class FilmeRequest extends BaseRequest {
	

	private int ano;
	private CategoriaRequest categoria;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public CategoriaRequest getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaRequest categoria) {
		this.categoria = categoria;
	}
	
	
}
