package aula4;

public class PessoaFisica extends Pessoa{
	//atributos
	private String cpf;
	
	//construtor
	public PessoaFisica(String nome, String cpf){
		super(nome);
		this.cpf = cpf;
	}
	
	//get set
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
