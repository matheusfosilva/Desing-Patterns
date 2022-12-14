package br.com.sdconecta.orcamento.situacao;

import br.com.sdconecta.DomainException;
import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoEstado {

    @Override
    public BigDecimal calcDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));

    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}

