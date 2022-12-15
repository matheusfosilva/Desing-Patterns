package br.com.sdconecta.pedido.acao;

import br.com.sdconecta.pedido.Pedido;

public class EnviarEmail implements Acoes{
    @Override
    public void execute(Pedido pedido) {
        System.out.println("Enviando email do pedido");
    }
}
