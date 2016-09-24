package aula2;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);// cria um scanner
		System.out.println("Digite um numero: ");// imprime mensagem
		int valorDigitado = scanner.nextInt();// guarda na variavel o valor
												// digitado
		int contadorPar = 0;// inicia variavel com 0

		for (int i = 1; i <= valorDigitado; i++) {// enquanto i=1 for <=
													// valorDigitado i
													// incrementa +1
			if (i % 2 == 0) {// codição para saber se é numero par i/2 se restou
								// algum valor
				System.out.println(i);// imprime i
				contadorPar++;// incrementa contadorPar para saber onde parar
			}
			if (contadorPar == 10) {// se o contador for = 10

				break; // para a execução;
			}
		}

	}

}
