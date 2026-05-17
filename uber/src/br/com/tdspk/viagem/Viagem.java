package br.com.tdspk.viagem;

import java.time.LocalDate;

public class Viagem {
    private LocalDate data;
    private double valor;
    private String origem;
    private String destino;
    private String formaPagamento;

    public Viagem(LocalDate data, double valor, String origem, String destino, String formaPagamento) {
        this.data = data;
        this.valor = valor;
        this.origem = origem;
        this.destino = destino;
        this.formaPagamento = formaPagamento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
