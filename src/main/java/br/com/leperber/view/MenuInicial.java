package br.com.leperber.view;

import br.com.leperber.controller.ContaController;

import java.util.Scanner;

public final class MenuInicial {

    private Scanner lerDados = new Scanner(System.in);
    private ContaController contaController = new ContaController();
    private ContaView contaView = new ContaView();

    public void iniciar(){
        boolean continuarTela = true;
        while(continuarTela){
            System.out.println("PROGRAMA DINHEIRO SEGURO");
            System.out.println("""
                Para começar escolha uma opcao:
                    0 - Sair;
                    Conta: [
                        1 - Cadastrar uma conta;
                        2 - Listar todas as contas;
                        3 - Pesquisar uma conta;
                        4 - Alterar uma conta;
                        5 - Remover uma conta;
                    ]
                """);
            int opcao = lerDados.nextInt();
            switch (opcao){
                case 0:
                    continuarTela = false;
                    break;
                case 1:
                    contaView.cadastrarConta();
                    break;
                case 2:
                    contaView.mostrarContas();
                    break;
                case 3:
                    contaView.buscarCodigoConta();
                    break;
                case 4:
                    contaView.editarConta();
                    break;
                case 5:
                    contaView.deletarConta();
                    break;
                default:
                    System.out.println("Não foi encontrada essa opção!");
                    break;
            }
        }
    }
}
