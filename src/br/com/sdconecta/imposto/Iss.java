package br.com.sdconecta.imposto;

import br.com.sdconecta.orcamento.Orcamento;
import java.math.BigDecimal;

public class Iss implements Imposto{
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
