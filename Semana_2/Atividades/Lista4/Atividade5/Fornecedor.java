package Lista4.Atividade5;

public class Fornecedor extends Pessoa {
    private double valorCredito, valorDivida;

    public Fornecedor() {
        this.valorCredito = 0;
        this.valorDivida = 0;
    }

    public void obterSaldo(){
        System.out.println("O valor do saldo é "+(valorCredito - valorDivida));
    }

    public void imprimirFornecedor(){
        System.out.println(
            "\nNome: "+this.getNome()+
            "\nTelefone "+this.getTelefone()+
            "\nEndereco "+this.getEndereco()
        );
        this.obterSaldo();
    }

    public double getValorCredito() {
        return this.valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return this.valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

}
