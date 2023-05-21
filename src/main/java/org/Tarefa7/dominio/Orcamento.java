package org.Tarefa7.dominio;

import java.time.LocalDateTime;

public class Orcamento {
    private long id;
    private LocalDateTime data;
    private Cidade cidadeOrigem;
    private Cidade cidadeDestino;
    private double peso;
    private double custoBasico;
    private double custoAdicional;
    private double impostos;
    private double desconto;
    private double valorFinal;
    private int diasUteisParaEntrega;

    public Orcamento(long id, LocalDateTime data, Cidade cidadeOrigem, Cidade cidadeDestino, double peso,
                     double custoBasico, double custoAdicional, double impostos, double desconto, double valorFinal,
                     int diasUteisParaEntrega) {
        this.id = id;
        this.data = data;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.peso = peso;
        this.custoBasico = custoBasico;
        this.custoAdicional = custoAdicional;
        this.impostos = impostos;
        this.desconto = desconto;
        this.valorFinal = valorFinal;
        this.diasUteisParaEntrega = diasUteisParaEntrega;
    }

    public Orcamento() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Cidade getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(Cidade cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public Cidade getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(Cidade cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getCustoBasico() {
        return custoBasico;
    }

    public void setCustoBasico(double custoBasico) {
        this.custoBasico = custoBasico;
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getDiasUteisParaEntrega() {
        return diasUteisParaEntrega;
    }

    public void setDiasUteisParaEntrega(int diasUteisParaEntrega) {
        this.diasUteisParaEntrega = diasUteisParaEntrega;
    }

    @Override
    public String toString() {
        return "Orcamento [id=" + id + ", data=" + data + ", cidadeOrigem=" + cidadeOrigem + ", cidadeDestino="
                + cidadeDestino + ", peso=" + peso + ", custoBasico=" + custoBasico + ", custoAdicional="
                + custoAdicional + ", impostos=" + impostos + ", desconto=" + desconto + ", valorFinal=" + valorFinal
                + ", diasUteisParaEntrega=" + diasUteisParaEntrega + "]";
    }
}
