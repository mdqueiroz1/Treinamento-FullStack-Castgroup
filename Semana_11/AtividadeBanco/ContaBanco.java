
import java.util.Random;
import java.util.Scanner;

public abstract class ContaBanco {

    Random nRand = new Random();
    Scanner leia = new Scanner(System.in);

    private double saldo;
    private boolean situacaoDaConta;
    private String titular, agencia, nConta, nomeAgencia, nomeBanco;

    public ContaBanco() {
        
        int numero = nRand.nextInt(9999);
        
        if (numero<1000) {
            numero += 2000;
        }
        
        setNConta(Integer.toString(numero));
        
        System.out.println(
            "Selecione o banco:"+
            "\n1- Banco do Brasil"+
            "\n2- Caixa Econômica"+
            "\n3- Santander"+
            "\n4- Itaú"+
            "\n5- Banco da Amazônia"
        );
        int banco = leia.nextInt();
        leia.nextLine();
            
        setAgencia(("000"+String.valueOf(banco)));
        
        System.out.println("Selecione a agência:");
        switch (banco) {
            case 1:{
                setNomeBanco("Banco do Brasil");
                System.out.println(
                    "\n1- Agência do Parque Imperial"+
                    "\n2- Agência do Jardim Doutor Mesquita"
                );

                int agencia = leia.nextInt();
                leia.nextLine();
                if(agencia == 1){
                    setAgencia("Parque Imperial");
                }else{
                    setAgencia("Jardim Doutor Mesquita");
                }
                break;
            }
            case 2:{
                setNomeBanco("Caixa Econômica");
                System.out.println(
                    "\n1- Agência da Vila Santa Rita"+
                    "\n2- Agência da Inamar"
                );

                int agencia = leia.nextInt();
                leia.nextLine();
                if(agencia == 1){
                    setAgencia("Vila Santa Rita");
                }else{
                    setAgencia("Inamar");
                }
                break;
            }
            case 3:{
                setNomeBanco("Santander");
                System.out.println(
                    "\n1- Agência da Chácara Morro Alto"+
                    "\n2- Agência da Vale do Igapó"
                );
                int agencia = leia.nextInt();
                leia.nextLine();
                if(agencia == 1){
                    setAgencia("Chácara Morro Alto");
                }else{
                    setAgencia("Vale do Igapó");
                }
                break;
            }
            case 4:{
                setNomeBanco("Itaú");
                System.out.println(
                    "\n1- Agência da Ferrazópolis"+
                    "\n2- Agência da Vila Bertini"
                );
                int agencia = leia.nextInt();
                leia.nextLine();
                if(agencia == 1){
                    setAgencia("Ferrazópolis");
                }else{
                    setAgencia("Vila Bertini");
                }
                break;
            }
            case 5:{
                setNomeBanco("Banco da Amazônia");
                System.out.println(
                    "\n1- Agência da Esplanada Santa Helena"+
                    "\n2- Agência da Nova Petrópolis"
                );
                int agencia = leia.nextInt();
                leia.nextLine();
                if(agencia == 1){
                    setAgencia("Esplanada Santa Helena");
                }else{
                    setAgencia("Nova Petrópolis");
                }
                break;
            }
        
            default:
                break;
        }
        
    }    

    public void depositoConta (){
        
        System.out.println("Informe o valor do depósito:");
        double deposito = leia.nextDouble();
        
        if(deposito > 0){
            setSaldo(getSaldo()+deposito);
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getSituacaoDaConta() {
        return this.situacaoDaConta;
    }

    public void setSituacaoDaConta(boolean situacaoDaConta) {
        if(saldo == 0){
            this.situacaoDaConta = situacaoDaConta;
        }else{
            if(this.saldo < 0){
                System.out.println("Existem dividas na conta!");
            }else{
                System.out.println("Existe dinheiro na conta, favor sacar antes do encerramento da conta.");
            }
        }
    }

    public String getAgencia() {
        return this.agencia;
    }

    private void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    private void setNConta(String nConta) {
        this.nConta = nConta;
    }
    
    public boolean isSituacaoDaConta() {
        return this.situacaoDaConta;
    }

    public String getNomeAgencia() {
        return this.nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeBanco() {
        return this.nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
