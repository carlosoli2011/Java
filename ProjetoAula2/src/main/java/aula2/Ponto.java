package aula2;

public class Ponto {
	
	double x = 0.0;
	double y;
	
	public Ponto(double coordX, double coordY){
		this.x = coordX;
		this.y = coordY;
	}

	
	public void deslocar(double pontoX, double pontoY){
		x += pontoX;
		y += pontoY;
		
		
	}
	
	public void zerar(){
		x=0;
		y=0;
	}

	public boolean isMenorQueZero(){
		if(y<0)
			return true;
		
		return false;
		//ou return y < 0; que é true
	}
}
