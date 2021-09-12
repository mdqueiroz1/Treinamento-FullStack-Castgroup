package Lista4.Atividade3;

public  class ContaCorrente extends ContaBanco{

    private double valorSalario;

    public ContaCorrente() { 
    }
    
    public void depositoContaCorrente(){
        depositoConta();
    }

    public void valorEmConta(){
        System.out.println("O valor em conta atualmente é de R$"+getSaldo());
    }

    public void criarContaCorrente(){
        System.out.println("Informe o nome do cliente:");
        setTitular(leia.nextLine());
        setSituacaoDaConta(true);
        System.out.println("Para a finalização da conta, deve-se depositar o valor de no minimo R$30,00.");
        depositoContaCorrente();
    }

    public void saqueContaCorrente (){
        double valorSaque=0;
        char teste = ' ';
        System.out.println("Informe o valor do saque");
        valorSaque = leia.nextDouble();

        if((getSaldo()-valorSaque) < 0 ){
            System.out.println("Você entrará no cheque especial com o saque atual, continuar?");
            leia.next().charAt(0);
            if(teste == 's' || teste == 'S'){
                setSaldo(getSaldo()-valorSaque);
            }
        }
    }

    public void imprimirContaCorrente(){
        System.out.println("\n\nTitular da conta: "+getTitular()+
                            "\nAgencia: "+getAgencia()+
                            "\nConta: "+getNConta()+
                            "\nA conta esta ativa? "+getSituacaoDaConta());
        if(getSituacaoDaConta()){
            System.out.println("\nSaldo em conta: "+getSaldo());
        }
    }

    public double getValorSalario() {
        return this.valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }


    
}
