package aula4;

public class Eletronico extends Equipamento{

	public Eletronico(String fabricante, double preco) {
		super(fabricante, preco);
	}
	
	@Override
	public double calcularPrecoFinal(){
		double valorFinal = getPreco();
		valorFinal += (this.getPreco() * 0.10);
		return valorFinal;
	}
	
	

}
