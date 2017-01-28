package br.com.projetofinal.domain;

public class Livro {

	private Autor autor;
	private String titulo;
	private String editora;

	public Livro(Autor autor, String titulo, String editora) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.editora = editora;
	}
	
	public Livro() {
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
}
