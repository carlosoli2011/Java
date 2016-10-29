package estacionamento;

import java.util.List;

public interface Garagem {

	public boolean adicionar(Veiculo veiculo);

	public boolean vender(String placa);

	public Veiculo buscar(String placa);

	public List<Veiculo> listar();

}