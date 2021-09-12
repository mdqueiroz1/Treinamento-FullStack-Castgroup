package exHeranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;


    public Funcionario() {
    }

    public Funcionario(String nome, int idade, char sexo, String setor, boolean trabalhando) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }


    void mudarTrabalhando(){
        if(trabalhando){
            trabalhando = false;
        }else{
            trabalhando = true;
        }
    }

    void mudarSetor(){
        System.out.println("Atualmente o cargo é"+getSetor());
        System.out.println("Qual o novo cargo?");
        setSetor(leia.nextLine());
    }

    void imprimirFuncionario(){
        System.out.println("Nome: "+getNome()+
        "\nIdade: "+getIdade()+
        "\nsexo: "+getSexo()+
        "\nSetor "+getSetor()+
        "\nTrabalhando? "+getTrabalhando());
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
