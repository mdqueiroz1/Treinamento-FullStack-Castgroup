package Lista4.Atividade6.Diagrama3;

public class JogoDisco extends Jogos {

    public JogoDisco(String nome, String genero, String console,int anoLancamento) {
        this.setNome(nome);
        this.setGenero(genero);
        this.setConsole(console);
        this.setAnoLancamento(anoLancamento);
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Escolhendo cd na prateleira..."+
        "Limpando CD na blusa"+
        "Colocando no console..."+
        "Iniciando jogo...");
    }
}
