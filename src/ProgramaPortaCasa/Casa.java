package ProgramaPortaCasa;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	// atributos
	String cor;
	private List<Porta> portas = new ArrayList<>();

	
	void visuPortas(){
		portas.forEach(porta -> {
			System.out.println(porta.nome);
			porta.estaAberta();

			System.out.println("........................................");
		});
	}
	
	void qtdePortasAbertas() {
		long qtde = portas.stream().filter(porta -> porta.aberta == true).count(); 
		System.out.println(" Quantidade de portas abertas é de: " + qtde);
	}
	
	
	public void adicionaPorta(Porta porta) {
		portas.add(porta);
	}

	// Cria as portas

	// 1. método para pintar a casa
	void pinta(String p) {
		this.cor = p;
		System.out.println("A casa agora é da cor: " + this.cor);
	}

	// 2. método para saber quantas portas estão abertas

}
