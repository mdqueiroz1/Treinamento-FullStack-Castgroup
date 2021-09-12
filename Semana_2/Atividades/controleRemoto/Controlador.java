package controleRemoto;

public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    public abstract void menuAbrir();
    public abstract void menuFechar();
}
