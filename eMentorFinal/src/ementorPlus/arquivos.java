package ementorPlus;
import java.io.*;

public class arquivos implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public void salvar(Object[] objeto, String nomeArquivo){
        File arquivo = new File(nomeArquivo);

        try{
            FileOutputStream f_out = new FileOutputStream(arquivo);
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);

            obj_out.writeObject(objeto);
            obj_out.flush();
            obj_out.close();
            f_out.close(); 
        }
        catch( Exception ex){
            System.out.println("ERRO: " + ex.toString());
        }

    }

    public Object[] ler(Object[] vetor, String nomeArquivo){
        File arquivo = new File(nomeArquivo);

        try{
            FileInputStream f_in = new FileInputStream(arquivo);
            ObjectInputStream obj_in = new ObjectInputStream(f_in);

            vetor = (Object [])obj_in.readObject();
            obj_in.close();
            f_in.close();
        }
        catch( Exception ex){
            System.out.println("ERRO: " + ex.toString());
        }

        return vetor;
    } 

    public void salvarIndice(int i, String nomeArquivo){
        File arquivo = new File(nomeArquivo);

        try{
            FileOutputStream f_out = new FileOutputStream(arquivo);
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);

            obj_out.writeObject(i);
            obj_out.flush();
            obj_out.close();
            f_out.close(); 
        }
        catch(Exception ex){
            System.out.println("ERRO: " + ex.toString());
        }

    }

    public int lerIndice(String nomeArquivo){
        File arquivo = new File(nomeArquivo);
        int i = 0;
        try{
            FileInputStream f_in = new FileInputStream(arquivo);
            ObjectInputStream obj_in = new ObjectInputStream(f_in);

            i = (int)obj_in.readObject();
            obj_in.close();
            f_in.close();
        }
        catch(Exception ex){
            System.out.println("ERRO: " + ex.toString());
        }

        return i;
    } 
    
    public void delete(String nomeArquivo){
        
        File arquivo = new File(nomeArquivo);
        arquivo.delete();
    }
}