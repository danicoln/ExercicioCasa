package ProgramaPortaCasa;

public class TestaCasa {

	public static void main(String[] args) {
		
		Casa casa = new Casa();
		
		casa.pinta("Cinza");
		
		
		System.out.println("........................................");
		
		Porta portaPrincipal = new Porta();
		portaPrincipal.nome = "PortaPrincipal";
		portaPrincipal.abrePorta();
		portaPrincipal.fechaPorta();
		
		Porta portaFundos = new Porta();
		portaFundos.nome = "PortaFundos";
		portaFundos.abrePorta();
		
		Porta portaLateral = new Porta();
		portaLateral.nome = "PortaLateral";
		portaLateral.abrePorta();
	
		casa.adicionaPorta(portaPrincipal);
		casa.adicionaPorta(portaFundos);
		casa.adicionaPorta(portaLateral);
		casa.visuPortas();
		
		casa.qtdePortasAbertas();
		
	}

}
