package br.com.leperber.view;

import java.util.Scanner;

public class MenuCategoriaTransacao {

    private Scanner lerDados = new Scanner(System.in);
    private CategoriaTransacaoView categoriaTransacaoView = new CategoriaTransacaoView();

    public void iniciarMenu(){
        boolean continuarTela = true;
        while(continuarTela){
            System.out.println("MENU CATEGORIA TRANSACAO");
            System.out.println("""
                Para começar escolha uma opcao:
                    0 - Voltar para o menu inicial;
                    Categoria Transacao: [
                            1 - Cadastrar uma categoria;
                            2 - Listar todas as categoria;
                            3 - Pesquisar uma categoria;
                            4 - Alterar uma categoria;
                            5 - Remover uma categoria;
                        ]
                """);
            int opcao = lerDados.nextInt();
            switch (opcao){
                case 0:
                    continuarTela = false;
                    break;
                case 1:
                    categoriaTransacaoView.cadastrarCategoriaTransacao();
                    break;
                case 2:
                    categoriaTransacaoView.listarCategoriaTransacao();
                    break;
                case 3:
                    categoriaTransacaoView.buscarCodigoCategoriaTransacao();
                    break;
                case 4:
                    categoriaTransacaoView.editarCategoriaTransacao();
                    break;
                case 5:
                    categoriaTransacaoView.deletarCategoriaTransacao();
                    break;
                default:
                    System.out.println("Não foi encontrada essa opção!");
                    break;
            }
        }
    }
}
