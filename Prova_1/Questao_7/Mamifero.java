public class Mamifero extends Animal {
    private int velocidade;


    public Mamifero() {
        setVelocidade(2);
    }

    public void correr(){
        System.out.println("Correndo...");
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}
