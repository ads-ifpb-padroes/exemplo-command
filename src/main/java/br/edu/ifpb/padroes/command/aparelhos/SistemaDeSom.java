package br.edu.ifpb.padroes.command.aparelhos;

import java.util.Date;

public class SistemaDeSom {
	
	private int volume;
	
	public void ligar(Date date) {
		System.out.println("O aparelho irá ligar às " + date);
	}
	
	public void desligar(Date date) {
		System.out.println("O aparelho irá desligar às " + date);
	}
	
	public void aumentarVolume() {
		this.volume++;
	}
	
	public void diminuirVolume() {
		this.volume--;
	}

}
