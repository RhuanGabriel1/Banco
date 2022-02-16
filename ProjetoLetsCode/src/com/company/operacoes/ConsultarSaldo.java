package com.company.operacoes;

import com.company.dados.Dados;

import java.math.BigDecimal;

public class ConsultarSaldo {

    Dados dados = new Dados();

    public BigDecimal retornarSaldo(){
       return dados.getSaldo();
    }

}
