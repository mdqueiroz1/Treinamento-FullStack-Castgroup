public abstract class Animal {
    private String nome;
    protected String classe;

    public Animal() {
        setClasse("Animal");
    }


    public void imprime(){};
    public void falar(){};


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

}
