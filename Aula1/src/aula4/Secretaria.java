package aula4;

public class Secretaria extends Funcionario{

	public Secretaria(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double getPorcentagemAdicional() {
		// TODO Auto-generated method stub
		return 0;
	}

}
