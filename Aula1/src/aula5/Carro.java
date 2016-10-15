package aula5;

public class Carro extends Veiculo implements PagaPedagio{
	int qtdeEixos;

	public Carro() {
		qtdeEixos = 2;
	
	}

	public double qtdeDeEixos() {
		// TODO Auto-generated method stub
		return qtdeEixos;
	}

	@Override
	public String toString() {
		return "Carro [qtdeEixos=" + qtdeEixos + "]";
	}
	
	

}
