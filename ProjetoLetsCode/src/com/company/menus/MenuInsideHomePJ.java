package com.company.menus;

import com.company.interfaces.Menus;

public class MenuInsideHomePJ  implements Menus.IMenuInsideHomePJ {


    @Override
    public void opcoesMenuInsideHomePJ() {
        System.out.println("1........................Consultar Saldo");
        System.out.println("2........................Sacar");
        System.out.println("3........................Investir");
        System.out.println("4........................Transferir");
        System.out.println("5........................Voltar");
    }
}
