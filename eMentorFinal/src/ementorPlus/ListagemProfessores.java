package ementorPlus;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListagemProfessores extends javax.swing.JFrame {
    
    private DefaultTableModel TabelaProfessores = null;

    //Construtor
    public ListagemProfessores() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icon.png")));
        initComponents();
        ConexoesMySql conec = new ConexoesMySql();
        TabelaProfessores = (DefaultTableModel) tabela2.getModel();
        tabela2.getTableHeader().setFont(new Font("Shrek", 1 , 12));
        ArrayList<Professor> Professores = (ArrayList<Professor>)(ArrayList<?>)conec.recuperaDados("professor");
        Professores.forEach(obj -> {
            TabelaProfessores.addRow(new Object []{obj.nome,obj.CPF,obj.dataNascimento, obj.telefone, obj.getDataAdm(),obj.getSalarioBruto(),obj.getSalarioLiquido()});
        });
        System.out.println("Tabela de professores criada!");
    }

    public void addToTable(Professor obj){
        if(TabelaProfessores != null){
            TabelaProfessores.addRow(new Object []{obj.nome,obj.CPF,obj.dataNascimento, obj.telefone, obj.getDataAdm(),obj.getSalarioBruto(),obj.getSalarioLiquido()});
        }
    }
    
    public void deleteFromTable(String CPF){
        int i,n;
        if(TabelaProfessores!=null){
            n = TabelaProfessores.getRowCount();
            for(i = 0; i<n;i++){
                if(CPF.equals(TabelaProfessores.getValueAt(i, 1).toString())) {
                    TabelaProfessores.removeRow(i);
                    return;
                }
            }
        }
    }
    
    public void modifyTable(Professor obj){
        int i,n;
        if(TabelaProfessores!=null){
            n = TabelaProfessores.getRowCount();
            for(i = 0; i<n;i++){
                if(obj.CPF == (long)(TabelaProfessores.getValueAt(i, 1))){
                    if(!obj.nome.equals("")) TabelaProfessores.setValueAt(obj.nome, i, 0);
                    if(!obj.dataNascimento.equals("")) TabelaProfessores.setValueAt(obj.dataNascimento, i, 2);
                    if(!obj.telefone.equals("")) TabelaProfessores.setValueAt(obj.telefone, i, 3);
                    if(!obj.getDataAdm().equals("")) TabelaProfessores.setValueAt(obj.getDataAdm(), i, 4);
                    if(obj.getSalarioBruto() != -1) {
                        TabelaProfessores.setValueAt(obj.getSalarioBruto(), i, 5);
                        TabelaProfessores.setValueAt(obj.getSalarioLiquido(),i,6);
                    }
                    
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelImagemFundo1 = new ementorPlus.PainelImagemFundo();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela2 = new javax.swing.JTable();
        outlineLabel1 = new ementorPlus.OutlineLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        painelImagemFundo1.setBackground(new java.awt.Color(255, 255, 51));
        painelImagemFundo1.setImg(new ImageIcon("src/imagens/lista.jpg"));

        tabela2.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        tabela2.setForeground(new java.awt.Color(102, 102, 102));
        tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Telefone", "Data de Admissao", "Salario Bruto", "Salario Liquido"
            }
        ));
        tabela2.setGridColor(new java.awt.Color(153, 153, 153));
        tabela2.setOpaque(false);
        tabela2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabela2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tabela2);

        outlineLabel1.setForeground(new java.awt.Color(51, 51, 51));
        outlineLabel1.setText("Professores Cadastrados");
        outlineLabel1.setFont(new java.awt.Font("Shrek", 0, 24)); // NOI18N

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outlineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(outlineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void tabela2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabela2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela2AncestorAdded

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
            java.util.logging.Logger.getLogger(ListagemProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemProfessores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private ementorPlus.OutlineLabel outlineLabel1;
    private ementorPlus.PainelImagemFundo painelImagemFundo1;
    private javax.swing.JTable tabela2;
    // End of variables declaration//GEN-END:variables
}
