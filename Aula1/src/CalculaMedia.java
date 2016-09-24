import java.util.Scanner;


public class CalculaMedia {

	//cria uma variavel constante
	public static final double MEDIA_ESCOLA = 7;
	
	public static void main(String[] args) {

		double nota1 = 0, nota2 = 0, nota3 = 0, mediaAluno = 0;
		String mensagem = "";
		//cria scanner
		Scanner scanner = new Scanner(System.in);
		//imprime a pergunta na tela
		System.out.println("Digite sua primeira nota: ");
		nota1 = scanner.nextInt();
		//imprime a pergunta na tela
		System.out.println("Digite sua segunda nota: ");
		nota2 = scanner.nextInt();
		//imprime a pergunta na tela
		System.out.println("Digite sua terceira nota: ");
		nota3 = scanner.nextInt();
		//calcuma a media das notas
		mediaAluno = (nota1 + nota2 + nota3) / 3 ;
		
		//mensagem = mediaAluno >= MEDIA_ESCOLA ? "Você foi Aprovado" : "Você foi Reprovado";
		if(mediaAluno <= 4){
			System.out.println(""+mediaAluno+", Aluno Reprovado");
		}else if(mediaAluno < 7){
			System.out.println(""+mediaAluno+", Aluno Exame");
		}else{
			System.out.println(""+mediaAluno+", Aluno Aprovado");
		}
		
		System.out.println("Aplicação encerrada!");
		
		//fecha o scanner
		scanner.close();
	}
}
