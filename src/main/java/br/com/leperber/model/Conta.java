package br.com.leperber.model;

public class Conta {
    private int codigo; //Nao edita!
    private String nome;  //Edita
    private double saldo;   //Edita com OBS!!

    public Conta(){}

    public Conta(int codigo, String nome, double saldo){
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
