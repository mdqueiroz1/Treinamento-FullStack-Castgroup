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
        setSaldo(0);
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

    @Override
    public String toString() {
        String str = "Banco " + getNomeBanco()+
        "\n Titular da conta: "+getTitular()+
        "\nAgencia: "+getAgencia()+" "+ getNomeAgencia()+
        "\nConta: "+getNConta()+
        "\nA conta esta ativa? "+getSituacaoDaConta();
        if(getSituacaoDaConta()){
            str = str + "\nSaldo em conta: "+getSaldo();
        }
        return str;
    }
}
