import java.util.Scanner;

public class Calculadora{

    public void iniciar(){

        Scanner in = new Scanner(System.in);
        double valor, total=0;
        char operacao = '+';
        
        System.out.println("Informe o valor inicial:");
        valor = in.nextDouble();
     
        do {

            switch (operacao) {
                case '+':{
                    total+=valor;
                    break;
                }
                case '-':{
                    total-=valor;
                    break;
                }
                case '*':{
                    total*=valor;
                    break;
                }
                case '/':{
                    if(valor == 0 ){
                        System.out.println("Valor inválido!");
                    }else{
                        total/=valor;
                    }
                    break;
                }
                default:
                break;
            }
            System.out.println(total);
    
            if (in.hasNextLine()) {
                in.nextLine();
            }

            System.out.println("informe a operação a ser calculada: + - / *");
            operacao = in.next().charAt(0);
            if(operacao == '=') break;

            System.out.println("Informe o valor a ser calculado:");
            valor = in.nextDouble();
        }while (operacao != '=');
        
        
        System.out.println("Saida = "+total);
        
        in.close();
    }
}
