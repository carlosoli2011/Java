package aula4;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPorcentagemAdicional() {
		// TODO Auto-generated method stub
		return 0.10;
	}

}
