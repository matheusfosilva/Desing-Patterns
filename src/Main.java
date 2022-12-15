import br.com.sdconecta.desconto.CalculadoraDeDesconto;
import br.com.sdconecta.imposto.CalculadoraDeImpostos;
import br.com.sdconecta.imposto.Icms;
import br.com.sdconecta.imposto.Iss;
import br.com.sdconecta.orcamento.Orcamento;
import br.com.sdconecta.pedido.GeraPedido;
import br.com.sdconecta.pedido.GeraPedidoHandler;
import br.com.sdconecta.pedido.Pedido;
import br.com.sdconecta.pedido.acao.EnviarEmail;
import br.com.sdconecta.pedido.acao.SalvarNoBanco;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        GeraPedido gerador = new GeraPedido("Matheus", new BigDecimal("100"), 5);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarNoBanco(), new EnviarEmail()));

        handler.execute(gerador);
    }
}