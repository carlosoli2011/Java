package aula4;

public class Equipamento {
	private double preco;
	private String fabricante;
	
//	public Equipamento(double preco){
//		this.preco = preco;
//	}
	
	public Equipamento(String fabricante, double preco){
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	//metodo
	public double calcularPrecoFinal(){
		return getPreco();
	}
	
	//get set
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Equipamento [Fabricante = " + fabricante + ", preço = " + preco
				+ ", Metodo calcularPrecoFinal() = " + calcularPrecoFinal()
				+ ", getPreco() = " + getPreco()+"]";
	}
	
	

}
