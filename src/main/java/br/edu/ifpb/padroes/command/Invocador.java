package br.edu.ifpb.padroes.command;

import java.util.LinkedList;
import java.util.List;

public class Invocador {
	
	private List<Comando> ligar = new LinkedList<Comando>();
	private List<Comando> desligar = new LinkedList<Comando>();
	
	public Invocador() {
		
	}
	
	public void addComandoLigar(Comando comando) {
		this.ligar.add(comando);
	}
	
	public void addComandoDesligar(Comando comando) {
		this.desligar.add(comando);
	}
	
	public void ligar() {
		for (Comando comando : ligar) {
			comando.execute();
		}
	}
	
	public void desligar() {
		for (Comando comando : desligar) {
			comando.execute();
		}
	}

}
