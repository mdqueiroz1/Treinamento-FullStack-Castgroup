public class Papagaio extends Ave{
    
    private String vocabulario;
    

    public Papagaio(String nome, String vocabulario){
        this.setNome(nome);
    }

    @Override
    public void falar() {
        System.out.println("Cra cra cra");    
    }

    public String getVocabulario() {
        return this.vocabulario;
    }

    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }


}
