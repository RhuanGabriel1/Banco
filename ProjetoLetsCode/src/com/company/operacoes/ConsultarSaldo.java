package com.company.operacoes;

import com.company.dados.Dados;

import java.math.BigDecimal;

public class ConsultarSaldo {

    public BigDecimal retornarSaldo(Dados dados){
        System.out.print("\nSaldo: R$ ");
        return dados.getSaldo();
    }

}
