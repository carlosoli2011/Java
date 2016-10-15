package estacionamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garagem {
	
	List<Veiculo> veiculos = new ArrayList<Veiculo>();
	Map<String, Veiculo> mapVeiculos = new HashMap<>();
	
	public void adicionar(Veiculo veiculo){//usando list
		veiculos.add(veiculo);
		mapVeiculos.get(veiculo);
	}
	
	public void vender(String placa){
		for (Veiculo veiculo : veiculos) {
			if(veiculo.getPlaca().equals(placa)){
				veiculos.remove(placa);
			}System.out.println("Placa não encontrada!");
		}
		
	}
	
	public Veiculo buscarPorMap(String placa){
		return mapVeiculos.get(placa);
	}
	
	public List<Veiculo> listar(){
		return veiculos;
	}
	
	

}
