import br.com.sdconecta.desconto.CalculadoraDeDesconto;
import br.com.sdconecta.imposto.CalculadoraDeImpostos;
import br.com.sdconecta.imposto.Icms;
import br.com.sdconecta.imposto.Iss;
import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("400"), 6 );
        Orcamento orcamento1 = new Orcamento(new BigDecimal("1000"), 2 );
        CalculadoraDeDesconto calc = new CalculadoraDeDesconto();

        System.out.println( calc.calcular(orcamento));
        System.out.println( calc.calcular(orcamento1));
    }
}