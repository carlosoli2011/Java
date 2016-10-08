package aula4;

public class DriverPostgres implements DriverBancoDeDados{

	public int update(String updateSql) {
		// TODO Auto-generated method stub
		
		System.out.println("Executando no oracle");
		System.out.println(updateSql);
		return 0;
	}

}
