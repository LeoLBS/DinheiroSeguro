package br.com.leperber.controller;

import br.com.leperber.model.Conta;
import br.com.leperber.repository.ContaRepository;

import java.util.ArrayList;
import java.util.List;

public class ContaController {

    private final ContaRepository contaRepository = new ContaRepository();

    public void cadastrarConta(int codigo, String nome, double saldo){

        if(codigo == 0){
            throw new IllegalArgumentException("Codigo não pode ser 0!");
        }

        for(Conta conta : contaRepository.getContas()){
            if(codigo == conta.getCodigo()){
                throw new IllegalArgumentException("Codigo ja registrado!");
            }
        }

        contaRepository.adicionarConta(new Conta(codigo,nome,saldo));
    }

    public List<Conta> retornaListaContas(){

        return new ArrayList<>(contaRepository.getContas());
    }

    public Conta buscarContaCodigo(int codigo){
        for(Conta conta : contaRepository.getContas()){
            if(conta.getCodigo() == codigo){
                return conta;
            }
        }
        return null;
    }

    public void editarNomeConta(String novoNome, int codigo){
        for(Conta conta : contaRepository.getContas()){
            if(conta.getCodigo() == codigo){
                conta.setNome(novoNome);
                return;
            }
        }
    }

    public void editarSaldoConta(double novoSaldo, int codigo) {
        for(Conta conta : contaRepository.getContas()){
            if(conta.getCodigo() == codigo){
                conta.setSaldo(novoSaldo);
                return;
            }
        }
    }

    public boolean verificarConta(int codigo){
        for(Conta conta : contaRepository.getContas()){
            if(conta.getCodigo() == codigo){
                return true;
            }
        }
        return false;
    }

    public boolean removerConta(int codigo){
        for(Conta conta : contaRepository.getContas()){
            if(conta.getCodigo() == codigo){
                contaRepository.removerConta(conta);
                return true;
            }
        }
        return false;
    }
}
