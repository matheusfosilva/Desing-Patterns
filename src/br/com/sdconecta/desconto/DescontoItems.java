package br.com.sdconecta.desconto;

import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoItems extends Desconto {

    public DescontoItems(Desconto proximo) {
        super(proximo);
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItems() > 5;
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
}
