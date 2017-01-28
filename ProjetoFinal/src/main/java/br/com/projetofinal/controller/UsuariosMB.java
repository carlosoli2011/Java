package br.com.projetofinal.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.projetofinal.domain.Usuario;
import br.com.projetofinal.domain.UsuarioService;

@ManagedBean(name = "usuarioMB")
public class UsuariosMB {

	private Usuario usuario;

	private List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public String salvar() {
		UsuarioService.salvar(usuario);
		FacesUtils.createSuccessMessage("Usuario cadastrado com Sucesso!");
		return "listagem?faces-redirect=true";
	}

	public String irParaNovoUsuario() {
		this.usuario = new Usuario();
		return "novoUsuario?faces-redirect=true";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
