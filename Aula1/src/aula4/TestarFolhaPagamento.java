package aula4;

public class TestarFolhaPagamento {

	public static void main(String[] args) {
		// TODO 
		
		Funcionario funcionarios[] = {
				new Gerente("A", 200),
				new Supervisor("B", 300),
				new Secretaria("C", 100),
				
		};
		
		double valorTotal = new  FolhaDePagamento().imprimirValorTotal(funcionarios);
		System.out.println("Valor Total: "+ valorTotal);

	}

}
