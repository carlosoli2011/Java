
import java.util.Scanner;


public class CalculaIdade {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		int maior = 18;
		String mensagem = "";
		
		mensagem = idade >= maior ? "Maior de idade" : "Menor de Idade"; 
		System.out.println(mensagem);
		
	}

}
