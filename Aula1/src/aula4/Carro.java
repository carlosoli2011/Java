package aula4;

public class Carro extends Produto{
	private String modelo;
	
	public Carro(double preco, String modelo){
		super(preco);
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void imprimir(){
		System.out.println("Modelo "+getModelo());
		System.out.println("Preço "+getPreco());
		
	}

}
