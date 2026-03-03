package br.com.leperber.view;

import br.com.leperber.controller.ContaController;
import br.com.leperber.model.Conta;

import java.util.Scanner;

public class ContaView {

    private Scanner lerDados = new Scanner(System.in);
    private ContaController contaController = new ContaController();

    public void mostrarContas(){
        if(!contaController.retornaListaContas().isEmpty()) {
            for (Conta conta : contaController.retornaListaContas()) {
                System.out.println("Conta cadastrada: \n " + conta.toString());
            }
        }else {
            System.out.println("Nenhuma conta cadastrada!");
        }
    }

    public void cadastrarConta(){
        System.out.println("CADASTRO DE CONTA");
        System.out.println("Informe o codigo da conta:");
        int codigo = lerDados.nextInt();
        System.out.println("Informe o nome da conta:");
        lerDados.nextLine();
        String nome = lerDados.nextLine();
        System.out.println("Informe o saldo da conta:");
        double saldo = lerDados.nextDouble();

        try {
            contaController.cadastrarConta(codigo,nome,saldo);
        }catch (IllegalArgumentException ae){
            System.out.println("Erro: " + ae.getMessage());
        }
    }

    public void buscarCodigoConta(){
        System.out.println("Informe o codigo da conta:");
        int codigo = lerDados.nextInt();
        if(contaController.verificarConta(codigo)){
            System.out.println("Conta encontrada \n" + contaController.buscarContaCodigo(codigo).toString());
        }else {
            System.out.println("Conta não localizada!!");
        }
    }

    public void editarConta(){

        int codigo;
        String novoNome;
        double novoSaldo;

        System.out.println("""
                  Informe o que voce quer editar na conta:
                        1 - Nome;
                        2 - Saldo;
                        3 - Nome e Saldo;
                  """);
        int opcaoEditarConta = lerDados.nextInt();

        switch (opcaoEditarConta){
            case 1:
                System.out.println("Informe o codigo da conta:");
                codigo = lerDados.nextInt();
                if(contaController.verificarConta(codigo)){
                    System.out.println("Informe o novo nome:");
                    lerDados.nextLine();
                    novoNome = lerDados.nextLine();
                    contaController.editarNomeConta(novoNome,codigo);
                }else {
                    System.out.println("Conta não localizada!");
                }
                break;
            case 2:
                System.out.println("Informe o codigo da conta:");
                codigo = lerDados.nextInt();
                if(contaController.verificarConta(codigo)) {
                    System.out.println("Informe o novo saldo:");
                    novoSaldo = lerDados.nextDouble();
                    contaController.editarSaldoConta(novoSaldo, codigo);
                }else {
                    System.out.println("Conta não localizada!");
                }
                break;
            case 3:
                System.out.println("Informe o codigo da conta:");
                codigo = lerDados.nextInt();
                if(contaController.verificarConta(codigo)) {
                    System.out.println("Informe o novo nome:");
                    lerDados.nextLine();
                    novoNome = lerDados.nextLine();
                    System.out.println("Informe o novo saldo:");
                    novoSaldo = lerDados.nextDouble();
                    contaController.editarNomeConta(novoNome, codigo);
                    contaController.editarSaldoConta(novoSaldo, codigo);
                }else {
                    System.out.println("Conta não localizada!");
                }
                break;
            default:
                System.out.println("Codigo não encontrado!");
                break;
        }
    }

    public void deletarConta(){
        System.out.println("Digite o codigo da conta para remover:");
        int codigo = lerDados.nextInt();
        if (contaController.verificarConta(codigo)) {
            System.out.println(contaController.removerConta(codigo) ? "Conta removida!" : "Não foi possivel remover a conta!");;
        }
    }
}
