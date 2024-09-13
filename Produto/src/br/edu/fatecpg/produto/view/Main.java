package br.edu.fatecpg.produto.view;
import br.edu.fatecpg.produto.model.Produto;

public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Notebook", 2500.00, 10);
        produto1.exibirProduto();

        System.out.println("\nPreço negativo:");
        produto1.setPreco(-500.00);
        produto1.exibirProduto();

        System.out.println("\nQuantidade de estoque negativa:");
        produto1.setQuantidadeEstoque(-5);
        produto1.exibirProduto();

        System.out.println("\nTeste dos produtos com entradas válidas:");
        produto1.setPreco(3000.00);
        produto1.setQuantidadeEstoque(15);
        produto1.exibirProduto();
    }
}
