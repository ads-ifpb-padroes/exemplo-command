package br.edu.ifpb.padroes.command.aparelhos;

public class CondicionadorDeAr {
	
	private boolean ligado = false;
	private int temperatura;
	
	public void ligar(int temperatura) {
		this.ligado = true;
		this.temperatura = temperatura;
		System.out.println("Condicionador de ar ligado a "+temperatura+"ºC");
	}
	
	public void desligar() {
		this.ligado = false;
		System.out.println("Desligando condicionador de ar");
	}
	
	public int getTemperatura() {
		return temperatura;
	}

	public boolean isLigado() {
		return ligado;
	}

}
