package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "shampoo";
        produto.preco = 20;
        produto.quantidade = 5;

        System.out.printf("""
                
                Nome do Produto: %s
                Preço do Produto : %.2f
                Quantidade do Produto : %d
                """, produto.nome, produto.preco , produto.quantidade);

    }
}
