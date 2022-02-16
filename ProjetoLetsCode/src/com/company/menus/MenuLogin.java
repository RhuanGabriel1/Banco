package com.company.menus;

import com.company.dados.Dados;
import com.company.interfaces.Menus;

import java.util.Scanner;

public class MenuLogin implements Menus.IMenuLogin{

    Scanner s = new Scanner(System.in);
    private int senha, numeroAgencia, numeroConta;

    @Override
    public void opcoesMenuLogin() {
        numeroAgencia();
        numeroConta();
    }

    @Override
    public boolean comparacaoSenha() {
        Dados dados = new Dados();
        if(getNumeroConta() == dados.getNumeroConta()){
            senha();
            if (getSenha() == dados.getSenha()){
                return true;
            }else{
                System.out.println("Senha não encontrado. Abortando operação!");
                return false;
            }
        }else{
            System.out.println("Numero de conta não encontrado. Abortando operação!");
            return false;
        }
    }

    @Override
    public void recebeSenha() {
        setSenha(s.nextInt());
        s.nextLine();
    }

    @Override
    public void recebeNumeroConta() {
        setNumeroConta(s.nextInt());
        s.nextLine();
    }

    @Override
    public void recebeNumeroAgencia() {
        setNumeroAgencia(s.nextInt());
        s.nextLine();
    }

    @Override
    public void numeroConta() {
        System.out.print("Digite seu Número da Conta: ");
        recebeNumeroConta();
    }

    @Override
    public void numeroAgencia() {
        System.out.print("Digite o Número da Agencia: ");
        recebeNumeroAgencia();
    }
    @Override
    public void senha() {
        System.out.print("Digite sua senha: ");
        recebeSenha();
    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
