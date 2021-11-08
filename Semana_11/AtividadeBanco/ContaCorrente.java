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
        setSaldo(0);
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
        }else{
            setSaldo(getSaldo()-valorSaque);
        }
    }

    public double getValorSalario() {
        return this.valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    @Override
    public String toString() {
        String str ="Banco " + getNomeBanco()+ 
        "\nTitular da conta: "+getTitular()+
        "\nAgencia: "+getAgencia()+" "+ getNomeAgencia()+
        "\nConta: "+getNConta()+
        "\nA conta esta ativa? "+getSituacaoDaConta();

        if(getSituacaoDaConta()){
            str = str + "\nSaldo em conta: "+getSaldo();
        }

        return str;
    }
    
}
