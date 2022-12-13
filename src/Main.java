import br.com.sdconecta.desconto.CalculadoraDeDesconto;
import br.com.sdconecta.imposto.CalculadoraDeImpostos;
import br.com.sdconecta.imposto.Icms;
import br.com.sdconecta.imposto.Iss;
import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("500"), 6 );
        CalculadoraDeDesconto calc = new CalculadoraDeDesconto();

        System.out.println( calc.calcular(orcamento));
    }
}