package com.company.contas;

import com.company.dados.Dados;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public void investirPF(BigDecimal valor, Dados dados){
        dados.setSaldo(dados.getSaldo().add(valor));
    }

    public void investirPJ(BigDecimal valor, Dados dados){
        BigDecimal auxValorMultiplicado = valor.multiply(BigDecimal.valueOf(0.2));
        BigDecimal auxValorDeposito = dados.getSaldo().add(valor);
        dados.setSaldo(auxValorDeposito.add(auxValorMultiplicado));
    }

}
