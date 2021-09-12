package Lista4.Atividade5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int menu=0;
       
        System.out.println(
            "\tMENU:"+
            "\n1-Cadastrar um fornecedor."+
            "\n2-Cadastrar um Empregado"+
            "\n3-Cadastrar um Administrador"+
            "\n4-Cadastrar um Operário"+
            "\n5-Cadastrar um Vendedor"+
            "\n10-Sair do programa"
        );
        menu = leia.nextInt();
        do {
            switch (menu) {
                case 1:{
                    Fornecedor f = new Fornecedor();
                    
                    System.out.println("Informe o nome:");
                    f.setNome(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o telefone:");
                    f.setTelefone(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o endereço:");                    
                    f.setEndereco(leia.nextLine());
                    limparBuffer(leia);

                    System.out.println("Informe o valor do crédito:");
                    f.setValorCredito(leia.nextDouble());
                    
                    System.out.println("Informe o valor do crédito:");
                    f.setValorDivida(leia.nextDouble());

                    f.imprimirFornecedor();
                    
                    break;
                }
                case 2:{
                    Empregado e = new Empregado();
                    
                    System.out.println("Informe o nome:");
                    e.setNome(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o telefone:");
                    e.setTelefone(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o endereço:");                    
                    e.setEndereco(leia.nextLine());
                    limparBuffer(leia);

                    System.out.println("Informe o valor do salario bruto:");
                    e.setSalarioBase(leia.nextDouble());

                    System.out.println("Informe o valor da porcentagem de desconto:");
                    e.setPorcentagemImposto(leia.nextDouble());

                    e.imprimirEmpregado();

                    break;
                }
                case 3:{
                    Administrador a = new Administrador();
                    System.out.println("Informe o nome:");
                    a.setNome(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o telefone:");
                    a.setTelefone(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o endereço:");                    
                    a.setEndereco(leia.nextLine());
                    limparBuffer(leia);

                    System.out.println("Informe o valor do salario bruto:");
                    a.setSalarioBase(leia.nextDouble());

                    System.out.println("Informe o valor da porcentagem de desconto:");
                    a.setPorcentagemImposto(leia.nextDouble());

                    System.out.println("Informe o valor da ajuda de custo:");
                    a.setAjudaDeCusto(leia.nextDouble());

                    a.imprimirAdministrador();

                    break;
                }
                case 4:{
                    Operario o = new Operario();
                    System.out.println("Informe o nome:");
                    o.setNome(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o telefone:");
                    o.setTelefone(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o endereço:");                    
                    o.setEndereco(leia.nextLine());
                    limparBuffer(leia);

                    System.out.println("Informe o valor do salario bruto:");
                    o.setSalarioBase(leia.nextDouble());

                    System.out.println("Informe o valor da porcentagem de desconto:");
                    o.setPorcentagemImposto(leia.nextDouble());

                    System.out.println("Informe o valor da produção:");
                    o.setValorProducao(leia.nextDouble());
                    
                    System.out.println("Informe o valor da porcentagem:");
                    o.setPorcentagem(leia.nextDouble());                   

                    o.imprimirOperario();
                    break;
                }
                case 5:{
                    Vendedor v = new Vendedor();
                    System.out.println("Informe o nome:");
                    v.setNome(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o telefone:");
                    v.setTelefone(leia.nextLine());
                    limparBuffer(leia);
                    
                    System.out.println("Informe o endereço:");                    
                    v.setEndereco(leia.nextLine());
                    limparBuffer(leia);

                    System.out.println("Informe o valor das vendas");
                    v.setValorVendas(leia.nextDouble());

                    System.out.println("Informe o valor da porcentagem da comissão");
                    v.setComissao(leia.nextDouble());

                    v.imprimirVendedor();
                    break;
                }  
            }
        } while (menu != 10);
        
        leia.close();
    }

    public static void limparBuffer (Scanner leia){
        if(leia.hasNextLine()){
            leia.nextLine();
        }
    }
}
