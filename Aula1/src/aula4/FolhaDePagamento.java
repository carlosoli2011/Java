package aula4;

public class FolhaDePagamento {

	
	
	//metodo calcular com array de funcionarios
	public double imprimirValorTotal(Funcionario... funcionarios){
		double valorTotal = 0;
		for(Funcionario funcionario : funcionarios){
			System.out.println(funcionario.getClass().getSimpleName() + " : " + funcionario.getSalarioComBonificacao());
			valorTotal += funcionario.getSalarioComBonificacao();
		}
		return valorTotal;
	}
	
}
