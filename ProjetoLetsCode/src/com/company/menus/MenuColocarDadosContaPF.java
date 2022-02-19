package com.company.menus;

import com.company.contas.ContaPoupanca;
import com.company.interfaces.Menus;

import java.util.Scanner;

public class MenuColocarDadosContaPF implements Menus.IMenuColocarDadosContaPF {

    Scanner s = new Scanner(System.in);

    private String nome, senha, cpf;

    private int entrada;

    @Override
    public void digitarMenuColocarDadosContaPF() {

        System.out.print("Nome: ");
        nome = s.nextLine();
        System.out.print("Senha: ");
        senha = s.nextLine();
        System.out.print("CPF: ");
        cpf = s.nextLine();
        opcoesDeConta();
        System.out.print("Tipo de conta:  ");
        do {
            entrada = s.nextInt();
        }while (entrada!= 1 && entrada!= 2 && entrada!=3);
        s.nextLine();
    }

    @Override
    public void opcoesDeConta() {
        System.out.println("\n1........................Conta Corrente");
        System.out.println("2........................Conta Poupança");
        System.out.println("3........................Conta Investimento");
    }

    @Override
    public void criacaoDeConta(){
        if(devolveTipoDeConta() == 1){


        }else if(devolveTipoDeConta() == 2){
//            System.out.print("Saldo incial: ");
//            contaPoupanca.setSaldo(s.nextBigDecimal());
//            banco.abrirConta(contaPoupanca);
        }else{
//            System.out.print("Saldo incial: ");
//            contaInvestimento.setSaldo(s.nextBigDecimal());
//            banco.abrirConta(contaInvestimento);
        }
    }

    public int devolveTipoDeConta(){
        return entrada;
    }

}
