package org.example.Pessoas;

import org.example.Enums.Endereco;

import java.util.Scanner;

public class Supervisor extends Pessoa{

    public Supervisor(String nome, String CPF, int telefone, String dataNasc, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

    public boolean AprovarPedido(){
        if(Va)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja aprovar o pedido? (1/2)\n");
        String resposta = scanner.nextLine();
        if(resposta.equals("1")){
            System.out.println("Pedido aprovado!\n");
            return true;
        } else if(resposta.equals("2")){
            System.out.println("Pedido reprovado!\n");
            return false;
        }
        return false;
    }

}
