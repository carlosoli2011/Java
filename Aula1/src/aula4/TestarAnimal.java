package aula4;

public class TestarAnimal {

	public static void main(String[] args) {
		// TODO 
	
		Mamifero baleia = new Baleia();
		Reptil jacare = new Jacare();
		Humano humano = new Humano();
		Veterinario veterinario = new Veterinario();
		veterinario.examinar(baleia);
		veterinario.examinar(jacare);
		veterinario.examinar(humano);
		veterinario.examinar(veterinario);
		
	}

}
