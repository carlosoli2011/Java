package aula4;

public class TestaInterfaces {

	public static void main(String[] args) {
		// TODO 
		System.out.println(MinhaPrimeiraInterface.MEU_ATRIBUTO);
		MinhaPrimeiraInterface objeto = new ImplementacaoDaMinhaInterface();
		objeto.fazAlgumaCoisa();
		DriverBancoDeDados driverBancoDeDados = new DriverPostgres();

	}

}
