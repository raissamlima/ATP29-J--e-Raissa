package ATP29.view;

import ATP29.controller.CategoriaController;
import ATP29.controller.ProdutoController;
import ATP29.model.Categoria;
import ATP29.model.Produto;

public class Main {
    public static void main(String[] args) {

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
        
    }  
}
