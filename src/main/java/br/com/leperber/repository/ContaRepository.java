package br.com.leperber.repository;

import br.com.leperber.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {
    private List<Conta> contas = new ArrayList<Conta>();


    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void removerConta(Conta conta){
        this.contas.remove(conta);
    }

    @Override
    public String toString() {
        return "ContaRepository{" +
                "contas=" + contas +
                '}';
    }
}
