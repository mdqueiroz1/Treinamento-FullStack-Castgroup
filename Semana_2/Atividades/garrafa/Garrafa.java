package garrafa;

public class Garrafa {
	
	boolean tampada;
	String liquido;
	float quantidade;
	String cor;
	
	void destamparGarrafa() {
		this.tampada = false;
		System.out.println("Destampando garrafa...");
	}
	
	void tamparGarrafa() {
		System.out.println("Tampando garrafa...");
		this.tampada = true;
	}
	
	void beber() {
		if(this.tampada == false) {
			System.out.println("Glub glub glub");
			this.quantidade -= 1;
		}else
			System.out.println("Garrafa tampada!");
	}
	
	void imprimirStatus() {
		System.out.println("Cor da garrafa:"+this.cor+
							"O que tem na garrafa? "+this.liquido+
							"Quantidade de liquido na garrafa "+this.quantidade+
							"A garrafa está tampada? "+this.tampada);
	}
	
}
