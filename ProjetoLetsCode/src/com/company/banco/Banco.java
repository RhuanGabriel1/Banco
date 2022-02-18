package com.company.banco;

import com.company.contas.Conta;
import com.company.dados.Dados;

import java.util.ArrayList;
import java.util.List;

public class Banco extends Conta {
    private List<Conta> criarConta = new ArrayList<>();

    public void abrirConta(Conta conta, Dados dados){
        this.criarConta.add(conta);
        dados.setarContas();
        gerarNumeroConta();
    }

}
