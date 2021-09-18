public class Copo extends Recipiente {

    public Copo() {
        setTemTampa(false);
        setTamanho(300);
        setAplicacao("Domestico");
    }

    public void beber(){
        System.out.println("Glub glub glub");
        setCapacidade(getCapacidade()-10);
    }
}
