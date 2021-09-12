package Lista4.Atividade5;

public class Operario extends Empregado {
    private double valorProducao, comissao, porcentagem;

    public Operario() {
        this.setCodigoSetor(3);
    }

    private void calcularComissao(){
        setComissao(getValorProducao()*(getPorcentagem()/100)+1);
    }

    @Override
    public void calcularSalario() {
        double salarioLiquido;
        calcularComissao();
        salarioLiquido = getComissao()+getSalarioBase()-(getSalarioBase()*getPorcentagemImposto());
        System.out.println("O salário liquido com o adicional de produção é "+salarioLiquido);
    }

    public void imprimirOperario(){
        System.out.println(
            "\nNome: "+this.getNome()+
            "\nTelefone "+this.getTelefone()+
            "\nEndereco "+this.getEndereco()+
            "\nSetor "+this.getCodigoSetor()
        );
        calcularSalario();
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getPorcentagem() {
        return this.porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public double getValorProducao() {
        return this.valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

}
