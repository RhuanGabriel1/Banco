package com.company.operacoes;

import com.company.dados.Dados;

import java.math.BigDecimal;

public class Sacar {

    public void sacar(BigDecimal valor, Dados dados){
        dados.setSaldo(dados.getSaldo().subtract(valor));
    }
}
