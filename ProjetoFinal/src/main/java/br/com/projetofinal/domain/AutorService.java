package br.com.projetofinal.domain;

import java.util.ArrayList;
import java.util.List;

public class AutorService {
	// cria uma lista statica de autores
	public static List<Autor> autores = new ArrayList<>();

	// retorna uma lista statica de autores
	public static List<Autor> listar() {
		return autores;
	}

	// salva objeto autor statico
	public static void salvar(Autor autor) {
		autores.add(autor);
	}
}
