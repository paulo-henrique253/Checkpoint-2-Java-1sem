package br.com.tdspk.motorista;

import br.com.tdspk.veiculo.Veiculo;

public class Motorista {
    private String nome;
    private String cpf;
    private String celular;
    private String habilitacao;
    private String categoria;
    private Veiculo veiculo;

    public Motorista(){};

    public Motorista(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Motorista(String nome, String cpf, String celular, String habilitacao, String categoria, Veiculo veiculo){
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.habilitacao = habilitacao;
        this.categoria = categoria;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
