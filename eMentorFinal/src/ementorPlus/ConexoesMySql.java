

package ementorPlus;

import java.awt.Font;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class ConexoesMySql {
    
    private String driveJDBC = "com.mysql.cj.jdbc.Driver";
    private String caminho = "localhost";
    private String porta = "3306";
    private String nome = "ementor";
    private String user = "root";
    private String senha = "admin";
    private String FusoHorario = "?useTimezone=true&serverTimezone=UTC";
    
    private String URL = "jdbc:mysql://"+caminho+":"+porta+"/"+nome+FusoHorario;
    
    public Connection realizaConexaoMySql(){
        try{
            return DriverManager.getConnection(URL,user,senha);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,mensagensDeAviso("A conexão falhou..." + e) , "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public JLabel mensagensDeAviso(String mensagem){
        JLabel label = new JLabel(mensagem);
        label.setFont(new Font("Shrek", 1, 13));
        return label;
    }
    public void desconectaMySql(Connection conexao){
        try{
            if(conexao != null) conexao.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,mensagensDeAviso("A conexão falhou..." + e) , "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public int insereDadosNoMySql(Object obj){
        Connection conexao = realizaConexaoMySql();
        try{
            aluno Aluno = (aluno)obj;
            String sql_pessoa = "insert into pessoa (CPF, Nome, Telefone, DataNascimento) values (?,?,?,?)";
            String sql_aluno = "insert into aluno (Matricula, CPF_Pessoa, Periodo) values (?,?,?)";
            try{
                PreparedStatement atuador_pessoa = conexao.prepareStatement(sql_pessoa);
                atuador_pessoa.setLong(1,Aluno.CPF);
                atuador_pessoa.setString(2,Aluno.nome);
                atuador_pessoa.setString(3,Aluno.telefone);
                atuador_pessoa.setString(4,Aluno.dataNascimento);
                atuador_pessoa.execute();

                PreparedStatement atuador_aluno = conexao.prepareStatement(sql_aluno);
                atuador_aluno.setLong(1,Aluno.getMatricula());
                atuador_aluno.setLong(2,Aluno.CPF);
                atuador_aluno.setInt(3,Aluno.getPeriodo());
                atuador_aluno.execute();
                atuador_aluno.close();
                atuador_pessoa.close(); 

                JOptionPane.showMessageDialog(null, mensagensDeAviso("Cadastro realizado com sucesso."), "Sucess",JOptionPane.INFORMATION_MESSAGE);

            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos sao invalidos : " + e),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
                desconectaMySql(conexao);
                return 0;
            }
        }
        catch(Exception e){
            Professor professor = (Professor)obj;
            String sql_pessoa = "insert into pessoa (CPF, Nome, Telefone, DataNascimento) values (?,?,?,?)";
            String sql_professor = "insert into professor (DataAdm, CPF_Pessoa, SalarioBruto) values (?,?,?)";
            try{
                PreparedStatement atuador_pessoa = conexao.prepareStatement(sql_pessoa);
                atuador_pessoa.setLong(1,professor.CPF);
                atuador_pessoa.setString(2,professor.nome);
                atuador_pessoa.setString(3,professor.telefone);
                atuador_pessoa.setString(4,professor.dataNascimento);
                atuador_pessoa.execute();
                

                PreparedStatement atuador_professor = conexao.prepareStatement(sql_professor);
                atuador_professor.setString(1,professor.getDataAdm());
                atuador_professor.setLong(2,professor.CPF);
                atuador_professor.setDouble(3,professor.getSalarioBruto());
                atuador_professor.execute();

                JOptionPane.showMessageDialog(null, mensagensDeAviso("Cadastro realizado com sucesso."), "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                atuador_professor.close();
                atuador_pessoa.close();
            }
            catch(SQLException k){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos sao invalidos : " + e),"DADOS NÃO SUPORTADOS",JOptionPane.ERROR_MESSAGE);
                desconectaMySql(conexao);
                return 0;
            }
        }
        desconectaMySql(conexao);
        return 1;
    }
    
    public int deletarDadosnoMySql(String CPF){
        int tipo;
        Object obj;
        try{
            Long.parseLong(CPF); 
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,mensagensDeAviso("Entrada Invalida."),"AVISO",JOptionPane.WARNING_MESSAGE);
            return 0;
        }
        obj = buscaCadastro(CPF);
        try{
            int erros = (int)obj;
            if(erros == 0){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("CPF nao encontrado."),"ERRO",JOptionPane.ERROR_MESSAGE);
                return 0;
            }
            else return -1;
        }
        catch(Exception e){
            try{
                aluno Aluno = (aluno)obj;
                tipo = 1;
            }
            catch(Exception k){
                tipo = 2;
            }
        }
        try{
            
            Connection conexao = realizaConexaoMySql();
            String sql_selecao_pessoa = "DELETE FROM ementor.pessoa where CPF=" + CPF + ";";
            PreparedStatement atuador_selecao_pessoa = conexao.prepareStatement(sql_selecao_pessoa);
            
            if(tipo == 1){
                String sql_selecao_aluno = "DELETE FROM ementor.aluno where " + CPF + "=CPF_Pessoa;";
                PreparedStatement atuador_selecao_aluno = conexao.prepareStatement(sql_selecao_aluno);
                atuador_selecao_aluno.execute();
                atuador_selecao_aluno.close();
            }
            else{
                String sql_selecao_professor = "DELETE FROM ementor.professor where " + CPF + "=CPF_Pessoa;";
                PreparedStatement atuador_selecao_professor = conexao.prepareStatement(sql_selecao_professor);
                atuador_selecao_professor.execute();
                atuador_selecao_professor.close();

            }
            atuador_selecao_pessoa.execute();
            JOptionPane.showMessageDialog(null,mensagensDeAviso("Cadastro deletado."),"SUCESSO",JOptionPane.INFORMATION_MESSAGE);
            atuador_selecao_pessoa.close();
            desconectaMySql(conexao);
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,mensagensDeAviso("Um erro inesperado occorreu : " + e),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
        return tipo;
    }
    
    public boolean login(String nomeUsuario, String senha){
        Connection conexao = realizaConexaoMySql();
        try{
            String sql_selecao_user = "SELECT *FROM ementor.usuario WHERE usuario.nome= \"" + nomeUsuario + "\";";
            PreparedStatement atuador_selecao_user = conexao.prepareStatement(sql_selecao_user);
            ResultSet ResultadosSelecao = atuador_selecao_user.executeQuery();
            if(ResultadosSelecao.next()){
                String auxSenha = ResultadosSelecao.getString("senha");
                if(!auxSenha.equals(senha)){
                    JOptionPane.showMessageDialog(null,mensagensDeAviso("Usuario ou Senha incorretos.") , "ERRO", JOptionPane.ERROR_MESSAGE);
                    desconectaMySql(conexao);
                    return false;
                }
                ResultadosSelecao.close();
                atuador_selecao_user.close();
                desconectaMySql(conexao);
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Usuario ou Senha incorretos.") , "ERRO", JOptionPane.ERROR_MESSAGE);
                desconectaMySql(conexao);
                return false;
            }


        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,mensagensDeAviso("Ocorreu um erro inesperado..." + e) , "ERRO", JOptionPane.ERROR_MESSAGE);
            desconectaMySql(conexao);
            return false;
        }
    }
    
    public int atualizaDadosNoMySQLProfessor(String CPF, String dataAdm, String salarioBruto){
        int i = 0;
        String sql ="update ementor.professor set ";
        if(!dataAdm.equals("")){
            sql += "DataAdm=\"" + dataAdm + "\"";
            i++;
        }
        if(!salarioBruto.equals("")){
            if(i>0) sql += ",";
            sql += "SalarioBruto=\"" + salarioBruto + "\"";
            i++;
        }
        if(i == 0) return 1;
        Connection conexao = realizaConexaoMySql();
        sql += " where " + CPF + " = CPF_Pessoa;";
        System.out.println(sql);
        try{
            PreparedStatement Atuador = conexao.prepareStatement(sql);  
            
            Atuador.execute();
            Atuador.close();
                     
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos sao invalidos : "+e),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
          desconectaMySql(conexao);
          return 0;
        }
        desconectaMySql(conexao);
        return 2;
        
    }
    
    public int atualizaDadosNoMySQLAluno(String CPF,String matricula, String periodo){

        int i = 0;
        String sql ="update ementor.aluno set ";
        if(!periodo.equals("")){
            sql += "Periodo=\"" + periodo + "\"";
            i++;
        }
        if(!matricula.equals("")){
            if(i>0) sql += ",";
            sql += "Matricula=\"" + matricula + "\"";
            i++;
        }
        if(i == 0) return 1;
        Connection conexao = realizaConexaoMySql();
        sql += " where " + CPF + " = CPF_Pessoa;";
        System.out.println(sql);
        try{
            PreparedStatement Atuador = conexao.prepareStatement(sql);  
            
            Atuador.execute();
            Atuador.close();
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos sao invalidos : " + e),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
          desconectaMySql(conexao);
          return 0;
        }
        desconectaMySql(conexao);
        return 2;
    }
    
    public int atualizaDadosNoMySQLPessoa(String CPF, String nome, String dataNascimento,String Telefone){
        int i = 0;
        String sql ="update ementor.pessoa set ";
        if(!nome.equals("")){
            sql += "Nome=\"" + nome + "\"";
            i++;
        }
        if(!dataNascimento.equals("")){
            if(i>0) sql += ",";
            sql += "DataNascimento=\"" + dataNascimento + "\"";
            i++;
        }
        if(!Telefone.equals("")){
            if(i>0) sql += ",";
            sql += "Telefone=\"" + Telefone + "\"";
            i++;
        }
        
        sql += " where CPF= " + CPF + ";";
        
        System.out.println(sql);
        if(i == 0) return 1;
        Connection conexao = realizaConexaoMySql();
        try{
            PreparedStatement Atuador = conexao.prepareStatement(sql);  
            
            Atuador.execute();
            Atuador.close();
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos sao invalidos : " + e),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
          desconectaMySql(conexao);
          return 0;
        }
        desconectaMySql(conexao);
        return 2;
    }
    
    public Object buscaCadastro(String CPF){
        Connection conexao = realizaConexaoMySql();
        try{
            String sql_selecao_aluno = "SELECT *FROM ementor.pessoa, ementor.aluno WHERE pessoa.CPF=aluno.CPF_Pessoa and " + CPF + "=CPF_Pessoa;";
            String sql_selecao_professor = "SELECT *FROM ementor.pessoa, ementor.professor where pessoa.CPF = professor.CPF_Pessoa and " + CPF + "=CPF_Pessoa;";
            System.out.println(sql_selecao_aluno);
            System.out.println(sql_selecao_professor);
            PreparedStatement atuador_selecao_aluno = conexao.prepareStatement(sql_selecao_aluno);
            PreparedStatement atuador_selecao_professor = conexao.prepareStatement(sql_selecao_professor);
            ResultSet ResultadosSelecao1 = atuador_selecao_aluno.executeQuery();
            ResultSet ResultadosSelecao2 = atuador_selecao_professor.executeQuery();
            if(ResultadosSelecao1.next()){
                aluno ObjetoAluno = new aluno();
                ObjetoAluno.CPF = ResultadosSelecao1.getLong("CPF");
                ObjetoAluno.nome = ResultadosSelecao1.getString("Nome");
                ObjetoAluno.dataNascimento = ResultadosSelecao1.getString("DataNascimento");
                ObjetoAluno.telefone = ResultadosSelecao1.getString("Telefone");
                ObjetoAluno.setMatricula(ResultadosSelecao1.getLong("Matricula"));
                ObjetoAluno.setPeriodo(ResultadosSelecao1.getInt("Periodo"));
                ResultadosSelecao1.close();
                ResultadosSelecao2.close();
                atuador_selecao_aluno.close();
                atuador_selecao_professor.close();
                desconectaMySql(conexao);
                return ObjetoAluno;
            }
            else if(ResultadosSelecao2.next()){
                Professor ObjetoProfessor = new Professor();
                ObjetoProfessor.setDados(ResultadosSelecao2.getString("Nome"),
                                         ResultadosSelecao2.getString("DataNascimento"),
                                         ResultadosSelecao2.getLong("CPF"),
                                         ResultadosSelecao2.getString("Telefone"),
                                         ResultadosSelecao2.getString("DataAdm"),
                                         ResultadosSelecao2.getDouble("SalarioBruto"));
                ResultadosSelecao1.close();
                ResultadosSelecao2.close();
                atuador_selecao_aluno.close();
                atuador_selecao_professor.close();
                desconectaMySql(conexao);
                return ObjetoProfessor;
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Um erro inesperado ocorreu : " + e,"ERRO",JOptionPane.ERROR_MESSAGE);
            desconectaMySql(conexao);
            return -1;
        }
        desconectaMySql(conexao);
        return 0;
    }
    
    public ArrayList<Object> recuperaDados(String tipo){
        Connection conexao = realizaConexaoMySql();
        if((tipo).equals("aluno")){   
            ArrayList<Object> Academico  = new ArrayList();

            try{
                String tipoOrdenacao = "Nome";
                String sql_selecao_aluno = "SELECT *FROM ementor.pessoa, ementor.aluno WHERE pessoa.CPF=aluno.CPF_Pessoa ORDER BY " + tipoOrdenacao + ";";
                PreparedStatement atuador_selecao_aluno = conexao.prepareStatement(sql_selecao_aluno);
                ResultSet ResultadosSelecao = atuador_selecao_aluno.executeQuery();
                while(ResultadosSelecao.next()){
                    aluno ObjetoAluno = new aluno();
                    ObjetoAluno.CPF = ResultadosSelecao.getLong("CPF");
                    ObjetoAluno.nome = ResultadosSelecao.getString("Nome");
                    ObjetoAluno.dataNascimento = ResultadosSelecao.getString("DataNascimento");
                    ObjetoAluno.telefone = ResultadosSelecao.getString("Telefone");
                    ObjetoAluno.setMatricula(ResultadosSelecao.getLong("Matricula"));
                    ObjetoAluno.setPeriodo(ResultadosSelecao.getInt("Periodo"));
                    Academico.add(ObjetoAluno);
                }
                ResultadosSelecao.close();
                atuador_selecao_aluno.close();
                desconectaMySql(conexao);
                return Academico;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Um erro inesperado ocorreu : " + e), "ERRO", JOptionPane.ERROR_MESSAGE);
                desconectaMySql(conexao);
                return null;
            }
        }
        else{
            ArrayList<Object> Professores  = new ArrayList();

            try{
                String tipoOrdenacao = "Nome";
                String sql_selecao_professor = "SELECT *FROM ementor.pessoa, ementor.professor WHERE pessoa.CPF=professor.CPF_Pessoa ORDER BY " + tipoOrdenacao + ";";
                PreparedStatement atuador_selecao_professor = conexao.prepareStatement(sql_selecao_professor);
                ResultSet ResultadosSelecao = atuador_selecao_professor.executeQuery();
                while(ResultadosSelecao.next()){
                    Professor ObjetoProfessor = new Professor();
                    ObjetoProfessor.setDados(ResultadosSelecao.getString("Nome"),
                                             ResultadosSelecao.getString("DataNascimento"),
                                             ResultadosSelecao.getLong("CPF"),
                                             ResultadosSelecao.getString("Telefone"),
                                             ResultadosSelecao.getString("DataAdm"),
                                             ResultadosSelecao.getDouble("SalarioBruto"));
                    Professores.add(ObjetoProfessor);

                }
                ResultadosSelecao.close();
                atuador_selecao_professor.close();
                desconectaMySql(conexao);
                return Professores;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Um erro inesperado ocorreu : " + e) , "ERRO", JOptionPane.ERROR_MESSAGE);
                desconectaMySql(conexao);
                return null;
            }
        }
    }
}
