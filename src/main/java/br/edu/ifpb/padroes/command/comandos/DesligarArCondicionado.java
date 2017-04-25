package br.edu.ifpb.padroes.command.comandos;

import br.edu.ifpb.padroes.command.Comando;
import br.edu.ifpb.padroes.command.aparelhos.CondicionadorDeAr;

/**
 * Created by diogomoreira on 07/02/17.
 */
public class DesligarArCondicionado implements Comando {

    private CondicionadorDeAr condicionador;

    public DesligarArCondicionado(CondicionadorDeAr condicionador) {
        this.condicionador = condicionador;
    }

    public void execute() {
        this.condicionador.desligar();
    }
}
