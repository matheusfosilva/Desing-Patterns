package br.com.sdconecta.orcamento.situacao;

import br.com.sdconecta.DomainException;
import br.com.sdconecta.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoEstado {

    public BigDecimal calcDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("O orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("O orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("O orçamento não pode ser finalizado");
    }
}
