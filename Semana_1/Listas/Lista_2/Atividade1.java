import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double M01, M02, M03, custo;
		
		System.out.println("Informe o valor do produto 1:");
		M01 = leia.nextDouble();
		
		System.out.println("Informe o valor do produto 2:");
		M02 = leia.nextDouble();
		
		System.out.println("Informe o valor do produto 3:");
		M03 = leia.nextDouble();		
		
		custo = M01 + 3 * M02 + 2 * M03;
		
		System.out.println("O valor final do custo e " + custo);
		
		leia.close();
	}

}
