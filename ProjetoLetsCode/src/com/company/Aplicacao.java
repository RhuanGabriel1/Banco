package com.company;

import com.company.menus.MenuInsideHomePF;
import com.company.menus.MenuLogin;
import com.company.menus.MenuPrincipal;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        MenuLogin menuLogin = new MenuLogin();
        SwitchCaseMenuInsideHomePF switchCase = new SwitchCaseMenuInsideHomePF();
        menuPrincipal.opcoesMenuPrincipal();

        do{
            System.out.println("Digite uma entrada: ");
            menuPrincipal.setEntrada(s.nextInt());
            s.nextLine();

        }while(menuPrincipal.getEntrada()!= 1 && menuPrincipal.getEntrada()!= 2);

        if(menuPrincipal.getEntrada() == 1) {
            menuLogin.opcoesMenuLogin();
            menuLogin.comparacaoSenha();

        if(menuLogin.comparacaoSenha()){
            MenuInsideHomePF menuInsideHomePF = new MenuInsideHomePF();
            menuInsideHomePF.opcoesMenuInsideHomePF();
            while(true){
                switchCase.receberEntrada(s.nextInt());
            }
        }


        }else{
            System.out.println("Em contrução!");
        }

    }

//            do{
//                System.out.println("Digite uma entrada: ");
//                menuInsideHomePF.setEntrada(s.nextInt());
//                s.nextLine();
//            }while (menuInsideHomePF.getEntrada()!=1 && menuInsideHomePF.getEntrada()!=2 &&
//                    menuInsideHomePF.getEntrada()!=3 && menuInsideHomePF.getEntrada()!=4);

}
