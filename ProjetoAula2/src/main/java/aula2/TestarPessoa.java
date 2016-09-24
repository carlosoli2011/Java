package aula2;

import java.util.Scanner;

public class TestarPessoa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		System.out.println("Digite seu CPF: ");
		int cpf = scanner.nextInt();
		System.out.println("Digite seu RG: ");
		int rg = scanner.nextInt();
		
		Pessoa pessoa = new Pessoa(nome, cpf, rg);
		//System.out.println("Dados pessoa:\nNome: "+nome+"\nCPF: "+cpf+"\nRG: "+rg);

		//pessoa.imprimir(nome, cpf, rg);
		
		System.out.println(pessoa);
	}

}
