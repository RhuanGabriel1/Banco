package com.company.menus;

import com.company.contas.Conta;
import com.company.contas.ContaCorrente;
import com.company.contas.ContaInvestimento;
import com.company.dados.Dados;
import com.company.interfaces.Menus;

import java.math.BigDecimal;
import java.util.Scanner;

public class MenuInsideHomePJ implements Menus.IMenuInsideHomePJ {

    Scanner s = new Scanner(System.in);
    Dados dados = new Dados();

    Conta contaCorrente = new ContaCorrente();
    Conta contaInvestimento = new ContaInvestimento();

    MenuLogin menuLogin = new MenuLogin();

    private BigDecimal valor;
    private String cpfECnpj ;

    @Override
    public void opcoesMenuInsideHomePJ() {
        System.out.println("\nPessoa Jurídica");

        System.out.println("1........................Consultar Saldo");
        System.out.println("2........................Sacar");
        System.out.println("3........................Investir");
        System.out.println("4........................Transferir");
    }

    @Override
    public boolean receberEntrada(int entrada) {
        switch (entrada){
            case 1:

                if(menuLogin.dados.getObjeto()[4].equals(1)){
                    System.out.println(contaCorrente.consultarSaldo(dados));
                }
                else if(menuLogin.dados.getObjeto()[4].equals(2)){
                    System.out.println(contaInvestimento.consultarSaldo(dados));
                }
                else{
                    System.out.println("Opção inválida");
                }

                return false;

            case 2:
                System.out.print("\nDigite o valor: R$ ");
                setValor(s.nextBigDecimal());

                if(menuLogin.dados.getObjeto()[4].equals(1)){
                    contaCorrente.sacarPJ(getValor() , dados);
                }
                else if(menuLogin.dados.getObjeto()[4].equals(2)){
                    contaInvestimento.sacarPJ(getValor() , dados);
                }
                else {
                    System.out.println("Opção inválida");
                }

                return false;

            case 3:
                System.out.print("\nDigite o valor: R$ ");
                setValor(s.nextBigDecimal());

                if(menuLogin.dados.getObjeto()[4].equals(1)){
                    ContaCorrente cc = new ContaCorrente();
                    cc.depositar(getValor(), dados);
                }
                else if(menuLogin.dados.getObjeto()[4].equals(2)){
                    ContaInvestimento ci = new ContaInvestimento();
                    ci.investirPJ(getValor(), dados);
                }
                else {
                    System.out.println("Opção inválida");
                }

                return false;

            case 4:
                System.out.print("\nDigite o CPF ou CNPJ da pessoa que irá receber o dinheiro: ");
                setCpfECnpj(s.nextLine());
                System.out.print("\nDigite o valor: R$ ");
                setValor(s.nextBigDecimal());
                s.nextLine();

                if(menuLogin.dados.getObjeto()[4].equals(1)){
                    ContaCorrente cc = new ContaCorrente();
                    cc.transferirPJ(getValor(), dados, getCpfECnpj());
                }
                else if(menuLogin.dados.getObjeto()[4].equals(2)){
                    ContaInvestimento ci = new ContaInvestimento();
                    ci.transferirPJ(getValor(),dados,cpfECnpj);
                }
                else {
                    System.out.println("Opção inválida");
                }
                return false;

            default:
                System.out.println("Opção ínvalida");

                return false;
        }
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getCpfECnpj() {
        return cpfECnpj;
    }

    public void setCpfECnpj(String cpfECnpj) {
        this.cpfECnpj = cpfECnpj;
    }
}
