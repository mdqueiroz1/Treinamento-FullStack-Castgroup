package selva;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        Canguru cg = new Canguru();
        Aves a = new Aves();
        Reptil r = new Reptil();

        m.locomoverSe();
        c.locomoverSe();
        cg.locomoverSe();
        a.locomoverSe();
        r.locomoverSe();
    }
}
