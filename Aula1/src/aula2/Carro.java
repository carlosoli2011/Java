package aula2;

import java.util.Date;

public class Carro {//classe carro
    
    //atributos da classe carro
    String marca;
    String modelo;
    String cor;
    short ano;
    //variavel
    double velocidade = 0;
        
    public void acelerar(){//metodo acelerar
        velocidade++;
    }//fim metodo acelerar
    
    public void frear(){//metodo acelerar
        velocidade--;
    }//fim do metodo frear
    
    //construtor com parametro
    public Carro(String marca, String modelo, String cor, short ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }//fim do construtor com parametro
    
}//fim classe
