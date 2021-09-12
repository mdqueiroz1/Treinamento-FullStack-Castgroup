package selva;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void locomoverSe() {
        System.out.println("Andando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    //getters e setters
    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
