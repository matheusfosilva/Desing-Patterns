package br.com.sdconecta.desconto;

import br.com.sdconecta.orcamento.Orcamento;
import java.math.BigDecimal;

public class DescontoValor extends Desconto{
    public DescontoValor(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if( orcamento.getValor().compareTo(new BigDecimal("500")) > 0 )
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        return proximo.calcular(orcamento);
    }
}
