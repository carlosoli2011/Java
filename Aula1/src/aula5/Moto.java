package aula5;

public class Moto extends Veiculo implements PagaPedagio{

	int qtdeEixos;
	public Moto() {
		qtdeEixos = 1;
	}

	public double qtdeDeEixos() {
		// TODO Auto-generated method stub
		return qtdeEixos;
	}

	@Override
	public String toString() {
		return "Moto [qtdeEixos=" + qtdeEixos + "]";
	}
	
	

}
