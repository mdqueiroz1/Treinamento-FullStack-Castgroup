package exHeranca;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;


    public Professor() {
    }

    public Professor(String nome, int idade, char sexo,String especialidade, double salario) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }


    // salario subindo 10%
    void receberAumento(){
        setSalario(1.1*getSalario()); 
    }

    void imprimirProfessor(){
        System.out.println("Nome: "+getNome()+
        "\nIdade: "+getIdade()+
        "\nsexo: "+getSexo()+
        "\nEspecialidade "+getEspecialidade()+
        "\nSalario "+getSalario());
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
