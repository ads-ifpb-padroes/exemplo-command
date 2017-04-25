package br.edu.ifpb.padroes.command.comandos;

import br.edu.ifpb.padroes.command.Comando;
import br.edu.ifpb.padroes.command.aparelhos.CondicionadorDeAr;

/**
 * Created by diogomoreira on 07/02/17.
 */
public class LigarArCondicionado implements Comando {

    private int temperatura;
    private CondicionadorDeAr condicionador;

    public LigarArCondicionado(CondicionadorDeAr condicionador, int temperatura) {
        this.condicionador = condicionador;
        this.temperatura = temperatura;
    }

    public void execute() {
        condicionador.ligar(this.temperatura);
    }
}
