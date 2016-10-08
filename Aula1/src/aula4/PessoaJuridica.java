package aula4;

public class PessoaJuridica extends Pessoa{
	// atributos
	private String cnpj;

	// construtor
	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	// get set
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}//fim da classe
