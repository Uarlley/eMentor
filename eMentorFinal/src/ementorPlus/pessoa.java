package ementorPlus;


public class pessoa{

    protected String nome;
    protected String dataNascimento;
    protected long CPF;
    protected String telefone;

    public pessoa(){
        this.nome = "";
        this.dataNascimento = "";
        this.CPF = 0;
        this.telefone = "";    
    }

    public pessoa(String nome, String dataNascimento, long CPF, String telefone){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public void setDados(String nome, String dataNascimento, long CPF, String telefone){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

}
