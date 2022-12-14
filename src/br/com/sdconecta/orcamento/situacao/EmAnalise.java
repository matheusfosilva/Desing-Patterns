package br.com.sdconecta.orcamento.situacao;

import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoEstado {

    @Override
    public BigDecimal calcDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }

}
