package org.example.Pessoas;

import org.example.Enums.Endereco;

public class Cliente extends Pessoa{

    public Cliente(String nome, String CPF, int telefone, String dataNasc, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }
}
