import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int menu=0;

        do {
            System.out.println("\nMenu:"+
            "\n1-Criar conta corrente."+
            "\n2-Criar conta poupanca."+
            "\n2-Criar conta conjunta."+
            "\n10-Sair do programa.");
            menu = leia.nextInt();

            switch (menu) {
                case 1:{
                    ContaCorrente contaCorrente = new ContaCorrente();
                    contaCorrente.criarContaCorrente();                    
                    do {
                        System.out.println("\n\nMenu da conta corrente:"+
                                            "\n1- Depositar em conta."+
                                            "\n2- Sacar em conta"+
                                            "\n3- Valor em conta"+
                                            "\n4- Dados da conta"+
                                            "\n10-Sair do programa");
                        menu = leia.nextInt();
                        switch (menu) {
                            case 1:{
                                contaCorrente.depositoContaCorrente();
                                break;
                            }
                            case 2:{
                                contaCorrente.saqueContaCorrente();
                                break;
                            }
                            case 3:{
                                contaCorrente.valorEmConta();;
                                break;
                            }
                            case 4:{
                                System.out.println(contaCorrente);
                                break;
                            }
                        
                            default:
                                break;
                        }
                    } while (menu != 10);
                    break;
                }
                
                case 2:{
                    ContaPoupanca contaPoupanca = new ContaPoupanca();
                    contaPoupanca.criarContaPolpanca();

                    do {
                        System.out.println("\n\nMenu da conta poupança:"+
                                            "\n1- Depositar em conta."+
                                            "\n2- Sacar em conta"+
                                            "\n3- Valor em conta"+
                                            "\n4- Dados da conta"+
                                            "\n10-Sair do programa");
                        menu = leia.nextInt();
                        switch (menu) {
                            case 1:{
                                contaPoupanca.depositoContaPoupanca();
                                break;
                            }
                            case 2:{
                                contaPoupanca.saqueContaPoupanca();
                                break;
                            }
                            case 3:{
                                contaPoupanca.valorEmConta();;
                                break;
                            }
                            case 4:{
                                System.out.println(contaPoupanca);
                                break;
                            }
                        
                            default:
                                break;
                        }
                    } while (menu != 10);

                    break;
                }

                case 3:{
                    ContaConjunta contaConjunta = new ContaConjunta();
                    contaConjunta.criarContaConjunta();                    
                    do {
                        System.out.println("\n\nMenu da conta corrente:"+
                                            "\n1- Depositar em conta."+
                                            "\n2- Sacar em conta"+
                                            "\n3- Valor em conta"+
                                            "\n4- Dados da conta"+
                                            "\n10-Sair do programa");
                        menu = leia.nextInt();
                        switch (menu) {
                            case 1:{
                                contaConjunta.depositoContaConjunta();
                                break;
                            }
                            case 2:{
                                contaConjunta.saqueContaConjunta();
                                break;
                            }
                            case 3:{
                                contaConjunta.valorEmConta();;
                                break;
                            }
                            case 4:{
                                System.out.println(contaConjunta);
                                break;
                            }
                        
                            default:
                                break;
                        }
                    } while (menu != 10);
                    break;
                }

                default:
                    break;
            }
        } while (menu != 10);

        leia.close(); 
    }
}
