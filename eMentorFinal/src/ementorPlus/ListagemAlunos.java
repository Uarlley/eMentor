

package ementorPlus;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class ListagemAlunos extends javax.swing.JFrame {
    private DefaultTableModel TabelaAlunos = null;
    
    //Construtor
    public ListagemAlunos() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icon.png")));
        initComponents();
        TabelaAlunos = (DefaultTableModel) Tabela.getModel();
        ConexoesMySql conec = new ConexoesMySql();
        Tabela.getTableHeader().setFont(new Font("Shrek", 1 , 12));
        ArrayList<aluno> Alunos = (ArrayList<aluno>)(ArrayList<?>)conec.recuperaDados("aluno");
        Alunos.forEach(obj -> {
            TabelaAlunos.addRow(new Object []{obj.nome,obj.CPF,obj.dataNascimento, obj.telefone, obj.getMatricula(),obj.getPeriodo()});
        });
        System.out.println("Tabela de alunos criada!");
    }
    public void addToTable(aluno obj){
        if(TabelaAlunos != null){
            TabelaAlunos.addRow(new Object []{obj.nome,obj.CPF,obj.dataNascimento, obj.telefone, obj.getMatricula(),obj.getPeriodo()});
        }
    }
    
    public void deleteFromTable(String CPF){
        int i,n;
        if(TabelaAlunos!=null){
            n = TabelaAlunos.getRowCount();
            for(i = 0; i<n;i++){
                if(CPF.equals(TabelaAlunos.getValueAt(i, 1).toString())) {
                    TabelaAlunos.removeRow(i);
                    return ;
                }
            }
        }
    }
    
    public void modifyTable(String CPF, String nome, String dataNascimento, String telefone, String matricula, String periodo){
        int i,n;
        if(TabelaAlunos!=null){
            n = TabelaAlunos.getRowCount();
            for(i = 0; i<n;i++){
                if(CPF.equals(TabelaAlunos.getValueAt(i, 1).toString())){
                    if(!nome.equals("")) TabelaAlunos.setValueAt(nome, i, 0);
                    if(!dataNascimento.equals("")) TabelaAlunos.setValueAt(dataNascimento, i, 2);
                    if(!telefone.equals("")) TabelaAlunos.setValueAt(telefone, i, 3);
                    if(!matricula.equals("")) TabelaAlunos.setValueAt(Long.parseLong(matricula), i, 4);
                    if(!periodo.equals("")) TabelaAlunos.setValueAt(Integer.parseInt(periodo), i, 5);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelImagemFundo1 = new ementorPlus.PainelImagemFundo();
        outlineLabel1 = new ementorPlus.OutlineLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        painelImagemFundo1.setBackground(new java.awt.Color(0, 204, 204));
        painelImagemFundo1.setForeground(new java.awt.Color(0, 255, 255));
        painelImagemFundo1.setImg(new ImageIcon("src/imagens/lista.jpg"));

        outlineLabel1.setForeground(new java.awt.Color(51, 51, 51));
        outlineLabel1.setText("Alunos Cadastrados");
        outlineLabel1.setFont(new java.awt.Font("Shrek", 0, 24)); // NOI18N

        Tabela.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        Tabela.setForeground(new java.awt.Color(102, 102, 102));
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Telefone", "Matricula", "Periodo"
            }
        ));
        Tabela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TabelaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outlineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(outlineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaAncestorAdded

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListagemAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    private ementorPlus.OutlineLabel outlineLabel1;
    private ementorPlus.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables
}
