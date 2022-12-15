package br.com.sdconecta.pedido.acao;

import br.com.sdconecta.pedido.Pedido;

public class SalvarNoBanco implements Acoes{

    @Override
    public void execute(Pedido pedido) {
        System.out.println("Salvado pedido no banco de dados");
    }
}
