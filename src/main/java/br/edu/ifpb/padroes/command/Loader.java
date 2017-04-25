package br.edu.ifpb.padroes.command;

import br.edu.ifpb.padroes.command.aparelhos.CondicionadorDeAr;
import br.edu.ifpb.padroes.command.aparelhos.TV;
import br.edu.ifpb.padroes.command.comandos.DesligarArCondicionado;
import br.edu.ifpb.padroes.command.comandos.DesligarTV;
import br.edu.ifpb.padroes.command.comandos.LigarArCondicionado;
import br.edu.ifpb.padroes.command.comandos.LigarTV;

public class Loader {
	
	public static void main(String[] args) {
		Invocador casaAutomatizada = new Invocador();
		TV tv = new TV();
		CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();
		casaAutomatizada.addComandoLigar(new LigarTV(tv));
		casaAutomatizada.addComandoLigar(new LigarArCondicionado(condicionadorDeAr, 17));

		casaAutomatizada.ligar();

		casaAutomatizada.addComandoDesligar(new DesligarArCondicionado(condicionadorDeAr));
		casaAutomatizada.addComandoDesligar(new DesligarTV(tv));

		casaAutomatizada.desligar();
	}

}
