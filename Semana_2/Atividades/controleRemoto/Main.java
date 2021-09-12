package controleRemoto;
import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        ControleRemoto c = new ControleRemoto();
        Scanner leia = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Menu:\n"+
                                "1- Ligar Tv\n"+
                                "2- Desligar Tv\n"+
                                "3- Mais volume\n"+
                                "4- Menos volume\n"+
                                "5- Ligar mudo\n"+
                                "6- Desligar mudo\n"+
                                "7- Play\n"+
                                "8- Pause\n"+
                                "9- Status da TV\n"+
                                "10- Sair do programa\n"
                                );
            menu = leia.nextInt();

            switch (menu) {
                case 1:{
                    c.ligar();
                    break;
                }
                case 2:{
                    c.desligar();
                    break;
                }
                case 3:{
                    c.maisVolume();
                    break;
                }
                case 4:{
                    c.menosVolume();
                    break;
                }
                case 5:{
                    c.ligarMudo();
                    break;
                }
                case 6:{
                    c.desligarMudo();
                    break;
                }
                case 7:{
                    c.play();
                    break;
                }
                case 8:{
                    c.pause();
                    break;
                }
                case 9:{
                    c.menuAbrir();
                    break;
                }    
            }

            leia.nextLine();
            leia.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } while (menu != 10);
        leia.close();
    }
}
