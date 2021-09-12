import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double volume, R;
		
		System.out.println("Informe o valor do raio:");
		R = leia.nextDouble();
		
		volume = (4*(Math.PI*Math.pow(R, 3)))/3;
		//5
		System.out.println("O valor do volume e "+volume);
	
		leia.close();
	}
	
	
	
}
