package com.company.operacoes;

import com.company.dados.Dados;

import java.math.BigDecimal;

public class Depositar {

    public void depositar(BigDecimal valor, Dados dados){
        dados.setSaldo(dados.getSaldo().add(valor));
    }

}
