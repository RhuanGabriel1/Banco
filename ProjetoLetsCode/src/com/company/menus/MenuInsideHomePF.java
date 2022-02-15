package com.company.menus;

import com.company.interfaces.Menus;

public class MenuInsideHomePF implements Menus.IMenuInsideHomePF {

    private int entrada;


    @Override
    public void opcoesMenuInsideHomePF() {
        System.out.println("\nSeja Bem-Vindo!");
        System.out.println("\n1........................Consultar Saldo");
        System.out.println("\n2........................Sacar");
        System.out.println("\n3........................Depositar");
        System.out.println("4........................Transferir");
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
}
