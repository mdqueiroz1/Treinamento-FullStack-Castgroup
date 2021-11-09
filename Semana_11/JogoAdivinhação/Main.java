import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner leia = new Scanner(System.in);
        
        int palpite, cont = 0, nRand = gen.nextInt(5);
        
        nRand+=1;

        System.out.println("Jogo de adivinhação" + "\nInforme um numero de 1 a 50 até que acerte, a cada chute"
                + "\ninformaremos se está perto do objetivo!");

        do {
            System.out.println("Qual seu palpite? (1-50)");
            palpite = leia.nextInt();

            if(palpite > nRand){
                System.out.println("O número é menor que o informado!");
            }else{
                if(palpite < nRand){
                    System.out.println("O número é maior que o infomado!");
                }
            }
            cont++;
        } while (nRand != palpite);

        System.out.printf("Você ganhou com %d tentativas!", cont);

        leia.close();
    }
}