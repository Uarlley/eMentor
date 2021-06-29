package ementorPlus;

public class aluno extends pessoa{

    private static final long serialVersionUID = 1L;
    private long matricula;
    private int periodo;

    public aluno(){
        super();
        this.matricula = 0;
        this.periodo = 0;
    }

    public aluno(String nome, String dataNascimento, long CPF, String telefone, long matricula, int periodo){
        super(nome, dataNascimento, CPF, telefone);
        this.matricula = matricula;
        this.periodo = periodo;
    }

    public void setDados(String nome, String dataNascimento, long CPF, String telefone, long matricula, int periodo){
        super.setDados(nome, dataNascimento, CPF, telefone);
        this.matricula = matricula;
        this.periodo = periodo;
    }

    public long getMatricula(){
        return this.matricula;
    }
    
    public int getPeriodo(){
        return this.periodo;  
    }
    
    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }
    
    public void setMatricula(long matricula){
        this.matricula = matricula;
    }
    
    public void imprimeDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.CPF);
        System.out.println("Data Nascimento: "+this.dataNascimento);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Periodo: "+this.periodo);
    }
         
}