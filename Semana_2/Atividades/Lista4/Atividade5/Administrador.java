package Lista4.Atividade5;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador() {
        this.setCodigoSetor(2);
    }

    @Override
    public void calcularSalario() {
        double salarioLiquido;
        salarioLiquido = getAjudaDeCusto()+getSalarioBase()-(getSalarioBase()*getPorcentagemImposto());
        System.out.println("O salário liquido com a ajuda de custo é "+salarioLiquido);
    }

    public void imprimirAdministrador(){
        System.out.println(
            "\nNome: "+this.getNome()+
            "\nTelefone "+this.getTelefone()+
            "\nEndereco "+this.getEndereco()+
            "\nSetor "+this.getCodigoSetor()
        );
        calcularSalario();
    }

    public double getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
