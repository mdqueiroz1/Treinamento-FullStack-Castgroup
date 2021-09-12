package lista4;

import java.util.Scanner; 

public class Atividade9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[4][4];
		double media = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("Informe os numeros da matriz");
				matriz[i][j] = leia.nextInt();
				media += matriz[i][j];
			}
		}
		
		media = media/16.0;
		
		System.out.println("Numeros na diagonal principal:");
		for(int i = 0; i < 4; i++) {
			System.out.print(" "+matriz[i][i]);
		}
		
		System.out.print("\nNumeros na diagonal secundaria:\n");		
        for(int i=0; i<4; i++){
            for (int j = 4-1; j >= 0; j--){
                System.out.print(" "+matriz[i][j]);
                i++;
            }
        }
		
		System.out.printf("\nMedia da matriz: %.2f",media);
		
		leia.close();
	}
}
