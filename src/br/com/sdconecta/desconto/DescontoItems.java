package br.com.sdconecta.desconto;

import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoItems extends Desconto {

    public DescontoItems(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItems() > 5)
            return orcamento.getValor().multiply( new BigDecimal("0.05"));
        return proximo.calcular(orcamento);
    }
}
