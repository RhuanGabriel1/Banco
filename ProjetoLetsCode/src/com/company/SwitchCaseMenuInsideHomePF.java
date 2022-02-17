package com.company;

import com.company.dados.Dados;
import com.company.operacoes.ConsultarSaldo;
import com.company.operacoes.Depositar;

import java.math.BigDecimal;
import java.util.Scanner;

public class SwitchCaseMenuInsideHomePF {

    Scanner s = new Scanner(System.in);
    Dados dados = new Dados();
    ConsultarSaldo saldo = new ConsultarSaldo();
    Depositar depositar = new Depositar();
    private BigDecimal valor;

    public void receberEntrada(int entrada){

        switch (entrada){
            case 1:
                System.out.println(saldo.retornarSaldo(dados).toString());
                break;
//            case 2:
//                return 2;
            case 3:
                System.out.print("Digite o valor: R$ ");
                setValor(s.nextBigDecimal());
                depositar.depositar(getValor(), dados);
                break;
//            case 4:
//                return 4;
            default:
                System.out.println("Opção ínvalida");
                break;
        }

    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
