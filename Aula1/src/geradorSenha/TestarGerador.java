package geradorSenha;

import java.util.Scanner;

public class TestarGerador {

	public static void main(String[] args) {
		// TODO 
		System.out.println("Gerador de Senha");
		System.out.println("1 - Gerar senha Idoso");
		System.out.println("2 - Gerar senha Padrão");
		System.out.println("3 - Proxima Senha");
		System.out.println("4 - Sair");
		Scanner scanner = new Scanner(System.in);
		GeradorSenha geradorSenha = new GeradorSenha();
		int opcao = 0;
		while(opcao != 4){
			if(opcao == 1){
				System.out.println("Senha Preferencial gerada: " + geradorSenha.gerarSenhaIdoso());
			}else if(opcao == 2){
				System.out.println("Senha Padão gerada: " + geradorSenha.gerarSenhaPadrao());
			}else if(opcao == 3){
				System.out.println("Proxima Senha: " + geradorSenha.proximaSenha());
			}else{
				System.out.println("Opção invalida!!!");
			}
			opcao = scanner.nextInt();
		}
		scanner.close();
	}

}
