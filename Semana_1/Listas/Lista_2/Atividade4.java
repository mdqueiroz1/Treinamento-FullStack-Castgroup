import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double altura, base, area;
		
		System.out.println("Informe a base do triangulo:");
		base = leia.nextDouble();
		
		System.out.println("Informe a altura do triangulo:");
		altura = leia.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("A area do triangulo e "+area);
		
		leia.close();
	}
}
