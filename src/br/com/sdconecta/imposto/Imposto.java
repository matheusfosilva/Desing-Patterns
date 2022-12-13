package br.com.sdconecta.imposto;

import br.com.sdconecta.orcamento.Orcamento;
import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
