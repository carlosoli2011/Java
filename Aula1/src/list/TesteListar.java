package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteListar {

	public static void main(String[] args) {
		// TODO 
		List lista1 = new ArrayList();
		List lista2 = new ArrayList();
		
		lista1.add("Teste lista 1");
		lista1.add("Teste lista 1.1");
		lista1.add("Teste lista 1.2");
		lista1.add(1);
		
		System.out.println("Minha Lista ");
		for(Object object : lista1){
			System.out.println(object);
		}
		
		List<String> listaStrig = new LinkedList();
		
		listaStrig.add("A");
		listaStrig.add("B");
		listaStrig.add("C");
		listaStrig.add("D");
		
		int indexOf = listaStrig.indexOf("C");//verifica a posição de C
		System.out.println("Valor C esta na posição "+indexOf);
		
		System.out.println("Minha Lista String");
		for(String valor : listaStrig){
			System.out.println(valor);
		}
		
		
	}

}
