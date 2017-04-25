package br.edu.ifpb.padroes.command.comandos;

import br.edu.ifpb.padroes.command.Comando;
import br.edu.ifpb.padroes.command.aparelhos.TV;

public class LigarTV implements Comando { 

	private TV tv;
	
	public LigarTV(TV tv) {
		this.tv = tv;
	}
	
	public void execute() {
		tv.ligarTV();
	}

}
