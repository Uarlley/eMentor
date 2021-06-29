/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ementorPlus;

public class usuario{
    private String nome_usuario;
    private String senha;
    private int nivel_acesso;
    
    public usuario(){
        nome_usuario = "";
        senha = "";
        nivel_acesso = 1;
    }
    
    public usuario(String  nome_usuario, String senha, int nivel_acesso){
        this.nome_usuario = nome_usuario;
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
    }
    
    public String getNomeUsuario(){
        return this.nome_usuario;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setDados(String  nome_usuario, String senha, int nivel_acesso){
        this.nome_usuario = nome_usuario;
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
        return;
    }
    
}
