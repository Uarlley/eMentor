package ementorPlus;

public class Professor extends pessoa{

    private static final long serialVersionUID = 1L;
    private String dataAdm;
    private double salarioBruto;
    
    public Professor(){
        super();
        this.dataAdm = "";
        this.salarioBruto = 0;
    }
    
    public Professor(String nome, String dataNascimento, long CPF, String telefone, String dataAdm, double salarioBruto){
        super(nome, dataNascimento, CPF,telefone);
        this.dataAdm = dataAdm;
        this.salarioBruto = salarioBruto;
    }

    public void setDados(String nome, String dataNascimento, long CPF, String telefone, String dataAdm, double salarioBruto){
        super.setDados(nome, dataNascimento, CPF,telefone);
        this.dataAdm = dataAdm;
        this.salarioBruto = salarioBruto;
    }

    public String getDataAdm(){
        return this.dataAdm;
    }

    public double getSalarioBruto(){
        return this.salarioBruto;
    }
    
    public void imprimeDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.CPF);
        System.out.println("Data Nascimento: "+this.dataNascimento);
        System.out.println("Salário Bruto: "+this.salarioBruto);
        System.out.println("Data de Admissão: "+this.dataAdm);
    }
    
    public double getSalarioLiquido(){
        if(this.salarioBruto < 5000) return this.salarioBruto*0.86;
        else return this.salarioBruto*0.635;
    }
}