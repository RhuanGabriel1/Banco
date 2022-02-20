package com.company.contas;

import com.company.dados.Dados;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public void depositarComRendimento(BigDecimal valor, Dados dados){
        BigDecimal auxValorMultiplicado = valor.multiply(BigDecimal.valueOf(0.1));
        BigDecimal auxValorDeposito = dados.getSaldo().add(valor);
        dados.setSaldo(auxValorDeposito.add(auxValorMultiplicado));
    }

}
