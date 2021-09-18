public class Cachorro extends Mamifero {
    private boolean tipoLatido;


    public Cachorro(String nome){
        this.setNome(nome);
        setLateBaixo();
    }


    @Override
    public void falar() {
        if(tipoLatido) System.out.println("AU AU AU");
        else System.out.println("au au au");
    }

    public boolean getTipoLatido() {
        return this.tipoLatido;
    }

    public void setLateAlto() {
        this.tipoLatido = true;
    }
    
    public void setLateBaixo() {
        this.tipoLatido = false;
    }
}
