package aula5;

public class Caminhao extends Veiculo implements PagaPedagio{

	int qtdeEixos;
	
	public Caminhao() {
	}
	
	public Caminhao(int qtdeEixos){
		this.qtdeEixos = qtdeEixos;
	}

	public double qtdeDeEixos() {
		// TODO Auto-generated method stub
		return qtdeEixos;
	}

	@Override
	public String toString() {
		return "Caminhao [qtdeEixos=" + qtdeEixos + "]";
	}
	

}
