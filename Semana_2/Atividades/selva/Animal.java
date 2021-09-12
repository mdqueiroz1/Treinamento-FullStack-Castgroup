package selva;

public abstract class Animal {
    
    //atributos
    private double peso;
    private int membros, idade;
    
    //metodos
    public abstract  void locomoverSe();
    public abstract  void emitirSom();
    public abstract  void alimentar();

    //getters e setters
    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getMembros() {
        return this.membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
