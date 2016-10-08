package aula3;

public class Conta {
	
	double saldo;
	
	public Conta(){
		this.saldo = saldo;
	}
	
	public double sacar(double valor){
		if(saldo > valor){
			saldo -= valor;
			System.out.println("Saque realizado: " + saldo);
			return saldo;
		}
		System.out.println("Saldo infulficiente: " + saldo);
		return saldo;
	}
	
	public double depositar(double valor){
		saldo += valor;
		return saldo;
	}
	
	public void retornarSaldo(){
		System.out.println("Saldo: " + saldo);
	}

}
