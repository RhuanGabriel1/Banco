package com.company.main;

import com.company.menus.*;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        MenuLogin menuLogin = new MenuLogin();
        MenuInsideHomePF menuInsideHomePF = new MenuInsideHomePF();
        MenuInsideHomePJ menuInsideHomePJ = new MenuInsideHomePJ();
        MenuCriacaoDeConta menuCriacaoDeConta = new MenuCriacaoDeConta();
        menuPrincipal.opcoesMenuPrincipal();

        do{
            System.out.println("Digite uma entrada: ");
            menuPrincipal.setEntrada(s.nextInt());
            s.nextLine();

        }while(menuPrincipal.getEntrada()!= 1 && menuPrincipal.getEntrada()!= 2);

        if(menuPrincipal.getEntrada() == 1) {
        if(menuLogin.comparacaoSenha()){

            if(menuLogin.getCnpjECpf().length() == 11) {

                while (true) {
                    menuInsideHomePF.opcoesMenuInsideHomePF();
                    menuInsideHomePF.receberEntrada(s.nextInt());
                }
            }
            if(menuLogin.getCnpjECpf().length()> 11 && menuLogin.getCnpjECpf().length()<15){

                while (true){
                    menuInsideHomePJ.opcoesMenuInsideHomePJ();
                    menuInsideHomePJ.receberEntrada(s.nextInt());
                }

            }

        }

        }else{
            while (true){
                menuCriacaoDeConta.opcoesMenuCriacaoDeConta();
                menuCriacaoDeConta.receberEntrada(s.nextInt());
            }
        }

    }
}
