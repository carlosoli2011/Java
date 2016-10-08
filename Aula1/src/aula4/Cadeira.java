package aula4;

public class Cadeira extends Equipamento{
	//atributos
	private String modelo;
	
	//construtor
	public Cadeira(String fabricante, double preco, String modelo){
		super(fabricante, preco);
	}
	
	//pode deixar sem o metodo se a classe cadeira nao possui nenhuma particularidade da classe pai
//	@Override
//	public double calcularPrecoFinal(){
//		double valorFinal = getPreco();
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
