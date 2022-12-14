package br.com.sdconecta.desconto;

import br.com.sdconecta.orcamento.Orcamento;
import java.math.BigDecimal;

public class DescontoValor extends Desconto{
    public DescontoValor(Desconto proximo) {
        super(proximo);
    }
    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
