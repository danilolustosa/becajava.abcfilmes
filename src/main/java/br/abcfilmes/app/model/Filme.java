package br.abcfilmes.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int ano;
	
	@ManyToOne
	@JoinColumn(name = "categoriaId")
	private Categoria categoria;
	
	public Filme() {		
	}
	
	public Filme(String nome, int ano, Categoria categoria) {
		this.nome = nome;
		this.ano = ano;
		this.categoria = categoria;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
