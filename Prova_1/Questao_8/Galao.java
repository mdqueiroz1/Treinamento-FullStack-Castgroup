public class Galao extends Recipiente {

    public Galao() {
        setAplicacao("Armazenar combustível");
        setTamanho(1000);
        setTemTampa(true);
    }

    public void abastecerCarro(){
        System.out.println("Abastecendo carro...");
        setCapacidade(0);
    }
    
}
