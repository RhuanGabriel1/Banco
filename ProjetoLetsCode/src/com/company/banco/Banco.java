package com.company.banco;

import com.company.contas.Conta;
import com.company.contas.ContaCorrente;
import com.company.dados.Dados;

import java.util.ArrayList;
import java.util.List;

public class Banco extends Conta {

    List<Conta> criarConta = new ArrayList<>();

    public void abrirConta(Conta conta) {


        criarConta.add(conta);
        criarConta.forEach(System.out::println);

    }

}
