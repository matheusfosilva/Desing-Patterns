package br.com.sdconecta.orcamento;
import br.com.sdconecta.orcamento.situacao.EmAnalise;
import br.com.sdconecta.orcamento.situacao.SituacaoEstado;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItems;
    private SituacaoEstado situacao;

    public Orcamento(BigDecimal valor, int quantidadeItems) {
        this.valor = valor;
        this.quantidadeItems = quantidadeItems;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        BigDecimal descontoExtra = this.situacao.calcDescontoExtra(this);
        this.valor = this.valor.subtract(descontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public SituacaoEstado getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoEstado situacao) {
        this.situacao = situacao;
    }

    public int getQuantidadeItems() {
        return quantidadeItems;
    }

    public void setQuantidadeItems(int quantidadeItems) {
        this.quantidadeItems = quantidadeItems;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
