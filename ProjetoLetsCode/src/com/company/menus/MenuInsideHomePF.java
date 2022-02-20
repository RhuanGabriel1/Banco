package com.company.menus;

import com.company.contas.Conta;
import com.company.contas.ContaCorrente;
import com.company.contas.ContaInvestimento;
import com.company.contas.ContaPoupanca;
import com.company.dados.Dados;
import com.company.interfaces.Menus;

import java.math.BigDecimal;
import java.util.Scanner;


public class MenuInsideHomePF  implements Menus.IMenuInsideHomePF{

    Scanner s = new Scanner(System.in);
    Dados dados = new Dados();
    Conta contaCorrente = new ContaCorrente();
    Conta contaPoupanca = new ContaPoupanca();
    Conta contaInvestimento = new ContaInvestimento();
    MenuLogin menuLogin = new MenuLogin();

    private BigDecimal valor;
    private String cpfECnpj ;

    @Override
    public void opcoesMenuInsideHomePF() {
        System.out.println("\n1........................Consultar Saldo");
        System.out.println("2........................Sacar");
        System.out.println("3........................Depositar");
        System.out.println("4........................Transferir");
    }

    @Override
    public void receberEntrada(int entrada){
        switch (entrada){
            case 1:

                if(menuLogin.dados.getObjeto()[4].equals(1)){
                    System.out.println(contaCorrente.consultarSaldo(dados));
                }
                else if(menuLogin.dados.getObjeto()[4].equals(2)){
                    System.out.println(contaPoupanca.consultarSaldo(dados));
                }
                else if(menuLogin.dados.getObjeto()[4].equals(3)){
                    System.out.println(contaInvestimento.consultarSaldo(dados));
                }
                else{
                    System.out.println("Opção inválida");
                }

                break;
            case 2:
                System.out.print("\nDigite o valor: R$ ");
                setValor(s.nextBigDecimal());
                if(menuLogin.dados.getObjeto()[4].equals(1)){
                    contaCorrente.sacar(getValor() , dados);
                }
                else if (menuLogin.dados.getObjeto()[4].equals(2)){
                    contaPoupanca.sacar(getValor() , dados);
                }
                else if(menuLogin.dados.getObjeto()[4].equals(3)){
                    contaInvestimento.sacar(getValor() , dados);
                }
                else {
                    System.out.println("Opção inválida");
                }
                break;
            case 3:
                System.out.print("\nDigite o valor: R$ ");
                setValor(s.nextBigDecimal());
                if(menuLogin.dados.getObjeto()[4].equals(1)){
                    ContaCorrente cc = new ContaCorrente();
                    cc.depositar(getValor(), dados);
                }
                else if (menuLogin.dados.getObjeto()[4].equals(2)){
                    ContaPoupanca cp = new ContaPoupanca();
                    cp.depositarComRendimento(getValor(), dados);
                }
                else if(menuLogin.dados.getObjeto()[4].equals(3)){
                    ContaInvestimento ci = new ContaInvestimento();
                    ci.investirPF(getValor(), dados);
                }
                else {
                    System.out.println("Opção inválida");
                }
                break;
            case 4:
                System.out.print("\nDigite o CPF ou CNPJ da pessoa que irá receber o dinheiro: ");
                setCpfECnpj(s.nextLine());
                System.out.print("\nDigite o valor: R$ ");
                setValor(s.nextBigDecimal());
                s.nextLine();

                if(menuLogin.dados.getObjeto()[4].equals(1)){
                    ContaCorrente cc = new ContaCorrente();
                    cc.transferir(getValor(), dados, getCpfECnpj());
                }
                else if (menuLogin.dados.getObjeto()[4].equals(2)){
                    ContaPoupanca cp = new ContaPoupanca();
                    cp.transferir(getValor(),dados,cpfECnpj);
                }
                else if(menuLogin.dados.getObjeto()[4].equals(3)){
                    ContaInvestimento ci = new ContaInvestimento();
                    ci.transferir(getValor(),dados,cpfECnpj);
                }
                else {
                    System.out.println("Opção inválida");
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
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
