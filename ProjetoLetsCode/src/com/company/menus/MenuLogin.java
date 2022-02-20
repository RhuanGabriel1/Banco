package com.company.menus;

import com.company.dados.Dados;
import com.company.interfaces.Menus;

import java.util.Scanner;

public class MenuLogin implements Menus.IMenuLogin{

    Scanner s = new Scanner(System.in);
    Dados dados = new Dados();
    Object objeto = new Object[1];

    private String senha, cnpjECpf;

    @Override
    public boolean comparacaoSenha() {
        cnpjECpf();
        if(getCnpjECpf().equals(dados.getObjeto()[2])){
            senha();
            if (getSenha().equals(dados.getObjeto()[1])){
                return true;
            }else{
                System.out.println("Senha não encontrado. Abortando operação!");
                return false;
            }
        }else{
            System.out.println("Número do CPF/CPNJ não encotrado!");
            return false;
        }
    }

    @Override
    public void recebeSenha() {
        setSenha(s.nextLine());
    }

    @Override
    public void senha() {
        objeto = dados.getObjeto()[4];
        System.out.print("Digite sua senha: ");
        recebeSenha();
    }

    @Override
    public void recebeCnpjECpf() {
        setCnpjECpf(s.nextLine());
    }

    @Override
    public void cnpjECpf() {
        System.out.print("Digite seu CPF/CNPJ: ");
        recebeCnpjECpf();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCnpjECpf() {
        return cnpjECpf;
    }

    public void setCnpjECpf(String cnpjECpf) {
        this.cnpjECpf = cnpjECpf;
    }

}
