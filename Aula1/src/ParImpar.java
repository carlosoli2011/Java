import java.util.Scanner;


public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroInformado = 0;
		String mensagem = "";
		//cria scanner
		Scanner scanner = new Scanner(System.in);
		//imprime a pergunta na tela
		System.out.println("Digite um numero para saber se é impar ou par: ");
		//armazena o valor digitado na variavel
		numeroInformado = scanner.nextInt();
		//mensagem recebe par caso o numeroInformado não tenha valor restante da divisão
		//mensagem recebe impar caso o numeroInformado tenha valor restante da divisão
		mensagem = numeroInformado % 2 == 0 ? "Par" : "impar";
		//imprime resultado da mensagem
		System.out.println(mensagem);
		
	}

}
