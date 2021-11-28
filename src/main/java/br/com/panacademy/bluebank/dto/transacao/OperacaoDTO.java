package br.com.panacademy.bluebank.dto.transacao;

import br.com.panacademy.bluebank.modelo.Transacao;
import br.com.panacademy.bluebank.modelo.enuns.TipoTransacao;

public abstract class OperacaoDTO {

    private Double valor;
    private Double saldo;
    private String descricao;
    private TipoTransacao tipoTransacao;

    public OperacaoDTO() {
    }


    public OperacaoDTO(Double valor, Double saldo, String descricao, TipoTransacao tipoTransacao) {
        this.valor = valor;
        this.saldo = saldo;
        this.descricao = descricao;
        this.tipoTransacao = tipoTransacao;
    }

    public OperacaoDTO(Transacao transacao){
        this.valor = transacao.getValor();
        this.descricao = transacao.getDescricao();
        this.tipoTransacao = transacao.getTipoTransacao();
    }

    public OperacaoDTO(Transacao transacao, Double saldo){
        this.valor = transacao.getValor();
        this.saldo = saldo;
        this.descricao = transacao.getDescricao();
        this.tipoTransacao = transacao.getTipoTransacao();
    }

    public OperacaoDTO(Double valor){
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
}
