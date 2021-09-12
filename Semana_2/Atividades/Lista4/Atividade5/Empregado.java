package Lista4.Atividade5;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase, porcentagemImposto;

    public Empregado() {
        this.setCodigoSetor(1);
    }

    public void calcularSalario(){
        double salarioLiquido;
        salarioLiquido = getSalarioBase()-(getSalarioBase()*getPorcentagemImposto());
        System.out.println("O salário liquido é "+salarioLiquido);
    }

    public void imprimirEmpregado(){
        System.out.println(
            "\nNome: "+this.getNome()+
            "\nTelefone "+this.getTelefone()+
            "\nEndereco "+this.getEndereco()+
            "\nSetor "+this.getCodigoSetor()
        );
        calcularSalario();
    }

    public int getCodigoSetor() {
        return this.codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPorcentagemImposto() {
        return this.porcentagemImposto;
    }

    public void setPorcentagemImposto(double porcentagemImposto) {
        this.porcentagemImposto = porcentagemImposto;
    }


}
