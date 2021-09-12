package selva;

public class Aves extends Animal{

    private String corPena;

    public void construirNinhos(){
        System.out.println("Construindo ninho...");
    }

    @Override
    public void locomoverSe() {
         System.out.println("Voando..."); 
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de aves...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }
    
    public String getCorPena() {
        return this.corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
