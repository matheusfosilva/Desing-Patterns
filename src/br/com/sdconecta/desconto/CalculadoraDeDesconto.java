package br.com.sdconecta.desconto;

import br.com.sdconecta.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoValor( new DescontoItems( new SemDesconto() ) );
        return desconto.calcular(orcamento) ;
    }
}
