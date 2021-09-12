package Lista4.Atividade2.B;

import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int qntAlunos = 5;
        double mediaNota=0;
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
            mediaNota = a[i].getMedia();
        }

        mediaNota = mediaNota/5;

        System.out.printf("A media geral da turma é %.1f ", mediaNota);
        
        leia.close();
    }

    private static void limparBuffer(Scanner leia) {
            if (leia.hasNextLine()) {
                leia.nextLine();
            }
    }
}