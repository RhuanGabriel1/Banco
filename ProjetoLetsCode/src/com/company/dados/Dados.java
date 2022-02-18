package com.company.dados;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Dados{

    private final int numeroConta= 000, senha = 000;
    private BigDecimal saldo = BigDecimal.valueOf(1000);

    List<String> lista = new ArrayList<>();


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
