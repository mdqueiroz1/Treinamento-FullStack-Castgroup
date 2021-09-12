import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorFinal, valorComissao,valorCompra, porcentagemDesconto;
		
		System.out.println("Informe o valor da compra:");
		valorCompra = leia.nextDouble();
		
		System.out.println("Informe o valor do desconto:");
		porcentagemDesconto = leia.nextDouble();
		
		valorFinal = valorCompra - (valorCompra * porcentagemDesconto / 100);
		
		valorComissao = valorFinal * 0.03;
		
		System.out.println("O valor da compra com desconto de "+porcentagemDesconto+"% eh "+valorFinal);
		System.out.printf("O valor da comissao e %.2f\n", valorComissao);
		
		leia.close();
	}
}
