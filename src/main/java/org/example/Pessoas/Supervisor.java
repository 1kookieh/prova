package org.example.Pessoas;

import org.example.Endereco;

public class Supervisor extends Pessoa{

    public Supervisor(String nome, String CPF, int telefone, String dataNasc, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }
}
