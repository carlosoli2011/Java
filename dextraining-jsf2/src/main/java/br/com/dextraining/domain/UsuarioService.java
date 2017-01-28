package br.com.dextraining.domain;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

	public static boolean logar(Usuario usuario) {
		if (usuario.getLogin().equals("admin") && usuario.getSenha().equals("admin")) {
			return true;
		}
		return false;
	}
	
	static List<Usuario> usuarioList = new ArrayList<>();
	
	public static void salvar(Usuario usuario) {
		
		usuarioList.add(usuario);
	}
	
	public static List<Usuario> listarTodos(){
		return usuarioList;
	}
	
	

}
