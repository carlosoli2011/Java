package aula2;

public class Lampada {
	
	private int numeroDeWatts;
	private String nomeFabricante;
	boolean status = false;
	Lampada lampada;
	int watts;
	
	public Lampada(int watts, String fabricante){
		this.watts = watts;
	}
	
	
	
	
	public void ligar(){
		System.out.println("Ligada");
		status = true;
	}
	public void desligar(){
		System.out.println("Desligada");
		status = false;
	}
	
	public boolean estaLigada(){
		
		return status;
	}
}
	
	