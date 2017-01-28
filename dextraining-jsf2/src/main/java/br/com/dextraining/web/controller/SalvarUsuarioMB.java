package br.com.dextraining.web.controller;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import br.com.dextraining.domain.Usuario;
import br.com.dextraining.domain.UsuarioService;

@ManagedBean(name="salvarUsuarioMB")
public class SalvarUsuarioMB {	
	
	private Usuario usuario = new Usuario();
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void salvar() {
		//metodo salvar
		UsuarioService.salvar(usuario);
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		try {
			ec.redirect("/listarusuarios.jsf");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
