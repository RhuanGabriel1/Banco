package com.company;

import com.company.menus.MenuLogin;
import com.company.menus.MenuPrincipal;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        MenuLogin menuLogin = new MenuLogin();
        menuPrincipal.opcoesMenuPrincipal();

        do{
            System.out.println("Digite uma entrada: ");
            menuPrincipal.setEntrada(s.nextInt());
            s.nextLine();

        }while(menuPrincipal.getEntrada()!= 1 && menuPrincipal.getEntrada()!= 2);

        if(menuPrincipal.getEntrada() == 1) {
            menuLogin.opcoesMenuLogin();
            menuLogin.comparacaoSenha();
        }else{

        }

    }

}
