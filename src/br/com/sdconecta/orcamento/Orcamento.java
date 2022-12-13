package br.com.sdconecta.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItems;

    public Orcamento(BigDecimal valor, int quantidadeItems) {
        this.valor = valor;
        this.quantidadeItems = quantidadeItems;
    }

    public int getQuantidadeItems() {
        return quantidadeItems;
    }

    public void setQuantidadeItems(int quantidadeItems) {
        this.quantidadeItems = quantidadeItems;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
