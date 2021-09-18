import java.util.Scanner; 

public class Calcular {

	public void iniciar(){
		
		Scanner leia = new Scanner(System.in);
		Integer qnt = 3;

		int[][] matriz = new int[qnt][qnt];
		double media = 0;
		
		for(int i = 0; i < qnt; i++) {
			for(int j = 0; j < qnt; j++) {
				System.out.println("Informe os numeros da matriz");
				matriz[i][j] = leia.nextInt();
				media += matriz[i][j];
			}
		}
		
		media = media/(qnt*qnt);
		
		System.out.println("Numeros na diagonal principal:");
		for(int i = 0; i < qnt; i++) {
			System.out.print(" "+matriz[i][i]);
		}
		
		System.out.print("\nNumeros na diagonal secundaria:\n");		
        for(int i=0; i<qnt; i++){
            for (int j = qnt-1; j >= 0; j--){
                System.out.print(" "+matriz[i][j]);
                i++;
            }
        }
		
		System.out.printf("\nMedia da matriz: %.2f",media);
		
		leia.close();
	}
}

