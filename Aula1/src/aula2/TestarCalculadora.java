package aula2;

import java.util.Scanner;

public class TestarCalculadora {
    
    public static void main(String args[]){
    
        //inicializa o scanner
        Scanner scanner = new Scanner(System.in);
        //variaveis
        double numero1;
        double numero2;
        int escolha;
        //console
        System.out.println("Calculadora JAVA");
        System.out.println("Digite o primeiro numero: ");
        numero1 = scanner.nextDouble();//guarda o primeiro valor digitado
        
        System.out.println("Digite o segundo numero: ");
        numero2 = scanner.nextDouble();//guarda o segundo valor digitado
        
        System.out.println("Escolha a operação \n"
                + "1 - Somar \n"
                + "2 - Subtrair \n"
                + "3 - Dividir \n"
                + "4 - Multiplicar");
        
        escolha = scanner.nextInt();//recebe a opção
        Calculadora calculadora = new Calculadora();//inicializa a calculadora
        switch(escolha){//caso opção for igual a operação faça
            case 1:
                System.out.println(""
                        +numero1+" + "
                        +numero2+" = "
                        +calculadora.somar(numero1, numero2));
                break;
            case 2:
                System.out.println(""
                        +numero1+" + "
                        +numero2+" = "
                        +calculadora.subtrair(numero1, numero2));
                break;
            case 3:
                System.out.println(""
                        +numero1+" + "
                        +numero2+" = "
                        +calculadora.dividir(numero1, numero2));
                break;
            case 4:
                System.out.println(""
                        +numero1+" + "
                        +numero2+" = "
                        +calculadora.multiplicar(numero1, numero2));
                break;
            default://opção invalida
                System.out.println("Opção: "+escolha+" invalida!");
                
        }//fim do swith
        scanner.close();//fecha o console
        
    }//fim do main
    
}//fim da classe