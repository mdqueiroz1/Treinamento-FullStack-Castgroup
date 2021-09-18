public class Vaca extends Mamifero{
    private boolean permiteOrdenha;


    public Vaca(String nome){
        this.setNome(nome);
        setPermiteOrdenha(false);
    }

    public void ordenhar(){
        if(this.permiteOrdenha){
            System.out.println("Ordenhando");
        }else{
            System.out.println("Essa vaca não permite ordenha!");
        }
    }

    @Override
    public void falar() {
        System.out.println("Muuu mu muuuu");
    }


    public boolean getPermiteOrdenha() {
        return this.permiteOrdenha;
    }

    public void setPermiteOrdenha(boolean permiteOrdenha) {
        this.permiteOrdenha = permiteOrdenha;
    }

}
