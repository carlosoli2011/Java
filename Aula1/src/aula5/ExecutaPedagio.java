package aula5;

public class ExecutaPedagio {

	public static void main(String[] args) {
		// TODO 
		
		Carro carro = new Carro();
		Moto moto = new Moto();
		Caminhao caminhao = new Caminhao(4);
		Bicicleta bicicleta = new Bicicleta("Caloi");
		
		CalculadorPedagio calculadorPedagio = new CalculadorPedagio();
		System.out.println(carro+" "+calculadorPedagio.calcular(carro));
		System.out.println(moto+" "+calculadorPedagio.calcular(moto));
		System.out.println(caminhao+" "+calculadorPedagio.calcular(caminhao));

	}

}
