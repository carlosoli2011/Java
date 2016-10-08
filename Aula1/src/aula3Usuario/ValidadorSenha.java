package aula3Usuario;

public class ValidadorSenha {

	// metodos
	public static boolean atendeRequisitos(String senha){
		if(senha == null){
			return false;
		}
		return senha.length() >= 5 
				&& contemLetras(senha) 
				&& contemNumero(senha);
		
	}
	
	private static boolean contemNumero(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {// contem numeros
				return true;
			}
		}
		return false;
	}// fim do metodo

	private static boolean contemLetras(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {// contem letras
				return true;
			}
		}
		return false;
	}// fim do metodo

}
