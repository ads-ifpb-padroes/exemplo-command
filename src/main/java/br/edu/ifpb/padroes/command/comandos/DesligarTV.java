package br.edu.ifpb.padroes.command.comandos;

import br.edu.ifpb.padroes.command.Comando;
import br.edu.ifpb.padroes.command.aparelhos.TV;

public class DesligarTV implements Comando {

	private TV tv;
	
	public DesligarTV(TV tv) {
		this.tv = tv;
	}

	public void execute() {
		this.tv.desligarTV();
	}

}
