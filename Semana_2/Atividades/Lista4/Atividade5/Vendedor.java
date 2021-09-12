package Lista4.Atividade5;

public class Vendedor extends Empregado {
    private double valorVendas, comissao,valorComissao;
    

    public Vendedor() {
        this.setCodigoSetor(4);
    }


    private void calcularComissao(){
        setValorComissao(getValorVendas()*((getComissao()/100)+1));
    }

    @Override
    public void calcularSalario() {
        double salarioLiquido;
        calcularComissao();
        salarioLiquido = getValorComissao()+getSalarioBase()-(getSalarioBase()*getPorcentagemImposto());
        System.out.println("O salário liquido é "+salarioLiquido);
    }

    public void imprimirVendedor(){
        System.out.println(
            "\nNome: "+this.getNome()+
            "\nTelefone "+this.getTelefone()+
            "\nEndereco "+this.getEndereco()+
            "\nSetor "+this.getCodigoSetor()
        );
        calcularSalario();
    }

    public double getValorComissao() {
        return this.valorComissao;
    }

    public void setValorComissao(double valorComissao) {
        this.valorComissao = valorComissao;
    }

    public double getValorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
