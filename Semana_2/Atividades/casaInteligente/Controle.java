package casaInteligente;

public interface Controle {
    public abstract void ligarLampadas();
    public abstract void desligarLampadas();
    
    public abstract void abrirCortinas();
    public abstract void fecharCortinas();
    
    public abstract void destrancarPortaDeEntrada();
    public abstract void trancarPortaDeEntrada();
 
    public abstract void iniciarMusica();
    public abstract void fecharMusica();
    
    public abstract void clima();

    public abstract void rotinaBomDia();
    public abstract void rotinaHoraDeDormir();

    public abstract void conteUmaPiada();
    
    public abstract void iniciarTicTacToe();
}
