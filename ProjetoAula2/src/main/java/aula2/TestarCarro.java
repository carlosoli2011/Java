package aula2;

import java.util.Date;

public class TestarCarro {//classe TestarCarro
    
    public static void main(String args[]){//metodo main}
        
        Carro primeiroCarro = new Carro(
                "Ferrari",
                "430 Scuderia",
                "Vermelha",
                (short)2009);//inicializa objeto primeiro carro
        
        Carro segundoCarro = new Carro(
                "Fiat",
                "Uno",
                "Branco",
                (short)2009);//inicializa objeto segundo carro
        
        //metodo acelerar e frear do primeiro carro
        primeiroCarro.acelerar();
        primeiroCarro.acelerar();
        primeiroCarro.frear();
        primeiroCarro.acelerar();
        
        //metodo acelerar e frear do segundo carro
        segundoCarro.acelerar();
        segundoCarro.acelerar();
        segundoCarro.acelerar();
        segundoCarro.frear();
        segundoCarro.frear();
        
        //imprime a velocidade dos carros
        System.out.println(primeiroCarro.velocidade);
        System.out.println(segundoCarro.velocidade);
        
    }//fim metodo main
    
}//fim classe TestarCarro