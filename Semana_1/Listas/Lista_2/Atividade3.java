import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Informe o Peso:");
		peso = leia.nextDouble();
		
		System.out.println("Informe a altura:");
		altura = leia.nextDouble();
		
		imc = peso/(Math.pow(altura, 2));
		
		System.out.println("O IMC e "+imc);
		
		leia.close();
	}

}
