package br.com.leperber.model;

public class CategoriaTransacao {

    private int codigo;
    private String nome;

    public CategoriaTransacao(){}

    public CategoriaTransacao(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CategoriaTransacao{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
