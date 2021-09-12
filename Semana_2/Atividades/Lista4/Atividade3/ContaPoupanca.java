package Lista4.Atividade3;

public class ContaPoupanca extends ContaBanco{
    
    public ContaPoupanca() {
    }

    public void valorEmConta(){
        System.out.println("O valor na conta atualmente é de R$"+getSaldo());
    }

    public void depositoContaPoupanca(){
        depositoConta();
    }

    public void criarContaPolpanca(){
        System.out.println("Informe o nome do cliente:");
        setTitular(leia.nextLine());
        setSituacaoDaConta(true);
        System.out.println("Para a finalização da conta, deve-se depositar o valor de no minimo R$20,00.");
        depositoContaPoupanca();
    }

    public void imprimirContaPoupanca(){
        System.out.println("Titular da conta: "+getTitular()+
                            "\nAgencia: "+getAgencia()+
                            "\nConta: "+getNConta()+
                            "\nA conta esta ativa? "+getSituacaoDaConta());
        if(getSituacaoDaConta()){
            System.out.println("Saldo em conta: "+getSaldo());
        }
    }

    public void saqueContaPoupanca (){
        double valorSaque=0;
        System.out.println("Informe o valor a ser sacado");
        valorSaque = leia.nextDouble();

        if(getSaldo() >= 0 && valorSaque <= getSaldo()){
            setSaldo(getSaldo()-valorSaque);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

}
