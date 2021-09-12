package Lista4.Atividade6.Diagrama3;

public abstract class Jogos {
    private String nome, genero, console;
    private int anoLancamento;


    public void iniciarJogo(){
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getConsole() {
        return this.console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}
