package com.company.banco;

import com.company.contas.Conta;

public class Banco extends Conta {


    public void abrirConta(Object obeject[]) {

        for(int i = 0 ; i< obeject.length; i ++){
            System.out.println(obeject[i]);
        }

    }


}
