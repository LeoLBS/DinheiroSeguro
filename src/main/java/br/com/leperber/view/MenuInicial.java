package br.com.leperber.view;

import java.util.Scanner;

public final class MenuInicial {

    private Scanner lerDados = new Scanner(System.in);
    private MenuCategoriaTransacao menuCategoriaTransacao = new MenuCategoriaTransacao();
    private MenuConta menuConta = new MenuConta();

    public void iniciar() {

        boolean continuaPrograma = true;

        while (continuaPrograma) {
            System.out.println("PROGRAMA DINHEIRO SEGURO");

            System.out.println("""
                    Escolha uma opcao do menu:
                        [1] Menu Conta
                        [2] Menu Categoria Transacao
                        Sair[0]
                    """);
            int opcaoEscolha = lerDados.nextInt();

            switch (opcaoEscolha) {
                case 1:
                    menuConta.iniciarMenu();
                    break;
                case 2:
                    menuCategoriaTransacao.iniciarMenu();
                    break;
                case 0:
                    continuaPrograma = false;
                    break;
                default:
                    System.out.println("Nao foi encontra a opcao!");
                    break;
            }
        }
    }
}
