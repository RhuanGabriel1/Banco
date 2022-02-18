package com.company.menus;

import com.company.banco.Banco;
import com.company.dados.Dados;
import com.company.interfaces.Menus;

import java.util.Scanner;

public class MenuCriacaoDeConta implements Menus.IMenuCriacaoDeConta {

    Scanner s = new Scanner(System.in);
    Dados dados = new Dados();
    Banco banco = new Banco();

    @Override
    public void opcoesMenuCriacaoDeConta() {
        System.out.println("\n1........................Conta Pessoa Física");
        System.out.println("2........................Conta Pessoa Jurídica");
    }

    @Override
    public void receberEntrada(int entrada) {
        switch(entrada){
            case 1:
                System.out.println("Pessoa Física");
                break;
            case 2:
                System.out.println("Pessoa Jurídica");
                break;
            default:
                System.out.println("Opção ínvalida");
                break;
        }
    }
}
