package br.com.sdconecta.imposto;

import br.com.sdconecta.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto ){
        return imposto.calcular(orcamento);
    }
}
