package aula3Biblioteca;

import java.sql.Date;

public class Livro {
	
	//atributos
	String codigo;
	String autor;
	String livro;
	Date dataPublicacao;
	
	//construtor com parametro
	public Livro(String codigo, String autor, String livro, Date dataPublicação){
		this.codigo = codigo;
		this.autor = autor;
		this.livro = livro;
		this.dataPublicacao = dataPublicação;
	}//fim do construtor
	
	//Metodos
	public void adidionarLivros(){
		//TODO
	}//fim do metodo adicionar
	
	public void buscarLivros(){
		//TODO
	}//fim do metodo buscar
	
	public void listarLivros(){
		//TODO
	}//fim do metodo Listar
	
	

}//fim da classe
