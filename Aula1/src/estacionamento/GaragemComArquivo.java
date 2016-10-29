package estacionamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.List;

public class GaragemComArquivo implements Garagem{
	
	public static final String ARQUIVO = "/home/java01/exemplo.txt";
	
	

	@Override
	public boolean adicionar(Veiculo veiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean vender(String placa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Veiculo buscar(String placa) {
		// TODO Auto-generated method stub
		try(BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))){
			String linha = reader.readLine();
			while((linha = reader.readLine()) != null){
				String campos[] = linha.split(";");
			}
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public List<Veiculo> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
