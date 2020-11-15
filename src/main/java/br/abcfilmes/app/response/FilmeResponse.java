package br.abcfilmes.app.response;

public class FilmeResponse {

	private String nome;
	private int ano;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getAno() {
		return this.ano;
	}
	
}
