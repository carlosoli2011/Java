package aula3Usuario;

public class Usuario {
	
	//atributos
	private String nome;
	private String email;
	private String senha;
	
	//construtor com parametro
		public Usuario(String nome, String email, String senha){
			this.nome = nome;
			this.email = email;
			this.senha = senha;
		}//fim do construtor
		
		public Usuario(){
			
		}

	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(ValidadorSenha.atendeRequisitos(senha) == true){
			this.senha = senha;
		}else{
			System.out.println("senha invalida!");
		}
		
			
	}
	
	
	

}//fim da classe 
