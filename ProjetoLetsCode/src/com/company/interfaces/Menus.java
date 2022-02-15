package com.company.interfaces;

public interface Menus {

    interface IMenuPrincipal {
        void opcoesMenuPrincipal();
    }

    interface  IMenuLogin{
        void opcoesMenuLogin();
        void senha();
        boolean comparacaoSenha();
        void recebeSenha();
    }



}
