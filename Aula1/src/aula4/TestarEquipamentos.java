package aula4;

public class TestarEquipamentos {

	public static void main(String[] args) {
		// TODO 
		Impressora impressora = new Impressora("HP",
				500.00, 40);
		Teclado teclado = new Teclado("Microsoft", 50.00, "pt_br");
		
		System.out.println("Instancia de teclado: "+teclado);
		System.out.println("Instancia de impressora: "+impressora);
		

	}

}
