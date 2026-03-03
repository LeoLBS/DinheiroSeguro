package br.com.leperber.view;

import br.com.leperber.controller.CategoriaTransacaoController;
import br.com.leperber.model.CategoriaTransacao;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class CategoriaTransacaoView {

    private Scanner lerDados = new Scanner(System.in);
    private CategoriaTransacaoController categoriaTransacaoController =
            new CategoriaTransacaoController();

    private int codigoCategoriaTransacao = 0;
    private String nomeCategoriaTransacao = "";

    public void cadastrarCategoriaTransacao(){
        System.out.println("CADASTRO DE CATEGORIA TRANSACAO");
        System.out.println("Informe o codigo da categoria:");
        this.codigoCategoriaTransacao = lerDados.nextInt();
        System.out.println("Informe o nome da categoria:");
        lerDados.nextLine();
        this.nomeCategoriaTransacao = lerDados.nextLine();

        try {
            if(this.categoriaTransacaoController.
                    cadastrarCategoriaTransacao(this.codigoCategoriaTransacao,this.nomeCategoriaTransacao)){

                System.out.println("Categoria cadastrada!");
            }else{
                System.out.println("Não foi possivel cadastrar a categoria!");
            }
        }catch (IllegalArgumentException ae){
            System.out.println("Erro: " + ae.getMessage());
        }
    }

    public void listarCategoriaTransacao(){
        for(CategoriaTransacao categoriaTransacao : this.categoriaTransacaoController.
                retornarListaCategoriaTransacao()){
            System.out.println("Categoria cadastrada: \n" + categoriaTransacao.toString());
        }
    }

    public void buscarCodigoCategoriaTransacao(){
        System.out.println("Informe o codigo da categoria:");
        this.codigoCategoriaTransacao = lerDados.nextInt();

        if(this.categoriaTransacaoController.verificarCategoriaTransacao(this.codigoCategoriaTransacao)) {
            System.out.println("Categoria encontrada: \n" + this.categoriaTransacaoController.
                    buscaCategoriaTransacaoCodigo(this.codigoCategoriaTransacao).toString());
        }else {
            System.out.println("Categoria não encontrada!!");
        }
    }

    public void editarCategoriaTransacao(){
        System.out.println("Informe o codigo da categoria que quer alterar:");
        codigoCategoriaTransacao = lerDados.nextInt();
        if(categoriaTransacaoController.verificarCategoriaTransacao(codigoCategoriaTransacao)) {
            System.out.println("Informe o novo nome:");
            lerDados.nextLine();
            this.nomeCategoriaTransacao = lerDados.nextLine();
            if(categoriaTransacaoController.
                    editarNomeCategoriaTransacao(codigoCategoriaTransacao, nomeCategoriaTransacao)){

                System.out.println("Nome da categoria foi editado!");
            }else {
                System.out.println("Não foi possivel editar no nome da categoria!");
            }
        }else {
            System.out.println("Categoria não encontrada!");
        }
    }

    public void deletarCategoriaTransacao(){
        System.out.println("Informe o codigo da categoria:");
        codigoCategoriaTransacao = lerDados.nextInt();
        if(categoriaTransacaoController.verificarCategoriaTransacao(codigoCategoriaTransacao)){
            if(categoriaTransacaoController.removerCategoriaTransacao(codigoCategoriaTransacao)){
                System.out.println("Categoria foi removida!");
            }else {
                System.out.println("Não foi possivel remover a categoria!");
            }
        }else {
            System.out.println("Categoria não encontrada!");
        }
    }
}
