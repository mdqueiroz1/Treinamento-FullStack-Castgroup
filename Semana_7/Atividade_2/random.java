import java.util.Random;

public class random {

    public static void main(String[] args) {
        Random gerador = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.print("(default, 'nome','cpf', "+
            gerador.nextInt(6)+", "+gerador.nextInt(999)+", "+gerador.nextInt(4)+", "+gerador.nextInt(3)+", ddd, tel),\n");
        }
    }
    
}