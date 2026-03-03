package br.com.leperber.controller;

import br.com.leperber.model.CategoriaTransacao;
import br.com.leperber.repository.CategoriaTransacaoRepository;

import java.util.ArrayList;
import java.util.List;

public class CategoriaTransacaoController {

    private final CategoriaTransacaoRepository categoriaTransacaoRepository =
            new CategoriaTransacaoRepository();

    public boolean cadastrarCategoriaTransacao(int codigo, String nome){
        if(codigo == 0 ){
            throw new IllegalArgumentException("Codigo nao pode ser zero!");
        }

        if(verificarCategoriaTransacao(codigo)){
            throw new IllegalArgumentException("Codigo ja cadastrado!");
        }

        categoriaTransacaoRepository.adicionarCategoriaTransacao(new CategoriaTransacao(codigo, nome));
        return true;
    }

    public List<CategoriaTransacao> retornarListaCategoriaTransacao(){
        return new ArrayList<>(categoriaTransacaoRepository.getCategoriaTransacaos());
    }

    public boolean verificarCategoriaTransacao(int codigo){
        for(CategoriaTransacao categoriaTransacao : categoriaTransacaoRepository.getCategoriaTransacaos()){
            if(categoriaTransacao.getCodigo() == codigo){
                return true;
            }
        }
        return false;
    }

    public CategoriaTransacao buscaCategoriaTransacaoCodigo(int codigo){
        for(CategoriaTransacao categoriaTransacao : categoriaTransacaoRepository.getCategoriaTransacaos()){
            if(categoriaTransacao.getCodigo() == codigo){
                return categoriaTransacao;
            }
        }
        return null;
    }

    public boolean editarNomeCategoriaTransacao(int codigo,String novoNome){
        for(CategoriaTransacao categoriaTransacao : categoriaTransacaoRepository.getCategoriaTransacaos()){
            if(categoriaTransacao.getCodigo() == codigo){
                categoriaTransacao.setNome(novoNome);
                return true;
            }
        }
        return false;
    }

    public boolean removerCategoriaTransacao(int codigo){
        for(CategoriaTransacao categoriaTransacao : categoriaTransacaoRepository.getCategoriaTransacaos()){
            if(categoriaTransacao.getCodigo() == codigo){
                categoriaTransacaoRepository.removerCategoriaTransacao(categoriaTransacao);
                return true;
            }
        }
        return false;
    }
}
