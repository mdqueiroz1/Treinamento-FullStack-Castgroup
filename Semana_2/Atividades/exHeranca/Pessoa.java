package exHeranca;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    Scanner leia = new Scanner(System.in);

    void fazerAniversario(){
        setIdade(getIdade()+1);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
    }
}
