package br.com.sdconecta.pedido;

import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    String cliente = "Matheus Silva";
    BigDecimal valorOrcamento;
    int qntdItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qntdItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qntdItens = qntdItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQntdItens() {
        return qntdItens;
    }
}
