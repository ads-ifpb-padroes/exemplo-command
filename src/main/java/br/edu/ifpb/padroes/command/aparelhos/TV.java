package br.edu.ifpb.padroes.command.aparelhos;

public class TV {
	
	private boolean ligado = false;
	
	public void ligarTV() {
		System.out.println("TV ligada");
		this.ligado = true;
	}
	
	public void desligarTV() {
		System.out.println("TV desligada");
		this.ligado = false;
	}

}
