package com.company.menus;

import com.company.interfaces.Menus;

import java.util.Scanner;

public class MenuCriacaoDeConta implements Menus.IMenuCriacaoDeConta {

    Scanner s = new Scanner(System.in);
    MenuColocarDadosContaPF menuColocarDadosContaPF = new MenuColocarDadosContaPF();

    @Override
    public void opcoesMenuCriacaoDeConta() {
        System.out.println("\n1........................Pessoa Física");
        System.out.println("2........................Pessoa Jurídica");
    }

    @Override
    public void receberEntrada(int entrada) {
        switch(entrada){
            case 1:
                System.out.println("Pessoa Física\n");

                menuColocarDadosContaPF.digitarMenuColocarDadosContaPF();
                menuColocarDadosContaPF.criacaoDeConta();

            case 2:
                System.out.println("Pessoa Jurídica");
                break;
            default:
                System.out.println("Opção ínvalida");
                break;
        }
    }
}
