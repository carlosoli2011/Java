package aula4;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO 
	}

	@Override
	public double getPorcentagemAdicional() {
		// TODO 
		return 0.15;
	}

}
