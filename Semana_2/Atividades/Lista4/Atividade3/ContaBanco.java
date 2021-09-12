package Lista4.Atividade3;

import java.util.Random;
import java.util.Scanner;

public abstract class ContaBanco {

    Random nRand = new Random();
    Scanner leia = new Scanner(System.in);

    private double saldo;
    private boolean situacaoDaConta;
    private String titular, agencia, nConta;


    public ContaBanco() {
        setAgencia("0001");
        setNConta(Integer.toString(nRand.nextInt(9999)));
    }    

    public void depositoConta (){
        System.out.println("Informe o valor do depósito:");
        setSaldo(getSaldo()+leia.nextDouble());
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
}
