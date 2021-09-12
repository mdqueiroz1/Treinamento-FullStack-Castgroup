package controleRemoto;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume, volumeMudo;
    private boolean ligado;
    private boolean tocando;


    //Construtores
    public ControleRemoto(){
        this.ligado = false;
    }
    
    //Métodos
    public void ligar(){
        System.out.println("Ligando...");
        this.setLigado(true);
        this.setTocando(true);
        this.setVolume(20);
    }

    public void desligar(){
        System.out.println("Desligando...");
        this.setLigado(false);
    }
    
    public void maisVolume(){
        if(this.getLigado() && this.getVolume() < 100){
            this.setVolume(this.getVolume() + 1);
        }else{
            if(this.getVolume() == 100){
                System.out.println("Volume no máximo");
            }else{
                System.out.println("TV desligada!");
            }
        }
    }

    public void menosVolume(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 1);
        }else{
            if(this.getVolume() == 0){
                System.out.println("Volume no mínimo");
            }else{
                System.out.println("TV desligada!");
            }
        }
    }

    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() >= 0){
            this.setVolumeMudo(this.getVolume());
            this.setVolume(0);
        }else{
            if(!this.getLigado()){
                System.out.println("TV desligada!");
            }else{
                System.out.println("Volume já está no mudo");
            }
        }
    }

    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(this.getVolumeMudo());
        }else{
            if(!this.getLigado()){
                System.out.println("TV desligada!");
            }else{
                System.out.println("Volume já está com mudo desativado!");
            }
        }
    }

    public void play(){
        if(this.getLigado() && !this.getTocando()){
            System.out.println("Tocando...\nTuts tuts tuts");
        }else{
            if(!this.getLigado()){
                System.out.println("Tv desligada!");
            }
            else{
                System.out.println("Já está tocando!");
            }
        }
    }

    public void pause(){
        if(this.getLigado() && this.getTocando()){
            System.out.println("Pausado!");
        }else{
            if(!this.getLigado()){
                System.out.println("TV desligada!");
            }else{
                System.out.println("Já está pausado!");
            }
        }
    }

    public void menuAbrir(){
        System.out.println("Esta ligado? "+this.getLigado());
        System.out.println("Esta tocando? "+this.getTocando());
        System.out.println("Volume: "+this.getVolume());
    }

    public void menuFechar(){
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    //Getters e Setters
    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return this.tocando;
    }

    public void setTocando(boolean desligado) {
        this.tocando = desligado;
    }

    public int getVolumeMudo() {
        return this.volumeMudo;
    }

    public void setVolumeMudo(int volumeMudo) {
        this.volumeMudo = volumeMudo;
    }
    

}
