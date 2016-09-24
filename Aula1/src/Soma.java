import java.util.Scanner;


public class Soma {
	public static void main(String[] args) {
		//cria scanner
		
		double numero1 = 0, numero2 = 0;
		
				Scanner scanner = new Scanner(System.in);
				//imprime a pergunta na tela
				System.out.println("Digite o Primeiro numero:");
				//armazena o valor digitado na variavel
				numero1 = scanner.nextDouble();
				
				//imprime a segunda pergunta na tela
				System.out.println("Digite o Segundo numero:");
				//armazena o valor digitado na variavel
				numero2 = scanner.nextDouble();
				//imprime o resultado comparando se são iguais ou não
				
				System.out.println("#################Operadores Aritiméticos######################");
				System.out.println("#################Soma: {"+numero1+"} + {"+numero2+"} = {"+(numero1 + numero2)+"}######################");//case sensitive
				System.out.println("############Subtração: {"+numero1+"} - {"+numero2+"} = {"+(numero1 - numero2)+"}######################");
				System.out.println("########Multiplicação: {"+numero1+"} * {"+numero2+"} = {"+(numero1 * numero2)+"}######################");
				System.out.println("##############Divisão: {"+numero1+"} / {"+numero2+"} = {"+(numero1 / numero2)+"} ######################");
				System.out.println("#####Resto da Divisão: {"+numero1+"} % {"+numero2+"} = {"+(numero1 % numero2)+"} ######################");
				//System.out.println(nome1.equalsIgnoreCase(nome2)); not case sensitive
				scanner.close();
	}

}
