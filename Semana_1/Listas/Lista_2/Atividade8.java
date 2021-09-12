import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorProduto, valorFinal;
		
		System.out.println("Informe o valor do produto:");
		valorProduto = leia.nextDouble();
		
		valorFinal = valorProduto + (valorProduto * 0.25);
		
		System.out.println("O valor do produto com o aumento de 25% e "+valorFinal);
		
		
		
		leia.close();
	}
}