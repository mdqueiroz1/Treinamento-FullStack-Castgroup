import java.util.Scanner;

public class Atividade9 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double pesoAtual, pesoFinal, porcentagem;
		
		System.out.println("Qual o peso atual");
		pesoAtual = leia.nextDouble();
		
		System.out.println("Qual a porcentagem de perda a ser atingida");
		porcentagem = leia.nextDouble();
		
		pesoFinal = pesoAtual-((pesoAtual*(porcentagem))/100);
		
		System.out.println("O peso a ser atingido e "+pesoFinal);
		
		
		leia.close();
	}
}