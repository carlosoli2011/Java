package cliente;

public class Ordena {

	
	public static String ordena(int a, int b, int c){
		if(b > c){
			return ordena(a, c, b);
		}else if(a > b){
			return ordena(b, a, c);
		}else
			return "" + a + "" + b + "" + c + "";
	}
	
	public static void main(String[] args) {
		
		
		int a = 11;
		int b = 30;
		int c = 10;
		
		
		System.out.println(ordena(a, b, c));
	}
	
	
	
}
