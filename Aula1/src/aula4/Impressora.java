package aula4;

public class Impressora extends Equipamento{
	private int pontosPorPolegada;
	
	public int getPontosPorPolegada() {
		return pontosPorPolegada;
	}
	public void setPontosPorPolegada(int pontosPorPolegada) {
		this.pontosPorPolegada = pontosPorPolegada;
	}
	
	public Impressora(String fabricante, double preco, int pontosPorPolegada){
		super(fabricante, preco);
		this.pontosPorPolegada = pontosPorPolegada;
	}
	
	public void imprimir(){
		System.out.println("metodo imprimir pontos por polegada "+getPontosPorPolegada());
		System.out.println("metodo imprimir preço "+getPreco());
				
	}
	@Override
	public String toString() {
		return "Impressora [pontosPorPolegada=" + pontosPorPolegada
				+ ", getPontosPorPolegada()=" + getPontosPorPolegada()
				+ ", getPreco()=" + getPreco() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

	

}
