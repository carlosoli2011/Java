package br.com.dextraining.web.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "initMB")
@SessionScoped
public class InitMB {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String nome = "Raoni";
	
	
	
}
