package aula3Array;

public class ExemplosArray {//classe ExemplosArray
	public static void main(String[] args) {//metodo main
		//instancia de arrays
		int[] meuArray = new int[10];
		String[] meuArrayString = new String[10];
		
		for (int i = 0; i < meuArray.length; i++) {//faça enquanto i < tamanho do array
			System.out.println(meuArray[i]);
		}
		
		for (int i = 0; i < meuArrayString.length; i++) {//faça enquanto i < tamanho do array
			System.out.println(meuArrayString[i]);
		}
	}

}
