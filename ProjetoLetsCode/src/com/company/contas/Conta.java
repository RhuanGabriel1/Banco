package com.company.contas;

import com.company.usuarios.Clientes;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Conta extends Clientes {

    private String numeroDaConta;

    public Conta(){

    }


    public void gerarNumeroConta(){
        Random random = new Random();
        this.numeroDaConta = String.valueOf(random.nextInt(5000) + 1000);
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }
}
