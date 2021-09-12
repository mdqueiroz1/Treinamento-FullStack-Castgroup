package Lista4.Atividade2.A;

import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int qntAlunos = 3;
       
        Aluno a[] = new Aluno[qntAlunos];
        
        for (int i = 0; i < qntAlunos; i++) {
            a[i] = new Aluno();
            
            System.out.println("Qual o nome do aluno?");
            a[i].setNome(leia.nextLine());
            
            System.out.println("Qual a serie do aluno "+a[i].getNome()+"?");
            a[i].setSerie(leia.nextLine());
            
            System.out.println("Qual a nota 1 do aluno "+a[i].getNome()+"?");
            a[i].setNota1(leia.nextDouble());
            
            System.out.println("Qual a nota 2 do aluno "+a[i].getNome()+"?");
            a[i].setNota2(leia.nextDouble());
            
            System.out.println("Qual a nota 3 do aluno "+a[i].getNome()+"?");
            a[i].setNota3(leia.nextDouble());
            limparBuffer(leia);
            
            a[i].mediaNotas();
        }
        
        for(int i = 0; i < qntAlunos; i++){
            System.out.println("A média do aluno "+a[i].getNome()+
            "da "+a[i].getSerie()+
            " é "+a[i].getMedia()+".");
        }
        
        leia.close();
    }

    //foi implementado uma função de limpar o buffer, já que apenas pegar com 
    //leia.nextLine() estava por algum motivo pegando além do necessário.
    //fonte da função https://www.clubedohardware.com.br/topic/1417385-limpar-o-buffer-de-teclado-na-ling-java/
    public static void limparBuffer(Scanner leia) {
            if (leia.hasNextLine()) {
                leia.nextLine();
            }
    }
}