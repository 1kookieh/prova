package org.example;

import org.example.Pessoas.Vendedor;

public class Pedido {
    int numeroPedido;
    int valorTotal;

    public Pedido(int numeroPedido, int valorTotal) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = 0;
    }

    public void adicionarProdutoAoPedido() {
        Produto produto = new Produto("Produto Exemplo", "Descricao Exemplo", 100.0, 10);
        System.out.println("Produto " + produto.getDescricao() + " adicionado ao pedido " + numeroPedido + ".\n");
        Produto.reduzirEstoque(produto, 1);
        ValorTotal += produto.getPreco();
    }

}
