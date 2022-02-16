package com.company.operacoes;

import com.company.dados.Dados;

import java.math.BigDecimal;

public class Depositar {

    Dados dados = new Dados();

    public void depositar(BigDecimal valor){
        dados.setSaldo(dados.getSaldo().add(valor));
        System.out.println(valor + " " + dados.getSaldo());
    }

}
