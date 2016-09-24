import java.util.Scanner;




public class ComparaString {
	public static void main(String[] args) {
		//cria scanner
		Scanner scanner = new Scanner(System.in);
		//imprime a pergunta na tela
		System.out.println("Digite o Primeiro nome:");
		//armazena o valor digitado na variavel
		String nome1 = scanner.next();
		
		//imprime a segunda pergunta na tela
		System.out.println("Digite o Segundo nome:");
		//armazena o valor digitado na variavel
		String nome2 = scanner.next();
		//imprime o resultado comparando se são iguais ou não
		System.out.println(nome1.equals(nome2));//case sensitive
		//System.out.println(nome1.equalsIgnoreCase(nome2)); not case sensitive
		scanner.close();
		
	}

}
