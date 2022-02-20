package com.company.contas;


import com.company.dados.Dados;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    public void depositar(BigDecimal valor, Dados dados){
        dados.setSaldo(dados.getSaldo().add(valor));
    }

}
