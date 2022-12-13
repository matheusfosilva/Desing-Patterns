package br.com.sdconecta.desconto;

import br.com.sdconecta.orcamento.Orcamento;
import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;
    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
    public abstract BigDecimal calcular(Orcamento orcamento);
}
