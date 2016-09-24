package aula2;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = new Random().nextInt(3) + 1;
		int tentativas;
		
		
		System.out.println("Digite um numero: ");
		int chute = scanner.nextInt();
		
		
		for(tentativas = 1; numero != chute; tentativas++){
			
				System.out.println("Chute errado, Digite novamente: ");
				chute = scanner.nextInt();
		}
		
		System.out.println("Parabens, voce acertou em:"+tentativas+" Tentativas");
				
		
		
		
		
		
		

	}

}
