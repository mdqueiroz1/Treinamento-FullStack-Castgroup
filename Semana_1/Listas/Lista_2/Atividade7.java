import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double distancia, tempo, vMedia, vMediaMts;
		
		System.out.println("Infome a velocidade em Km/h:");
		distancia = leia.nextDouble();

		System.out.println("Infome o tempo gasto em Hrs:");
		tempo = leia.nextDouble();

		vMedia = distancia/tempo ;
		vMediaMts = vMedia/3.6;

		System.out.println("A velocidade media e "+vMedia+"Km/h ou "+vMediaMts+"m/s");
		
		
		leia.close();
	}
}