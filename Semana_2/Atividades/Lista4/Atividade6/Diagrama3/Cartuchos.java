package Lista4.Atividade6.Diagrama3;

public class Cartuchos extends Jogos {
    private String corCartucho;

    public Cartuchos(String nome, String genero, String console,String corCartucho ,int anoLancamento) {
        this.setNome(nome);
        this.setGenero(genero);
        this.setConsole(console);
        this.setAnoLancamento(anoLancamento);
        this.corCartucho = corCartucho;
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Escolhendo cartucho na prateleira..."+
                            "Soprando o cartucho..."+
                            "Colocando no console..."+
                            "Iniciando jogo...");
    }


    public String getCorCartucho() {
        return this.corCartucho;
    }

    public void setCorCartucho(String corCartucho) {
        this.corCartucho = corCartucho;
    }

}
