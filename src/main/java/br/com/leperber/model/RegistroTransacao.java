package br.com.leperber.model;

public class RegistroTransacao {
    private int codigo;
    private String descricao;
    private double valor;
    private CategoriaTransacao categoriaTransacao;
    private TipoTransacao tipoTransacao;

    public RegistroTransacao(){}

    public RegistroTransacao(int codigo, String descricao, double valor, CategoriaTransacao categoriaTransacao, TipoTransacao tipoTransacao){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.categoriaTransacao = categoriaTransacao;
        this.tipoTransacao = tipoTransacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public CategoriaTransacao getCategoriaTransacao() {
        return categoriaTransacao;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCategoriaTransacao(CategoriaTransacao categoriaTransacao) {
        this.categoriaTransacao = categoriaTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    @Override
    public String toString() {
        return "RegistroTransacao{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", categoriaTransacao=" + categoriaTransacao +
                ", tipoTransacao=" + tipoTransacao +
                '}';
    }
}
