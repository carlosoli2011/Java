package aula4;

public class Televisao extends Eletronico{
	//atributos
	private String modelo;
	
	//construtor
	public Televisao(String fabricante, double preco, String modelo){
		super(fabricante, preco);
		this.modelo = modelo;
		
	}
	
//	@Override
//	public double calcularPrecoFinal(){
//		double valorFinal = getPreco();
//		valorFinal += (this.getPreco() * 0.02);
//		return valorFinal;
//	}
	
	//get set
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
