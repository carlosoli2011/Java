package aula2;

public class Interruptor {
	
	Lampada lampada;//objeto
	
	public Interruptor(Lampada lampada){//construtor que recebe lampada
		this.lampada = lampada;
	}
	
	public void apertar(){
		if (lampada.estaLigada()) {
			
			lampada.desligar();
		}else{
			lampada.ligar();
		}
		
	}

}
