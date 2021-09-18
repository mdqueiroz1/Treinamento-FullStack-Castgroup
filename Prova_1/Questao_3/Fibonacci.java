import java.util.Scanner;

public class Fibonacci {
    
    public void iniciar(){

        Scanner in = new Scanner(System.in);
        
        Long p1 = (long)1 , p2 = (long)1, aux;
        int posicao;

        System.out.println("Informe o numero na posicao");
        posicao = in.nextInt();
        
        if(posicao > 2){
            for(int i = 3; i <= posicao; i++){
                aux = p1+p2;
                p1 = p2;
                p2 = aux;
            }
        
            System.out.printf("O numero na posicao %d é %d\n",posicao,p2);

        }else{
            if(posicao == 0){
                System.out.println("O numero nessa posicao é 0");
            }else{
                if (posicao >0 && posicao<3) {
                    System.out.println("O numero nessa posicao é 1");
                }
            }
        }     
        
        in.close();
    }

}
