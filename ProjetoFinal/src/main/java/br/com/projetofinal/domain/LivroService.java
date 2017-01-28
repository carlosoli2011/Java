package br.com.projetofinal.domain;

import java.util.ArrayList;
import java.util.List;

public class LivroService {
	// cria uma lista statica de livros
	public static List<Livro> livros = new ArrayList<>();

	// retorna uma lista statica de livros
	public static List<Livro> listar() {
		return livros;
	}

	// salva objeto livro statico
	public static void salvar(Livro livro) {
		livros.add(livro);
	}
}
