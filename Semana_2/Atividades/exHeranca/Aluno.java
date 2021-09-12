package exHeranca;

public class Aluno extends Pessoa{

    //atributos
    private int matricula;
    private String curso;
    private String turno;


    public Aluno(String nome, int idade, char sexo, int matricula, String curso, String turno) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        this.matricula = matricula;
        this.curso = curso;
        this.turno = turno;

    }

    public Aluno() {
    }

    void imprimirAluno(){
        System.out.println("Nome: "+getNome()+
        "\nIdade: "+getIdade()+
        "\nsexo: "+getSexo()+
        "\nMatricula "+getMatricula()+
        "\nCurso "+getCurso()+
        "\nTurno "+getTurno());
    }

    //getters e setters
    public String getTurno(){
        return this.turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
