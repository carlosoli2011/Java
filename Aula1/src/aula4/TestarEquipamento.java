package aula4;

import java.util.Scanner;

public class TestarEquipamento {
	
	
	
	
	public static void main(String[] args) {
		Equipamento televisao = new Televisao("LG", 1000.00, "Smartv");
		Equipamento cadeira = new Cadeira("João", 15.20, "Padão");
		Equipamento cadeira2 = new Cadeira("João2", 20.00, "Padão2");
		
		Equipamento[] equipamentos;
		equipamentos = new Televisao[2];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String fabricante = null;
			double preco = 0.0;
			String modelo = null;
			fabricante = scanner.next();
			preco = scanner.nextDouble();
			modelo = scanner.next();
			equipamentos[i]=new Televisao(fabricante, preco, modelo);
			
			
		}
		//System.out.println("Televisão: "+televisao);
		//System.out.println("Televisão: "+televisao.calcularPrecoFinal());
		//System.out.println("Cadeira: "+cadeira);
		//System.out.println("Cadeira: "+cadeira.calcularPrecoFinal());
		
		double valorTotal = imprimirValorTotal(equipamentos);
		System.out.println("Valor Total: "+valorTotal);
		//System.out.println(equipamentos);
		
		
	}
	
	
	

	public static double imprimirValorTotal(Equipamento... equipamentos){
		double valorTotal = 0;
		for(Equipamento equipamento : equipamentos){
			System.out.println(equipamento.getClass().getSimpleName()+ ": "
			+ equipamento.calcularPrecoFinal()+"");
			valorTotal += equipamento.calcularPrecoFinal();
		}
		return valorTotal;
	}
}
