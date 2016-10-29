package aula6;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ExemploLeituraArquivo {
	
	public static void main(String[] args) throws IOException {
		
		gravarArquivo();
		lerArquivo();
		gravarComArquivoComWriter();
		lerArquivoComWriter();
	}

	private static void lerArquivoComWriter() throws FileNotFoundException, IOException {
		// TODO 
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/java01/exemplo.txt"))){
			String line = null;
			while(line != null){
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		}
	}

	private static void gravarComArquivoComWriter() throws IOException {
		// TODO A
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/java01/exemplo.txt"))){
			bufferedWriter.write("Gravando arquivo usando writer");
		}
	}

	private static void lerArquivo() throws IOException {
		// TODO 
		try(FileInputStream fileInputStream 
				= new FileInputStream("/home/java01/exemplo.txt")){
			
			byte buffer[] = new byte[1024];
			int read = fileInputStream.read(buffer);
			while(read != -1){
				System.out.println(new String(buffer, 0, read));
				read = fileInputStream.read(buffer);
				
			}
		}
		
	}

	private static void gravarArquivo() throws IOException,
			FileNotFoundException {
		String conteudoDoArquivo = "Teste de conteudo do arquivo gerado!";
		
		try (FileOutputStream out = new FileOutputStream("/home/java01/exemplo.txt")) {
				out.write(conteudoDoArquivo.getBytes());
		}
	}

}
