package selva;

public class Reptil extends Animal {

    @Override
    public void locomoverSe() {
        System.out.println("Rastejando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de reptil...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo plantas...");
    }
    
}
