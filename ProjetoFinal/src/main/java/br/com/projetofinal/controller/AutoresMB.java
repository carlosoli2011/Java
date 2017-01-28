package br.com.projetofinal.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.projetofinal.domain.Autor;
import br.com.projetofinal.domain.AutorService;

@ManagedBean(name = "autorMB")
public class AutoresMB {
	
	private Autor autor = new Autor();
	
	private List<Autor> autores = AutorService.listar();
	
	public List<Autor> getAutores() {
		return autores;
	}
	
	public String salvar() {
		AutorService.salvar(autor);
		FacesUtils.createSuccessMessage("Autor cadastrado com Sucesso!");
		return "listagem?faces-redirect=true";
	}
	
	public String irParaNovoAutor() {
		return "novoAutor?faces-redirect=true";
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
}
