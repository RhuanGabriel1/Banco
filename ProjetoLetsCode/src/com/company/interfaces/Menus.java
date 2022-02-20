package com.company.interfaces;

public interface Menus {

    interface IMenuPrincipal {
        void opcoesMenuPrincipal();
    }

    interface  IMenuLogin{
        boolean comparacaoSenha();
        void senha();
        void recebeSenha();
        void cnpjECpf();
        void recebeCnpjECpf();
    }

    interface IMenuInsideHomePF{
        void opcoesMenuInsideHomePF();
        boolean receberEntrada(int entrada);
    }

    interface IMenuInsideHomePJ{
        void opcoesMenuInsideHomePJ();
        boolean receberEntrada(int entrada);
    }

    interface IMenuCriacaoDeConta{
        void opcoesMenuCriacaoDeConta();
        boolean receberEntrada(int entrada);
    }

    interface IMenuColocarDadosContaPF {
        void digitarMenuColocarDadosContaPF();
        void opcoesDeConta();
        void criacaoDeConta();
    }
    interface IMenuColocarDadosContaPJ {
        void digitarMenuColocarDadosContaPJ();
        void opcoesDeConta();
        void criacaoDeConta();
    }

}
