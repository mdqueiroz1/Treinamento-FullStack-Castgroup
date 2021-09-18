public class Main {
    public static void main(String[] args) {
        BemTeVi b = new BemTeVi("PiuPiu");
        Papagaio p = new Papagaio("Tagarela", "Cantadas de pedreiro");
        Vaca v = new Vaca("Mimosa");
        Cachorro c = new Cachorro("Rex");

        b.falar();
        p.falar();
        v.correr();
        v.falar();
        c.falar();

    }
}
