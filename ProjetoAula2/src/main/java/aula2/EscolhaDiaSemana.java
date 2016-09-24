package aula2;

import java.util.Scanner;

public class EscolhaDiaSemana {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		int diaSemana = scanner.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Dia invalido");
		}
		scanner.close();
		
	}

}
