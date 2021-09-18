public abstract class Recipiente {
    private double tamanho, capacidade;
    private String aplicacao;
    private boolean temTampa;


    public void encherRecipiente(){
        setCapacidade(100);
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isTemTampa() {
        return this.temTampa;
    }


    public boolean getTemTampa() {
        return this.temTampa;
    }

    public void setTemTampa(boolean temTampa) {
        this.temTampa = temTampa;
    }


    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getAplicacao() {
        return this.aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

}
