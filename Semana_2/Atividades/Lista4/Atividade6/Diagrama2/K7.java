package Lista4.Atividade6.Diagrama2;

public class K7 extends Filme {

    public K7(String nome, String genero, String diretor, int tempoDuracao) {
        this.setNome(nome);
        this.setGenero(genero);
        this.setDiretor(diretor);
        this.setTempoDuracao(tempoDuracao);
    }

    @Override
    public void reproduzirFilme() {
        System.out.println("Procurando filme na prateleira..."+
                            "\nColocando filme no aparelho reprodutor de fitas..."+
                            "\nRebobinando fita K7..."+
                            "\nIniciando filme...");
    }
}
