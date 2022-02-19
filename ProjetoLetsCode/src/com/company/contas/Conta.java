package com.company.contas;

import com.company.usuarios.Clientes;

import java.math.BigDecimal;

public abstract class Conta extends Clientes {
    private BigDecimal saldo;


    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
