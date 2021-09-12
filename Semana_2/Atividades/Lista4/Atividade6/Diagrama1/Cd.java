package Lista4.Atividade6.Diagrama1;

public class Cd extends Musica {


    public Cd(String nome, int duracaoSeg,String autor) {
        this.setNome(nome);
        this.setDuracaoSeg(duracaoSeg);
        this.setAutor(autor);
    }


    @Override
    public void tocarMusica() {
        System.out.println("Procurando CD na prateleira..."+
                            "\nColocando CD no cdPlayer..."+
                            "\nTuts Tuts Tuts");
    }
}
