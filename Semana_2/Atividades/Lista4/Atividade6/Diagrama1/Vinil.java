package Lista4.Atividade6.Diagrama1;

public class Vinil extends Musica {
    private int anoLancamento;
    @Override
    public void tocarMusica() {
        System.out.println("Procurando o disco de vinil na prateleira..."+
                            "\nRetirando o disco com cuidado e colocando no toca discos"+
                            "\nPreparando a agulha no disco..."+
                            "\nTuts Tuts Tuts");
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}
