public class ContaConjunta extends ContaBanco{
    
    protected String titular2;

    public ContaConjunta() {
    }

    public void valorEmConta(){
        System.out.println("O valor na conta atualmente é de R$"+getSaldo());
    }

    public void depositoContaConjunta(){
        depositoConta();
    }

    public void criarContaConjunta(){
        System.out.println("Informe o nome do cliente:");
        setTitular(leia.nextLine());
        System.out.println("Informe o nome do segundo cliente:");
        setTitular2(leia.nextLine());
        setSituacaoDaConta(true);
        setSaldo(0);
    }

    public void saqueContaConjunta (){
        double valorSaque=0;
        System.out.println("Informe o valor a ser sacado");
        valorSaque = leia.nextDouble();

        if(getSaldo() >= 0 && valorSaque <= getSaldo()){
            setSaldo(getSaldo()-valorSaque);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public String getTitular2() {
        return this.titular2;
    }

    public void setTitular2(String titular2) {
        this.titular2 = titular2;
    }

    @Override
    public String toString() {
        String str = "Banco " + getNomeBanco()+
        "\nTitulares da conta: "+getTitular()+
        "\n" + getTitular2()+
        "\nAgencia: "+getAgencia()+" "+ getNomeAgencia()+
        "\nConta: "+getNConta()+
        "\nA conta esta ativa? "+getSituacaoDaConta();
        if(getSituacaoDaConta()){
            str = str + "Saldo em conta: "+getSaldo();
        }

        return str;
    }

}
