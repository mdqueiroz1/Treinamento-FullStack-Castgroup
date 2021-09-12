package Lista4.Atividade2.B;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3, media;
    
    //Foi feita a escolha de String para serie, pra ser informado a serie
    //"completa" da serie. Ex: 5 série, 1 ano, etc. 
    private String serie;

    public void mediaNotas(){
        this.media = (this.nota1+this.nota2+this.nota3)/3;
    }

    public Aluno() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return this.nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return this.media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
