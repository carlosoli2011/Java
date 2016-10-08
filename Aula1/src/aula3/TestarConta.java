package aula3;

public class TestarConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.depositar(100);
		
		conta.sacar(50);
		
		conta.retornarSaldo();
	}

}
