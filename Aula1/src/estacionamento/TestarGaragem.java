package estacionamento;

import java.util.Scanner;

public class TestarGaragem {

	public static void menu() {
		System.out.println("##Menu##");
		System.out.println("1. Adicionar");
		System.out.println("2. Vender");
		System.out.println("3. Buscar");
		System.out.println("4. Listar");
		System.out.println("5. Sair");
	}

	public static void main(String[] args) {
		// TODO
		int opcao = 0;
		//Garagem garagem = new Garagem();
		Scanner scanner = new Scanner(System.in);

		while (opcao != 5) {
			
			menu();
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:

				Veiculo veiculo = new Veiculo();

				System.out.println("Marca: ");
				veiculo.setMarca(scanner.next());
				System.out.println("Modelo: ");
				veiculo.setModelo(scanner.next());
				System.out.println("Placa: ");
				veiculo.setPlaca(scanner.next());
				System.out.println("Ano: ");
				veiculo.setAno(scanner.next());
				System.out.println("Preço: ");
				veiculo.setPreco(scanner.nextDouble());
				//garagem.adicionar(veiculo);
				System.out.println("Veiculo adicionado: " + veiculo);
				
				break;

//			case 2:
//				//Garagem vGaragem = new Garagem();
//				System.out.println("Digite a placa: ");
//				vGaragem.vender(scanner.next());
//				
//				break;
//			case 3:
//				Garagem bGaragem = new Garagem();
//				System.out.println("Digite a placa: ");
//				String placa = scanner.next();
				
				
//				for (Veiculo lista : garagem.listar()) {
//
//					System.out.println(lista.getMarca() + " - "
//							+ lista.getModelo() + " - " + lista.getPlaca()
//							+ " - " + lista.getAno() + " - " + lista.getPreco()
//							+ " - ");
//
//				}
				
				//break;
			case 4:
				// faz for
				System.out.println("Lista de Veiculos");
//				for (Veiculo lista : garagem.listar()) {
//
//					System.out.println(lista.getMarca() + " - "
//							+ lista.getModelo() + " - " + lista.getPlaca()
//							+ " - " + lista.getAno() + " - " + lista.getPreco()
//							+ " - ");
//
//				}
				
				break;
			case 5:
				System.out.println("Encerrado");
				

				break;

			}

			
		}
		scanner.close();
	}

}
