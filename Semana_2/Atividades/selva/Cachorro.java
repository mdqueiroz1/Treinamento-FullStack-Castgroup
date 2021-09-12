package selva;

public class Cachorro extends Mamifero{
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso...");
    }

    public void comerSandalia(){
        System.out.println("Comendo sandália...");
    }

    public void morder(){
        System.out.println("Mordendo...");
    }

    public void abanandoRabo(){
        System.out.println("Abanando o rabo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração e bebendo agua...");
    }
}
