package com.company.menus;

import com.company.interfaces.Menus;

public class MenuPrincipal implements Menus.IMenuPrincipal{

    private int entrada;

    @Override
    public void opcoesMenuPrincipal(){
        System.out.println("\nSeja Bem-Vindo!");
        System.out.println("\n1........................Login");
        System.out.println("2........................Criar Conta");
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
}
