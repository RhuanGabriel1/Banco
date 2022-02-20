package com.company.banco;

import com.company.contas.Conta;
import com.company.dados.Dados;

public class Banco extends Conta {

    public void abrirConta(Object obeject[], Dados dados) {
        dados.setObjeto(obeject);
    }


}
