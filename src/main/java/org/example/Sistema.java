package org.example;

import org.example.Enums.Endereco;
import org.example.Pessoas.Cliente;

import java.util.Scanner;

public class Sistema {

    public void CadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        String CPF = scanner.nextLine();
        System.out.println("Digite o telefone do cliente: ");
        int telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a data de nascimento do cliente: ");
        String dataNasc = scanner.nextLine();
        System.out.println("Digite o endereco do cliente: ");
        Endereco endereco = Endereco.valueOf(scanner.nextLine());
        Cliente cliente = new Cliente(nome, CPF, telefone, dataNasc, endereco);
    }


    public void RealizarPedidoDeCompra(int NumeroDoPedido, int preco, int quantidadeEstoque) {

    }
}
