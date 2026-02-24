package br.com.leperber.repository;

import br.com.leperber.model.CategoriaTransacao;

import java.util.ArrayList;
import java.util.List;

public class CategoriaTransacaoRepository {

    private List<CategoriaTransacao> categoriaTransacaos = new ArrayList<CategoriaTransacao>();


    public List<CategoriaTransacao> getCategoriaTransacaos() {
        return categoriaTransacaos;
    }

    public void setCategoriaTransacaos(List<CategoriaTransacao> categoriaTransacaos) {
        this.categoriaTransacaos = categoriaTransacaos;
    }

    public void adicionarCategoriaTransacao(CategoriaTransacao categoriaTransacao){
        categoriaTransacaos.add(categoriaTransacao);
    }

    public void removerCategoriaTransacao(CategoriaTransacao categoriaTransacao){
        this.categoriaTransacaos.remove(categoriaTransacao);
    }

    @Override
    public String toString() {
        return "CategoriaTransacaoRepository{" +
                "categoriaTransacaos=" + categoriaTransacaos +
                '}';
    }
}
