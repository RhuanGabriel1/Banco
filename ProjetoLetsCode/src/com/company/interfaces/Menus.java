package com.company.interfaces;

public interface Menus {

    interface IMenuPrincipal {
        void opcoesMenuPrincipal();
    }

    interface  IMenuLogin{
        void opcoesMenuLogin();
        boolean comparacaoSenha();
        void recebeSenha();
        void recebeNumeroConta();
        void recebeNumeroAgencia();
        void numeroConta();
        void numeroAgencia();
        void senha();
    }

    interface IMenuInsideHomePF{
        void opcoesMenuInsideHomePF();
    }


}
