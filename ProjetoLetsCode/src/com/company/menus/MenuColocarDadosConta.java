package com.company.menus;

import com.company.banco.Banco;
import com.company.interfaces.Menus;

import java.util.Scanner;

public class MenuColocarDadosConta implements Menus.IMenuColocarDadosConta {

    Banco banco = new Banco();
    Scanner s = new Scanner(System.in);

    @Override
    public void digitarMenuColocarDadosConta() {
        System.out.print("Nome: ");
        banco.setNome(s.nextLine());
        System.out.println("Senha: ");
        banco.setSenha(s.nextLine());
        System.out.print("Saldo");
    }
}
