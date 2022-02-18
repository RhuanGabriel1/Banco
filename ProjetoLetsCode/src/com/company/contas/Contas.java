package com.company.contas;

import com.company.usuarios.Clientes;

import java.util.Random;

public abstract class Contas extends Clientes {

    private String numeroDaConta;


    public void gerarNumeroConta(){
        Random random = new Random();
        this.numeroDaConta = String.valueOf(random.nextInt(5000) + 1000);
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }
}
