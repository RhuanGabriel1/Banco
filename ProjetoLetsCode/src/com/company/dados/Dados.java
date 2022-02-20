package com.company.dados;

import java.math.BigDecimal;

public class Dados{

    private final int numeroConta= 000, senha = 000;
    private BigDecimal saldo = BigDecimal.valueOf(1000);
    Object[] objeto = new Object[4];

    public void setarObjeto(){
        this.objeto[0] = "a";
        this.objeto[1] = "a";
//        this.objeto[2] = "12345678901234";
        this.objeto[2] = "12345678901";
        this.objeto[3] = "1111";
    }

    public void setObjeto(Object[] objeto) {
        this.objeto = objeto;
    }

    public Object[] getObjeto() {
        // TODO: 19/02/2022 Arrumar depois 
        setarObjeto();
        return objeto;
    }

    //
//    public void pegarDados(){
//        for(int i = 0 ; i< this.objeto.length; i ++){
//            System.out.println(this.objeto[i]);
//        }
//    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
