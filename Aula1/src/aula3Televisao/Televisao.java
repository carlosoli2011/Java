package aula3Televisao;

public class Televisao {
	
	//atributos
	private String marca;
	private String modelo;
	private String numeroSerie;
	private int polegada;
	
	//variaveis
	boolean status = false;
	int statusVolume = 0;
	String volt;
	
	//construtor com parametro
	protected Televisao(
			String marca,
			String modelo,
			String numeroSerie,
			int polegada){
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.polegada = polegada;
		
	}//fim do contrutor
	
	//metodos
	public void ligar(){
		
		if(status == true){
			ligarTela();
			System.out.println("TV Ligada!");
		}else{
			System.out.println("TV já está ligada!");
		}//fim do else
	}//fim do metodo ligar
	
	public void desligar(){
		if(status == false){
			DesligarTela();
			System.out.println("TV Desligada!");
		}else{
			System.out.println("TV já está desligada!");
		}//fim do else
	}//fim do metodo desligar
	
	public void aumentarVolume(){
		System.out.println("Volume aumentado!");
	}//fim do metodo aumentar volume
	
	public void diminuirVolume(){
		System.out.println("Volume diminuido!");
	}//fim do metodo diminuir volume
	
	public void aumentarCanal(){
		System.out.println("Canal aumentado!");
	}//fim do metodo aumentar canal
	
	public void diminuirCanal(){
		System.out.println("Canal diminuido!");
	}//fim do metodo diminuir canal
	
	private int ajustarVoltagem(int volt){
		System.out.println(volt);
		return volt;
		
	}//fim do metodo ajustar voltagem
	
	private boolean ligarTela(){
		//System.out.println("Comando Ligar Tela!");
		status = true;
		return status;
	}//fim do metodo Ligar Tela
	
	private boolean DesligarTela(){
		//System.out.println("Comando Ligar Tela!");
		status = false;
		return status;
	}//fim do metodo Ligar Tela
	
	private void regularDiodo(){
		System.out.println("Diodo Regulado!");
	}//fim do metodo regular diodo
	
	public void visualizar(){
		System.out.println("Marca: "+ marca);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Numero de Serie: "+ numeroSerie);
		System.out.println("Polegada: "+ polegada);
		ligarTomada();

	}//fim do metodo regular diodo
	
	public void ligarTomada(){
		regularDiodo();
		ajustarVoltagem(220);
		DesligarTela();
	}
	

}//fim da classe

