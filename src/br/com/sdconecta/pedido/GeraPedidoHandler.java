package br.com.sdconecta.pedido;

import br.com.sdconecta.orcamento.Orcamento;
import br.com.sdconecta.pedido.acao.Acoes;
import br.com.sdconecta.pedido.acao.EnviarEmail;
import br.com.sdconecta.pedido.acao.SalvarNoBanco;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    List<Acoes> acoes;

    public GeraPedidoHandler(List<Acoes> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQntdItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.execute(pedido));
    }
}
