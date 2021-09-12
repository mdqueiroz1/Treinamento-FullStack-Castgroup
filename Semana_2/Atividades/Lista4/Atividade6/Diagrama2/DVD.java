package Lista4.Atividade6.Diagrama2;

public class DVD extends Filme {
    
    public DVD(String nome, String genero, String diretor, int tempoDuracao) {
        this.setNome(nome);
        this.setGenero(genero);
        this.setDiretor(diretor);
        this.setTempoDuracao(tempoDuracao);
    }

    @Override
    public void reproduzirFilme() {
        System.out.println("Procurando filme na prateleira..."+
                            "\nColocando filme no aparelho reprodutor de DVDs..."+
                            "\nIniciando filme...");
    }
}
