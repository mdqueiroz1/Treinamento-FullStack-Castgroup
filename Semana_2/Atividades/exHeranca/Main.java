package exHeranca;

public class Main {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Maria",18,'F',1234,"ADS", "Noturno");
        Professor p1 = new Professor("Kleython", 27, 'M', "Não cabe tudo aqui", 1000000.00);
        Funcionario f1 = new Funcionario("João", 54, 'M', "Limpeza", true);
        

        a1.imprimirAluno();
        p1.imprimirProfessor();
        f1.imprimirFuncionario();
        /*
        a1.setNome("João");
        a1.setSexo('M');
        a1.setIdade(18);
        a1.setTurno("Noturno");
        a1.setCurso("ADS");
        a1.setMatricula(1234);

        System.out.println("Nome: "+a1.getNome()+
        "\nIdade: "+a1.getIdade()+
        "\nsexo: "+a1.getSexo()+
        "\nMatricula "+a1.getMatricula()+
        "\nCurso "+a1.getCurso()+
        "\nTurno "+a1.getTurno());
        
        System.out.println("Nome: "+p1.getNome()+
        "\nIdade: "+p1.getIdade()+
        "\nsexo: "+p1.getSexo()+
        "\nEspecialidade "+p1.getEspecialidade()+
        "\nSalario "+p1.getSalario());
        
        System.out.println("Nome: "+f1.getNome()+
        "\nIdade: "+f1.getIdade()+
        "\nsexo: "+f1.getSexo()+
        "\nSetor "+f1.getSetor()+
        "\nTrabalhando? "+f1.getTrabalhando());
        */
    }
}
