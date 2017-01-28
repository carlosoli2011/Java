package br.com.projetofinal.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.projetofinal.domain.Livro;
import br.com.projetofinal.domain.LivroService;

@ManagedBean(name = "livroMB")
public class LivrosMB {
	
private Livro livro = new Livro();
	
	private List<Livro> livros = LivroService.listar();
	
	public List<Livro> getAutores() {
		return livros;
	}
	
	public String salvar() {
		LivroService.salvar(livro);
		FacesUtils.createSuccessMessage("Livro cadastrado com Sucesso!");
		return "listagem?faces-redirect=true";
	}
	
	public String irParaNovoLivro() {
		return "novoLivro?faces-redirect=true";
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
}
