package aula4;

public class Teclado extends Equipamento{
	private String layout;
	
	//nao existe construtor vazio na superClasse somos obrigados a  chamar
	//manualmente
	//public Teclado(){
	//}
	
	public Teclado(String fabricante, double preco, String layout){
		super(fabricante, preco);
		this.layout = layout;
	}
	
	public String getLayout() {
		return layout;
	}
	
	public void setLayout(String layout) {
		this.layout = layout;
	}
	
	public void teclar(){
		System.out.println("metodo testar");
	}

	@Override
	public String toString() {
		return "Teclado [layout=" + layout + ", getLayout()=" + getLayout()
				+ ", getPreco()=" + getPreco() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
