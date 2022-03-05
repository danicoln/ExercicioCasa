package ProgramaPortaCasa;

public class Porta {

	String cor;
	String nome;
	public double altura; // altura
	public double largura; // largura
	public double espessura; // espessura
	boolean aberta; // (aberta ou fechada);

	// metodo para dimensões da porta
	void AlturaLarguraEspessura(double a, double l, double e) {
		this.altura = a;
		this.largura = l;
		this.espessura = e;

		System.out.println(" A porta tem " + this.altura + " de altura;");
		System.out.println(" A porta tem " + this.largura + " de largura;");
		System.out.println(" A porta tem " + this.espessura + " de espessura.");
	}

	// cod. finalizado
	void pintaPorta(String p) {
		this.cor = p;
		System.out.println((" A cor da porta agora é: " + p));
	}

	// cod. finalizado
	void fechaPorta() {
		if (this.aberta) {
			this.aberta = false;
		}
	}

	// cod finalizado
	void abrePorta() {
		if (!this.aberta) {
			this.aberta = true;
		}
	}

	// cod finalizado
	boolean estaAberta() {
		if (this.aberta) {
			System.out.println(" A porta está aberta. Deseja fechar? ");
		} else {
			System.out.println(" A porta  não está aberta. Deseja abrir?");
		}

		return false;
	}
	
	
	
	

}
