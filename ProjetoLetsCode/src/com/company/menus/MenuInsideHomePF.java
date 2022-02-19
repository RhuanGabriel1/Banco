package com.company.menus;

import com.company.banco.Banco;
import com.company.dados.Dados;
import com.company.interfaces.Menus;
import com.company.operacoes.ConsultarSaldo;
import com.company.operacoes.Depositar;
import com.company.operacoes.Sacar;

import java.math.BigDecimal;
import java.util.Scanner;


public class MenuInsideHomePF  implements Menus.IMenuInsideHomePF{

    Scanner s = new Scanner(System.in);
    Dados dados = new Dados();
    ConsultarSaldo saldo = new ConsultarSaldo();
    Depositar depositar = new Depositar();
    Sacar sacar = new Sacar();
    private BigDecimal valor;

    @Override
    public void opcoesMenuInsideHomePF() {
        System.out.println("\n1........................Consultar Saldo");
        System.out.println("2........................Sacar");
        System.out.println("3........................Depositar");
        System.out.println("4........................Transferir");
        System.out.println("5........................Voltar");
    }

    @Override
    public void receberEntrada(int entrada){
        switch (entrada){
            case 1:
                System.out.println(saldo.retornarSaldo(dados).toString());
                break;
            case 2:
                System.out.print("\nDigite o valor: R$ ");
                setValor(s.nextBigDecimal());
                sacar.sacar(getValor(), dados);
                break;
            case 3:
                System.out.print("\nDigite o valor: R$ ");
                setValor(s.nextBigDecimal());
                depositar.depositar(getValor(), dados);
                break;
            case 4:
                dados.pegarDados();
                Banco banco= new Banco();
                break;
            case 5:
                System.out.println("Em construção!");
                break;
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
