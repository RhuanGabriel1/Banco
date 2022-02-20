package com.company.main;

import com.company.menus.*;

import java.util.InputMismatchException;
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

        while (true) {
            do {

                try {
                    System.out.println("\nDigite uma entrada: ");
                    menuPrincipal.setEntrada(s.nextInt());
                    s.nextLine();
                }catch (InputMismatchException e){
                    System.out.println("Tipo de entrada não aceita");
                    s.nextLine();
                }

            } while (menuPrincipal.getEntrada() != 1 && menuPrincipal.getEntrada() != 2);


            if (menuPrincipal.getEntrada() == 1) {

                if (menuLogin.comparacaoSenha()) {

                    if (menuLogin.getCnpjECpf().length() == 11) {

                        try{

                            do {
                                menuInsideHomePF.opcoesMenuInsideHomePF();
                            }while (menuInsideHomePF.receberEntrada(s.nextInt()));

                        }catch (InputMismatchException e){
                            s.nextLine();
                            System.out.println("Tipo de entrada não aceita");
                        }
                    }

                    if (menuLogin.getCnpjECpf().length() > 11 && menuLogin.getCnpjECpf().length() < 15) {

                        try{
                            do {
                                menuInsideHomePJ.opcoesMenuInsideHomePJ();

                            }while (menuInsideHomePJ.receberEntrada(s.nextInt()));
                        }catch (InputMismatchException e ){
                            s.nextLine();
                            System.out.println("Tipo de entrada não aceita");
                        }
                    }
                }

            }
            if (menuPrincipal.getEntrada() == 2) {

                try {
                    do {
                        menuCriacaoDeConta.opcoesMenuCriacaoDeConta();
                    }
                    while (menuCriacaoDeConta.receberEntrada(s.nextInt())) ;
                }catch (InputMismatchException e){
                    s.nextLine();
                    System.out.println("Tipo de entrada não aceita");
                }
            }
        }
    }
}
