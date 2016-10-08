package aula3Array;

import java.util.Scanner;

public class InverteArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe os numeros:");
		int n = scanner.nextInt();
		int[] numeros = new int[n], numerosInvertidos = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("informe numeros na posição "+i+": ");
			numeros[i] = scanner.nextInt();
		}
		
		for (int i = numeros.length; i >= n; i--) {
			System.out.println(i);
		}
		
	}

}
