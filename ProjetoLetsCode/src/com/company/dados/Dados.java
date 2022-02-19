package com.company.dados;

import com.company.contas.Conta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Dados{

    private final int numeroConta= 000, senha = 000;
    private BigDecimal saldo = BigDecimal.valueOf(1000);

    private List<Conta> contas = new ArrayList<>();

    public void setarContas(){
//        contas.add()
    }

    public void pegarDados(){

    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSenha() {
        return senha;
    }

}
