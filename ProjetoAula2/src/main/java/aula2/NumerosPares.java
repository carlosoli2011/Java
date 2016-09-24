package aula2;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		// cria um scanner
		Scanner scanner = new Scanner(System.in);

		// imprime mensagem
		System.out.println("Digite um numero: ");

		// guarda na variavel o valor digitado
		int valorDigitado = scanner.nextInt();
		// inicia variavel com 0
		int contadorPar = 0;

		// enquanto i=1 for <=
		// valorDigitado i
		// incrementa +1
		for (int i = 1; i <= valorDigitado; i++) {

			// codição para saber se é numero par i/2 se restou algum valor
			if (i % 2 == 0) {
				// imprime i
				System.out.println(i);
				// incrementa contadorPar para saber onde parar
				contadorPar++;
			}
			// se o contador for = 10 sai for
			if (contadorPar == 10) {

				// para a execução;
				break;
			}
		}

	}

}
