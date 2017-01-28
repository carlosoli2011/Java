package br.com.projetofinal.domain;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

	private static List<Usuario> usuarios = new ArrayList<>();

	public static List<Usuario> listar() {
		return usuarios;
	}
	
	public static void salvar(Usuario usuario) {
		usuarios.add(usuario);
	}

	public static boolean logar(Usuario usuario) {
		if (usuario.getLogin().equals("admin") && usuario.getSenha().equals("123")) {
			return true;
		}

		for (Usuario u : usuarios) {
			if (usuario.getLogin().equals(u.getLogin()) && usuario.getSenha().equals(u.getSenha())) {
				return true;
			}
		}
		return false;
	}
}
