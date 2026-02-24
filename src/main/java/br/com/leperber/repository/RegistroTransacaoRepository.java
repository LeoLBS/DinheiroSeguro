package br.com.leperber.repository;

import br.com.leperber.model.RegistroTransacao;

import java.util.ArrayList;
import java.util.List;

public class RegistroTransacaoRepository {

    private List<RegistroTransacao> registroTransacaos = new ArrayList<RegistroTransacao>();

    public RegistroTransacaoRepository(RegistroTransacao registroTransacao){
        this.registroTransacaos.add(registroTransacao);
    }

    public List<RegistroTransacao> getRegistroTransacaos() {
        return registroTransacaos;
    }

    public void setRegistroTransacaos(List<RegistroTransacao> registroTransacaos) {
        this.registroTransacaos = registroTransacaos;
    }

    @Override
    public String toString() {
        return "RegistroTransacaoRepository{" +
                "registroTransacaos=" + registroTransacaos +
                '}';
    }
}
