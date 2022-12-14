package br.com.sdconecta.orcamento.situacao;

import br.com.sdconecta.DomainException;
import br.com.sdconecta.orcamento.Orcamento;

public class Reprovado extends SituacaoEstado{

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
