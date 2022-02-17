package com.company.menus;

import com.company.interfaces.Menus;


public class MenuInsideHomePF implements Menus.IMenuInsideHomePF {

    @Override
    public void opcoesMenuInsideHomePF() {
        System.out.println("1........................Consultar Saldo");
        System.out.println("2........................Sacar");
        System.out.println("3........................Depositar");
        System.out.println("4........................Transferir");
    }

}
