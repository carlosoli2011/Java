package aula2;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private int rg;
	
	public Pessoa(String nome, int cpf, int rg){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		
	}
	
	public void imprimir(String nome, int cpf, int rg){
		System.out.println("Dados pessoa:\nNome: "+nome+"\nCPF: "+cpf+"\nRG: "+rg);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + rg;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf != other.cpf)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg != other.rg)
			return false;
		return true;
	}
	
	

}
