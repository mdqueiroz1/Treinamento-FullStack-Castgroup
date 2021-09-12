import java.util.Scanner;

public class Atividade10 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double salarioAtual, imposto;
		
		System.out.println("Informe o valor do salario a ser calculado");
		salarioAtual = leia.nextDouble();
		
		imposto = salarioAtual * 0.05;
		
		System.out.println("O imposto a ser pago e R$"+imposto);
		
		leia.close();
	}
}