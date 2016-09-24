import java.util.Scanner;


public class CaixaEletronico {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int valorSaque;
		int restante;
		
		
		System.out.println("Digite a quantidade para saque: ");
		valorSaque = scanner.nextInt();
		restante = valorSaque;

		int quantidadeNotas100;
		quantidadeNotas100 = restante / 100;
		restante = restante % 100;
		
		
		int quantidadeNotas50;
		quantidadeNotas50 = restante / 50;
		restante = restante % 50;
		
		
		int quantidadeNotas20;
		quantidadeNotas20 = restante / 20;
		restante = restante % 10;
		
		
		
		int quantidadeNotas10;
		quantidadeNotas10 = restante / 10;
		restante = restante % 10;
		
		
		
		int quantidadeNotas5;
		quantidadeNotas5 = restante / 5;
		restante = restante % 5;
		
		
		
		if(restante > 0){
			System.out.println("Valor indisponivel para saque: "+valorSaque);
		}else{
			if(quantidadeNotas100 > 0){
				System.out.println("Quantidade de notas de R$ 100 para saque: "+quantidadeNotas100);
			}
			//if
			if(quantidadeNotas50 > 0){
				System.out.println("Quantidade de notas de R$ 50 para saque: "+quantidadeNotas50);
			}
			//if
			if(quantidadeNotas20 > 0){
				System.out.println("Quantidade de notas de R$ 10 para saque: "+quantidadeNotas20);
			}
			//if
			if(quantidadeNotas5 > 0){
				System.out.println("Quantidade de notas de R$ 5 para saque: "+quantidadeNotas5);
			}
			//if
			if(quantidadeNotas10 > 0){
				System.out.println("Quantidade de notas de R$ 10 para saque: "+quantidadeNotas10);
			}
		}
		
		
		
		
					
		scanner.close();
	}

}
