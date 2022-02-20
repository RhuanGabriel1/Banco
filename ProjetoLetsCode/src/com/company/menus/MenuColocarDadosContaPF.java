package com.company.menus;

import com.company.banco.Banco;
import com.company.contas.Conta;
import com.company.contas.ContaCorrente;
import com.company.contas.ContaInvestimento;
import com.company.contas.ContaPoupanca;
import com.company.dados.Dados;
import com.company.interfaces.Menus;
import com.company.usuarios.ClientePF;

import java.util.Scanner;

public class MenuColocarDadosContaPF implements Menus.IMenuColocarDadosContaPF {

    Scanner s = new Scanner(System.in);
    ClientePF clientePF = new ClientePF();
    Banco banco = new Banco();
    Dados dados = new Dados();
    Object[] objeto = new Object[4];


    private int entrada;

    @Override
    public void digitarMenuColocarDadosContaPF() {

        System.out.print("Nome: ");
        clientePF.setNome(s.nextLine());
        System.out.print("Senha: ");
        clientePF.setSenha(s.nextLine());
        System.out.print("CPF: ");
        clientePF.setCPF(s.nextLine());
        opcoesDeConta();
        System.out.print("Tipo de conta:  ");
        do {
            setEntrada(s.nextInt());
        }while (entrada!= 1 && entrada!= 2 && entrada!=3);
        s.nextLine();
    }

    @Override
    public void opcoesDeConta() {
        System.out.println("\n1........................Conta Corrente");
        System.out.println("2........................Conta Poupança");
        System.out.println("3........................Conta Investimento");
    }

    @Override
    public void criacaoDeConta(){

        digitarMenuColocarDadosContaPF();

        if(getEntrada() == 1){

            Conta conta = new ContaCorrente();
            System.out.print("\nSaldo inicial: ");
            conta.setSaldo(s.nextBigDecimal());

            objeto[0] = clientePF.getNome();
            objeto[1] = clientePF.getSenha();
            objeto[2] = clientePF.getCPF();
            objeto[3] = conta.getSaldo();

            banco.abrirConta(objeto,dados);

        }else if(getEntrada() == 2){
            Conta conta = new ContaPoupanca();

            System.out.print("\nSaldo inicial: ");
            conta.setSaldo(s.nextBigDecimal());

            objeto[0] = clientePF.getNome();
            objeto[1] = clientePF.getSenha();
            objeto[2] = clientePF.getCPF();
            objeto[3] = conta.getSaldo();

            banco.abrirConta(objeto,dados);
        }else if(getEntrada()==3){
            Conta conta = new ContaInvestimento();

            System.out.print("\nSaldo inicial: ");
            conta.setSaldo(s.nextBigDecimal());

            objeto[0] = clientePF.getNome();
            objeto[1] = clientePF.getSenha();
            objeto[2] = clientePF.getCPF();
            objeto[3] = conta.getSaldo();

            banco.abrirConta(objeto,dados);
        }else {
            System.out.println("Opção incorreta");
        }

    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
}
