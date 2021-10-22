package ATP29.view;

import ATP29.controller.CategoriaController;
import ATP29.controller.ProdutoController;
import ATP29.model.Categoria;
import ATP29.model.Produto;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CategoriaController categoriaController = new CategoriaController();
        ProdutoController produtoController = new ProdutoController();

        Categoria c = new Categoria();
        Produto pd = new Produto();

        // CATEGORIA
        c.nome_filme = "As Branquelas";
        c.ator_principal = "Maykon Dyego";
        c.atriz_principal = "Maykon Talita";
        c.duracao = "2h e 10m";

        // PRODUTO
        pd.dvd = "Box";

        // IMPRESSAO

        System.out.println(c);
        System.out.println(pd);


        System.out.println("=============================CADASTRO DE PRODUTOS E CATEGORIAS ===================================");
        System.out.println("Escolha uma opção: \n 1-Cadastrar \n 2-Listar \n 3-Atualizar \n 4-Deletar \n 5-Sair");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                produtoController.create(pd);
                System.out.println("------------Cadastrado realizado com sucesso!----------------");
                System.out.println(pd);
                break;

            case 2:
                produtoController.read();
                System.out.println("-------------Lista Cadastrada-----------------");
                break;

            case 3:
                produtoController.update(pd);
                System.out.println("------------Atualizada com sucesso!----------------");
                System.out.println(pd);
                break;

            case 4:
                produtoController.delete(pd);
                System.out.println("-----Deletado com sucesso---------");
                break;

            case 5:
            default:
                System.out.println("Saindo");
                break;
        }


    }

}
