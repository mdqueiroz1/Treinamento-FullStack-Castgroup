import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		double media;
		
		System.out.println("Informe o 1 numero:");
		numero1 = leia.nextInt();
		
		System.out.println("Informe o 2 numero:");
		numero2 = leia.nextInt();
		
		System.out.println("Informe o 3 numero:");
		numero3 = leia.nextInt();
		
		media = (double) (numero1+numero2+numero3)/3;
		
		System.out.println("A media dos tres numeros e "+ media);
		
		leia.close();
	}
}
