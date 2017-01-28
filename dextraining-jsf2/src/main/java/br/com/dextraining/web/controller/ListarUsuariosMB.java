package br.com.dextraining.web.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.dextraining.domain.Usuario;
import br.com.dextraining.domain.UsuarioService;

@ManagedBean(name="listarUsuariosMB")
public class ListarUsuariosMB {

	private List<Usuario> usuarios;
	
	@PostConstruct
	public void carregar() {
		this.usuarios = UsuarioService.listarTodos();
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}

	
}
