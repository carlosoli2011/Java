import java.util.Scanner;


public class JogoParImpar {
	
	public static void main(String[] args) {
		
		String nome1 = "", nome2 = "", mensagem;
		double numero1 = 0, numero2 = 0, resultado;
		
		
		
		
		//cria scanner
		Scanner scanner = new Scanner(System.in);
		//imprime a pergunta na tela
		System.out.println("Digite seu nome: ");
		nome1 = scanner.next();
		//imprime a pergunta na tela
		System.out.println(""+nome1+", Digite seu numero: ");
		numero1 = scanner.nextDouble();
		//imprime a pergunta na tela
		System.out.println("Digite seu nome: ");
		nome2 = scanner.next();
		//imprime a pergunta na tela
		System.out.println(""+nome2+", Digite seu numero: ");
		numero2 = scanner.nextDouble();
		resultado = numero1 + numero2;
		mensagem = resultado % 2 == 0 ? 
				"O Resultado do jogo foi: "+resultado+", o jogador: "+nome1+" venceu" : 
				"O Resultado do jogo foi: "+resultado+", o jogador: "+nome2+" venceu";
			
		System.out.println(mensagem);
		
		
		
	}

}
