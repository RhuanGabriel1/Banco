package com.company.contas;

import com.company.dados.Dados;
import com.company.usuarios.Clientes;

import java.math.BigDecimal;

public abstract class Conta extends Clientes {
    private BigDecimal saldo;

    public Object consultarSaldo(Dados dados){
        System.out.print("\nSaldo: R$ ");
        return dados.getSaldo();
    }

    public void sacarPF(BigDecimal valor, Dados dados){
        dados.setSaldo(dados.getSaldo().subtract(valor));
    }

    public void sacarPJ(BigDecimal valor, Dados dados){

        BigDecimal aux = valor.subtract(valor.multiply(BigDecimal.valueOf(0.5)));
        dados.setSaldo(dados.getSaldo().subtract(valor));
        dados.setSaldo(dados.getSaldo().subtract(aux));
    }

    public void transferirPF(BigDecimal valor, Dados dados, String cpfECnpj){
        if(dados.getObjetoContaTransferencia()[2].equals(cpfECnpj)){
            dados.setSaldo(dados.getSaldo().subtract(valor));
            dados.setSaldoContaTransferencia(dados.getSaldoContaTransferencia().add(valor));
            System.out.println("Valor pos tranferencia: " + dados.getSaldoContaTransferencia());
        }else {
            System.out.println("CPF/CNPJ não encontrado");
        }
    }

    public void transferirPJ(BigDecimal valor, Dados dados, String cpfECnpj){

        if(dados.getObjetoContaTransferencia()[2].equals(cpfECnpj)){

            dados.setSaldo(dados.getSaldo().subtract(valor));
            BigDecimal auxParaDescontar = valor.multiply(BigDecimal.valueOf(0.5));
            dados.setSaldo(dados.getSaldo().subtract(auxParaDescontar));
            dados.setSaldoContaTransferencia(dados.getSaldoContaTransferencia().add(valor));

        }else{
            System.out.println("CPF/CNPJ não encontrado");
        }
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
