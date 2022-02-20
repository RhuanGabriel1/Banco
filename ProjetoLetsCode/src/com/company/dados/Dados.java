package com.company.dados;

import java.math.BigDecimal;

public class Dados{

    private BigDecimal saldo = BigDecimal.valueOf(1000);
    private BigDecimal saldoContaTransferencia = BigDecimal.valueOf(1000);;
    Object[] objeto = new Object[5];
    Object[] objetoContaTransferencia = new Object[5];

    public  Dados(){
        setarObjeto();
    }

    public void setarObjeto(){
        this.objeto[0] = "a";
        this.objeto[1] = "a";
        this.objeto[2] = "12345678901";
        this.saldo = (BigDecimal) (this.objeto[3] = BigDecimal.valueOf(1111));
        this.objeto[4] = 2;

        this.objetoContaTransferencia[0] = "Joao";
        this.objetoContaTransferencia[1] = "a";
        this.objetoContaTransferencia[2] = "12345678900";
        this.saldoContaTransferencia = (BigDecimal) (this.objeto[3] = BigDecimal.valueOf(1111));
        this.objeto[4] = 2;
    }

    public void setObjeto(Object[] objeto) {
        this.objeto = objeto;
    }

    public Object[] getObjeto() {
        // TODO: 19/02/2022 Arrumar depois 
        return objeto;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {return saldo;}

    public BigDecimal getSaldoContaTransferencia() {
        return saldoContaTransferencia;
    }

    public void setSaldoContaTransferencia(BigDecimal saldoContaTransferencia) {
        this.saldoContaTransferencia = saldoContaTransferencia;
    }

    public Object[] getObjetoContaTransferencia() {
        return objetoContaTransferencia;
    }

}
