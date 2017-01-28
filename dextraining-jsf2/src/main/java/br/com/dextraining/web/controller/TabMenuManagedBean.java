package br.com.dextraining.web.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class TabMenuManagedBean {
	private int listar = 0;

	public int getListar() {
		return listar;
	}

	public void setListar(int listar) {
		this.listar = listar;
	}

	public String doUsuarioList(){
		// Do some work
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Some Work Achieved"));
		// Change the index that TabMenu refers as activated tab
		listar = 1;
		return "/listarusuarios.jsf";
	}
	
	public String doFuncionarioList(){
		// Do some work
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Some Work Achieved"));
		// Change the index that TabMenu refers as activated tab
		listar = 1;
		return "/listarFuncionario.jsf";
	}
	
	public String doCadastroUsuario(){
		// Do some work
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Some Work Achieved"));
		// Change the index that TabMenu refers as activated tab
		listar = 1;
		return "/cadastrar.jsf";
	}
	
	public String doCadastroFuncionario(){
		// Do some work
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Some Work Achieved"));
		// Change the index that TabMenu refers as activated tab
		listar = 1;
		return "/cadastrarFuncionario.jsf";
	}
}
