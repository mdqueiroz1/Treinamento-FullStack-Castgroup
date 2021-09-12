package garrafa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Garrafa g = new Garrafa();
		
		int menu;
		
		g.cor = "branca";
		g.liquido = "agua";
		g.tampada = true;
		g.quantidade = 100;
		
		do {
			System.out.println("\n\nMenu:"+
								"\n1- Tampar garrafa"+
								"\n2- Destampar garrafa"+
								"\n3- Beber da garrafa"+
								"\n4- Imprimir status da garrafa"+
								"\n10- Sair do programa\n");
			menu = in.nextInt();
			
			switch (menu) {
				case 1: {
					g.tamparGarrafa();				
					break;
				}
				case 2:{
					g.destamparGarrafa();
					break;
				}
				case 3:{
					g.beber();
					break;
				}
				case 4:{
					g.imprimirStatus();
					break;
				}
				case 5:{
					
					break;
				}
				
			}
		}while(menu != 10);
		
		in.close();
	}

}
