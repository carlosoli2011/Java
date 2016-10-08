package aula4;

public class Veterinario extends Mamifero{
	
	public void examinar(Examinavel animal){
		if(animal instanceof Humano){
			throw new IllegalArgumentException("Não posso examinar Humanos");
		}
		animal.emitirSom();
		
	}

	@Override
	public void emitirSom() {
		// TODO 
		System.out.println("Som do veterinario");
		
	}

}
