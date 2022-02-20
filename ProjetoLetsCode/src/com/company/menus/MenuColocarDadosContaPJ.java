package com.company.menus;

import com.company.banco.Banco;
import com.company.contas.Conta;
import com.company.contas.ContaCorrente;
import com.company.contas.ContaInvestimento;
import com.company.dados.Dados;
import com.company.interfaces.Menus;
import com.company.usuarios.ClientePJ;

import java.util.Scanner;

public class MenuColocarDadosContaPJ implements Menus.IMenuColocarDadosContaPJ{

    Scanner s = new Scanner(System.in);
    ClientePJ clientePJ = new ClientePJ();
    Banco banco = new Banco();
    Dados dados = new Dados();
    Object[] objeto = new Object[4];

    private int entrada;

    @Override
    public void opcoesDeConta() {
        System.out.println("\n1........................Conta Corrente");
        System.out.println("2........................Conta Investimento");
    }

    @Override
    public void digitarMenuColocarDadosContaPJ() {
        System.out.print("Nome: ");
        clientePJ.setNome(s.nextLine());
        System.out.print("Senha: ");
        clientePJ.setSenha(s.nextLine());
        System.out.print("CNPJ: ");
        clientePJ.setCNPJ(s.nextLine());
        opcoesDeConta();
        System.out.print("Tipo de conta:  ");
        do {
            setEntrada(s.nextInt());
        }while (entrada!= 1 && entrada!= 2);
        s.nextLine();
    }

    @Override
    public void criacaoDeConta() {

        digitarMenuColocarDadosContaPJ();

        if (getEntrada()==1) {
            Conta conta = new ContaCorrente();
            System.out.print("\nSaldo inicial: ");
            conta.setSaldo(s.nextBigDecimal());

            objeto[0] = clientePJ.getNome();
            objeto[1] = clientePJ.getSenha();
            objeto[2] = clientePJ.getCNPJ();
            objeto[3] = conta.getSaldo();

            banco.abrirConta(objeto,dados);
        }else if(getEntrada()==2){
            Conta conta = new ContaInvestimento();
            System.out.print("\nSaldo inicial: ");
            conta.setSaldo(s.nextBigDecimal());

            objeto[0] = clientePJ.getNome();
            objeto[1] = clientePJ.getSenha();
            objeto[2] = clientePJ.getCNPJ();
            objeto[3] = conta.getSaldo();
            banco.abrirConta(objeto,dados);

        }else{
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
