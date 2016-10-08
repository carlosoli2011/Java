package aula2;


public class Calculadora {
    
    //variaveis
    private double resultado;
    
    public double somar(double numero1, double numero2){//metodo somar
        resultado = numero1 + numero2;
        return resultado;
    }//fim do metodo somar
    
    public double subtrair(double numero1, double numero2){//metodo subtrair
        resultado = numero1 - numero2;
        return resultado;
    }//fim do metodo subtrair
    
    public double dividir(double numero1, double numero2){//metodo dividir
        resultado = numero1 / numero2;
        return resultado;
    }//fim do metodo dividir
    
    public double multiplicar(double numero1, double numero2){//metodo multiplicar
        resultado = numero1 + numero2;
        return resultado;
    }//fim do metodo multiplicar
}//fim da classe
