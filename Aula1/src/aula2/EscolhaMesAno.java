package aula2;

import java.util.Scanner;

public class EscolhaMesAno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o mês: ");
		int EscolhaMes = scanner.nextInt();
		
		switch (EscolhaMes) {
		case 1:
			System.out.println("Janeiro \n" );
		case 2:
			System.out.println("Fevereiro \n" );
		case 3:
			System.out.println("Março \n" );
		case 4:
			System.out.println("Abriu \n" );
		case 5:
			System.out.println("Maio \n" );
		case 6:
			System.out.println("junho \n" );
		case 7:
			System.out.println("Julho \n" );
		case 8:
			System.out.println("Agosto \n" );
		case 9:
			System.out.println("Setembro \n" );
		case 10:
			System.out.println("Outubro \n" );
		case 11:
			System.out.println("Novembro \n" );
		case 12:
			System.out.println("Dezembro \n" );

			break;//sai fora do switc, não passando pelo default.
		default:
			System.out.println("Escolha invalida");
		}
		//continua o programa depois do break
	}

}
