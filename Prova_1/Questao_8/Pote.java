public class Pote extends Recipiente{

    public Pote() {
        setAplicacao("Armazenar remédios");
        setTemTampa(true);
        setTamanho(250);
    }

    public void tomarRemedio(){
        System.out.println("Tomando remedio...");
        setCapacidade(getCapacidade()-1);
    }
    
}
