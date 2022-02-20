package com.company.menus;

import com.company.interfaces.Menus;

import java.util.Scanner;

public class MenuCriacaoDeConta implements Menus.IMenuCriacaoDeConta {

    private MenuColocarDadosContaPF menuColocarDadosContaPF = new MenuColocarDadosContaPF();
    private MenuColocarDadosContaPJ menuColocarDadosContaPJ = new MenuColocarDadosContaPJ();

    @Override
    public void opcoesMenuCriacaoDeConta() {
        System.out.println("\n1........................Pessoa Física");
        System.out.println("2........................Pessoa Jurídica");
    }

    @Override
    public boolean receberEntrada(int entrada) {

        switch(entrada){
            case 1:
                System.out.println("Pessoa Física\n");
                menuColocarDadosContaPF.criacaoDeConta();

                return false;
            case 2:
                System.out.println("Pessoa Jurídica\n");
                menuColocarDadosContaPJ.criacaoDeConta();
                return false;
            default:
                System.out.println("Opção ínvalida");
                return false;
        }
    }
}
