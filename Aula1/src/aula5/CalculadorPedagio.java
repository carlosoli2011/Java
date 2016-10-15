package aula5;

public class CalculadorPedagio {
	
	public double calcular(PagaPedagio pagaPedagio){
		double qtdePorEixo = pagaPedagio.qtdeDeEixos();
		
		return qtdePorEixo * 10;
	}
	


}
