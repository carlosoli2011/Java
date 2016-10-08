package aula2;

import java.util.Scanner;

public class StatusLampada {

	public static void main(String[] args) {
		

		
		
		Lampada lampada = new Lampada(60, "Teste");

		Interruptor interruptor = new Interruptor(lampada);
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();

	}

}
