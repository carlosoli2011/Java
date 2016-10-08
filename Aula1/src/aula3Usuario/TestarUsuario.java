package aula3Usuario;

import java.util.Scanner;

public class TestarUsuario {

	public static void main(String[] args) {
		// TODO 
		Usuario usuario = new Usuario(); 
		String validaSenha;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cadastro de usuário");
		System.out.println("Digite seu nome: ");
		usuario.setNome(scanner.next());
		System.out.println("Digite seu email: ");
		usuario.setEmail(scanner.next());
		System.out.println("Digite sua senha: ");
		validaSenha = scanner.next();
		usuario.setSenha(validaSenha);
	}

}
