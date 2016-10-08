package aula3Array;

import java.util.Scanner;



public class ArrayComFor {
	
	public static void main(String[] args) {
		
		int count = 10;//variavel
		
		Scanner scanner = new Scanner(System.in);//console
		
		int[] numeros = new int [count];//inicializa array numeros
		
		for (int i = 0; i < count; i++) {//enquanto i < count faça
			System.out.println("Numeros ["+i+"] = ");//imprime posição do i
			numeros[i] = scanner.nextInt();//posição i recebe leitura
		}//fim do for de numeros
		
		for(int num : numeros){//foreach anda pelo array e retorna as posições
			System.out.println(num);
		}//fim do foreach
		

		
		scanner.close();
		
	}
	
	

}//fim da classe
