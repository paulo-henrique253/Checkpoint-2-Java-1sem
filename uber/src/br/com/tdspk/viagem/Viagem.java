package br.com.tdspk.viagem;

import br.com.tdspk.cliente.Cliente;
import br.com.tdspk.motorista.Motorista;

import java.time.LocalDate;

public class Viagem {
    private LocalDate data;
    private double valor;
    private String origem;
    private String destino;
    private String formaPagamento;
    private Cliente cliente;
    private Motorista motorista;

    public Viagem(LocalDate data, double valor, String origem, String destino, String formaPagamento, Cliente cliente, Motorista motorista) {
        this.data = data;
        this.valor = valor;
        this.origem = origem;
        this.destino = destino;
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;
        this.motorista = motorista;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
