package br.com.sdconecta.desconto;

import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento))
            return efetuarCalculo(orcamento);

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract Boolean deveAplicar(Orcamento orcamento);
}
