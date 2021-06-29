
package ementorPlus;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Cadastros extends javax.swing.JFrame {
    private ListagemAlunos TabelaAlunos = new ListagemAlunos();
    private ListagemProfessores TabelaProfessores = new ListagemProfessores();
    
    //Usada pra definir se o CPF entrado nas buscas é de um aluno ou professor
    private String tag = "";

    //Construtor
    public Cadastros() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icon.png")));
        CADASTRO.setEnabled(false);
        LISTAGEM.setEnabled(false);
        DELETE.setEnabled(false);
        ALTERAR.setEnabled(false);
        LN1.setVisible(false);
        LN2.setVisible(false);
        N1.setVisible(false);
        N2.setVisible(false);
        jPanel1.setOpaque(false);
        setMODFalse();
        jPanel1.setBackground(new Color(0,0,0,125));
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        painelImagemFundo2 = new ementorPlus.PainelImagemFundo();
        ABAS = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        painelImagemFundo1 = new ementorPlus.PainelImagemFundo();
        Seletor = new javax.swing.JComboBox<>();
        NOME = new javax.swing.JTextField();
        CPF = new javax.swing.JTextField();
        DATANASCIMENTO = new javax.swing.JTextField();
        TELEFONE = new javax.swing.JTextField();
        LISTAGEM = new javax.swing.JButton();
        CADASTRO = new javax.swing.JButton();
        N1 = new javax.swing.JTextField();
        N2 = new javax.swing.JTextField();
        DELETE = new javax.swing.JButton();
        LNOME = new ementorPlus.OutlineLabel();
        LCPF = new ementorPlus.OutlineLabel();
        LDATANASCIMENTO = new ementorPlus.OutlineLabel();
        LTELEFONE = new ementorPlus.OutlineLabel();
        LN1 = new ementorPlus.OutlineLabel();
        LN2 = new ementorPlus.OutlineLabel();
        jPanel2 = new javax.swing.JPanel();
        painelImagemFundo3 = new ementorPlus.PainelImagemFundo();
        BTNBUSCAR = new javax.swing.JButton();
        MODN1 = new javax.swing.JTextField();
        MODN2 = new javax.swing.JTextField();
        MODCPF = new javax.swing.JTextField();
        MODNome = new javax.swing.JTextField();
        MODDataNascimento = new javax.swing.JTextField();
        MODTelefone = new javax.swing.JTextField();
        CANCEL = new javax.swing.JButton();
        ALTERAR = new javax.swing.JButton();
        LMODCPF = new ementorPlus.OutlineLabel();
        INFOPESSOAL = new ementorPlus.OutlineLabel();
        INFON = new ementorPlus.OutlineLabel();
        LMODNome = new ementorPlus.OutlineLabel();
        LMODDataNascimento = new ementorPlus.OutlineLabel();
        LMODTelefone = new ementorPlus.OutlineLabel();
        LMODN1 = new ementorPlus.OutlineLabel();
        LMODN2 = new ementorPlus.OutlineLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelImagemFundo2.setBackground(new java.awt.Color(0, 51, 204));
        painelImagemFundo2.setImg(new ImageIcon("src/imagens/fundo.jpg"));

        ABAS.setForeground(new java.awt.Color(51, 51, 51));
        ABAS.setFocusCycleRoot(true);
        ABAS.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        painelImagemFundo1.setBackground(new java.awt.Color(51, 255, 51));
        painelImagemFundo1.setImg(new ImageIcon("src/imagens/cadastros.jpg"));

        Seletor.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N
        Seletor.setForeground(new java.awt.Color(51, 51, 51));
        Seletor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opcao", "Aluno", "Professor", "Excluir um cadastro" }));
        Seletor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeletorActionPerformed(evt);
            }
        });

        NOME.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMEActionPerformed(evt);
            }
        });

        CPF.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        CPF.setPreferredSize(new java.awt.Dimension(13, 30));
        CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFActionPerformed(evt);
            }
        });

        DATANASCIMENTO.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        DATANASCIMENTO.setMinimumSize(new java.awt.Dimension(13, 30));
        DATANASCIMENTO.setPreferredSize(new java.awt.Dimension(13, 30));

        TELEFONE.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        TELEFONE.setMinimumSize(new java.awt.Dimension(13, 30));
        TELEFONE.setPreferredSize(new java.awt.Dimension(13, 30));
        TELEFONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELEFONEActionPerformed(evt);
            }
        });

        LISTAGEM.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N
        LISTAGEM.setForeground(new java.awt.Color(51, 51, 51));
        LISTAGEM.setText("Listar");
        LISTAGEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTAGEMActionPerformed(evt);
            }
        });

        CADASTRO.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N
        CADASTRO.setForeground(new java.awt.Color(51, 51, 51));
        CADASTRO.setText("Cadastrar");
        CADASTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTROActionPerformed(evt);
            }
        });

        N1.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N

        N2.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        N2.setToolTipText("");
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });

        DELETE.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N
        DELETE.setForeground(new java.awt.Color(51, 51, 51));
        DELETE.setText("Excluir Cadastro");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        LNOME.setBackground(new java.awt.Color(0, 0, 0));
        LNOME.setForeground(new java.awt.Color(51, 51, 51));
        LNOME.setText("Nome");
        LNOME.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        LCPF.setForeground(new java.awt.Color(51, 51, 51));
        LCPF.setText("CPF");
        LCPF.setFont(new java.awt.Font("Shrek", 0, 13)); // NOI18N

        LDATANASCIMENTO.setForeground(new java.awt.Color(51, 51, 51));
        LDATANASCIMENTO.setText("Data de Nascimento");
        LDATANASCIMENTO.setFont(new java.awt.Font("Shrek", 0, 13)); // NOI18N

        LTELEFONE.setForeground(new java.awt.Color(51, 51, 51));
        LTELEFONE.setText("Telefone");
        LTELEFONE.setFont(new java.awt.Font("Shrek", 0, 13)); // NOI18N

        LN1.setForeground(new java.awt.Color(51, 51, 51));
        LN1.setText("blank");
        LN1.setFont(new java.awt.Font("Shrek", 0, 13)); // NOI18N

        LN2.setForeground(new java.awt.Color(51, 51, 51));
        LN2.setText("blank");
        LN2.setFont(new java.awt.Font("Shrek", 0, 13)); // NOI18N

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LN1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DATANASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LDATANASCIMENTO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(LISTAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                                .addComponent(LN2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CADASTRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Seletor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Seletor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDATANASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATANASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LISTAGEM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, Short.MAX_VALUE)
        );

        ABAS.addTab("Cadastrar", jPanel1);

        painelImagemFundo3.setBackground(new java.awt.Color(204, 0, 51));
        painelImagemFundo3.setImg(new ImageIcon("src/imagens/modificar.jpg"));

        BTNBUSCAR.setFont(new java.awt.Font("Shrek", 0, 18)); // NOI18N
        BTNBUSCAR.setForeground(new java.awt.Color(51, 51, 51));
        BTNBUSCAR.setText("Buscar Cadastro");
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARActionPerformed(evt);
            }
        });

        MODN1.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        MODN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODN1ActionPerformed(evt);
            }
        });

        MODN2.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        MODN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODN2ActionPerformed(evt);
            }
        });

        MODCPF.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        MODCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODCPF(evt);
            }
        });

        MODNome.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N
        MODNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODNomeActionPerformed(evt);
            }
        });

        MODDataNascimento.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N

        MODTelefone.setFont(new java.awt.Font("Shrek", 0, 12)); // NOI18N

        CANCEL.setFont(new java.awt.Font("Shrek", 0, 18)); // NOI18N
        CANCEL.setForeground(new java.awt.Color(51, 51, 51));
        CANCEL.setText("Cancelar");
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });

        ALTERAR.setFont(new java.awt.Font("Shrek", 0, 18)); // NOI18N
        ALTERAR.setForeground(new java.awt.Color(51, 51, 51));
        ALTERAR.setText("Alterar Dados");
        ALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERARActionPerformed(evt);
            }
        });

        LMODCPF.setBackground(new java.awt.Color(0, 0, 0));
        LMODCPF.setForeground(new java.awt.Color(51, 51, 51));
        LMODCPF.setText("CPF");
        LMODCPF.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        INFOPESSOAL.setBackground(new java.awt.Color(0, 0, 0));
        INFOPESSOAL.setForeground(new java.awt.Color(51, 51, 51));
        INFOPESSOAL.setText("Informacoes Pessoais");
        INFOPESSOAL.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        INFON.setBackground(new java.awt.Color(0, 0, 0));
        INFON.setForeground(new java.awt.Color(51, 51, 51));
        INFON.setText("blank");
        INFON.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        LMODNome.setBackground(new java.awt.Color(0, 0, 0));
        LMODNome.setForeground(new java.awt.Color(51, 51, 51));
        LMODNome.setText("Nome");
        LMODNome.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        LMODDataNascimento.setBackground(new java.awt.Color(0, 0, 0));
        LMODDataNascimento.setForeground(new java.awt.Color(51, 51, 51));
        LMODDataNascimento.setText("Data de Nascimento");
        LMODDataNascimento.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        LMODTelefone.setBackground(new java.awt.Color(0, 0, 0));
        LMODTelefone.setForeground(new java.awt.Color(51, 51, 51));
        LMODTelefone.setText("Telefone");
        LMODTelefone.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        LMODN1.setBackground(new java.awt.Color(0, 0, 0));
        LMODN1.setForeground(new java.awt.Color(51, 51, 51));
        LMODN1.setText("blank");
        LMODN1.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        LMODN2.setBackground(new java.awt.Color(0, 0, 0));
        LMODN2.setForeground(new java.awt.Color(51, 51, 51));
        LMODN2.setText("blank");
        LMODN2.setFont(new java.awt.Font("Shrek", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelImagemFundo3Layout = new javax.swing.GroupLayout(painelImagemFundo3);
        painelImagemFundo3.setLayout(painelImagemFundo3Layout);
        painelImagemFundo3Layout.setHorizontalGroup(
            painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo3Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelImagemFundo3Layout.createSequentialGroup()
                                .addComponent(MODCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelImagemFundo3Layout.createSequentialGroup()
                                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LMODNome, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LMODCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelImagemFundo3Layout.createSequentialGroup()
                                .addComponent(INFOPESSOAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(INFON, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelImagemFundo3Layout.createSequentialGroup()
                                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MODNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LMODDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MODDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LMODN1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LMODN2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MODN1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(MODN2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(painelImagemFundo3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ALTERAR)))
                        .addGap(21, 21, 21))
                    .addGroup(painelImagemFundo3Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LMODTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MODTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelImagemFundo3Layout.setVerticalGroup(
            painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LMODCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MODCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBUSCAR))
                .addGap(18, 18, 18)
                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INFOPESSOAL, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INFON, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LMODN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LMODNome, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemFundo3Layout.createSequentialGroup()
                        .addComponent(MODN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LMODN2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(MODN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelImagemFundo3Layout.createSequentialGroup()
                        .addComponent(MODNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(LMODDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MODDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(LMODTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(MODTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(painelImagemFundo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANCEL)
                    .addComponent(ALTERAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ABAS.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout painelImagemFundo2Layout = new javax.swing.GroupLayout(painelImagemFundo2);
        painelImagemFundo2.setLayout(painelImagemFundo2Layout);
        painelImagemFundo2Layout.setHorizontalGroup(
            painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(ABAS, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        painelImagemFundo2Layout.setVerticalGroup(
            painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(ABAS, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelImagemFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Deletar um Cadastro
    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
 
        int tipo;
        
        //realiza a conexao
        ConexoesMySql conec = new ConexoesMySql();
        tipo = conec.deletarDadosnoMySql(CPF.getText());
        
        //verifica se um aluno ou professor foi deletado e deleta na tabela
        if(tipo == 1)
            if(TabelaAlunos!=null) TabelaAlunos.deleteFromTable(CPF.getText());
        
        else if(tipo == 2) {
            if(TabelaProfessores != null) TabelaProfessores.deleteFromTable(CPF.getText());
        }
        this.CANCELActionPerformed(evt);
        
    }//GEN-LAST:event_DELETEActionPerformed

    //Deixa as listagens visíveis
    private void LISTAGEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTAGEMActionPerformed
        //verifica qual lista deve aparecer, aluno ou professor
        if(Seletor.getSelectedIndex() == 1) TabelaAlunos.setVisible(true);
        if(Seletor.getSelectedIndex() == 2) TabelaProfessores.setVisible(true);
        
    }//GEN-LAST:event_LISTAGEMActionPerformed

    //Efetua um Cadastro
    private void CADASTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTROActionPerformed
        int s;
        
        //realiza o cadastro de um aluno 
        if (Seletor.getSelectedIndex()==1){
            aluno ObjetoAluno = new aluno();
            try{
                ObjetoAluno.setDados(NOME.getText(), DATANASCIMENTO.getText(), Long.parseLong(CPF.getText()), TELEFONE.getText(), Long.parseLong(N1.getText()), Integer.parseInt(N2.getText()));
                ConexoesMySql conec = new ConexoesMySql();
                s = conec.insereDadosNoMySql(ObjetoAluno);
                if(TabelaAlunos!=null && s==1) TabelaAlunos.addToTable(ObjetoAluno);
                limpaDados();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos são invalidos."),"Dados não suportados",JOptionPane.WARNING_MESSAGE);
                return;
            }

        }
        //realiza o cadastro de um professor
        if (Seletor.getSelectedIndex() == 2){
            try{
                Professor ObjetoProfessor = new Professor();
                ObjetoProfessor.setDados(NOME.getText(), DATANASCIMENTO.getText(), Long.parseLong(CPF.getText()), TELEFONE.getText(),N1.getText(), Double.parseDouble(N2.getText()));
                ConexoesMySql conec = new ConexoesMySql();
                s = conec.insereDadosNoMySql(ObjetoProfessor);
                if(TabelaProfessores != null && s == 1) TabelaProfessores.addToTable(ObjetoProfessor);
                limpaDados();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos são invalidos."),"Dados não suportados",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_CADASTROActionPerformed

    private void TELEFONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELEFONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TELEFONEActionPerformed

    private void CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N2ActionPerformed

    private void NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMEActionPerformed

    //Desativa/Ativa botoes e campos, e define os campos neutros.
    private void SeletorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeletorActionPerformed
        // TODO add your handling code here:

        if (Seletor.getSelectedIndex() == 0){
            CADASTRO.setEnabled(false);
            LISTAGEM.setEnabled(false);
            DELETE.setEnabled(false);
            LN1.setVisible(false);
            LN2.setVisible(false);
            N1.setVisible(false);
            N2.setVisible(false);
        }
        if (Seletor.getSelectedIndex()==1){
            NOME.setVisible(true);
            LNOME.setVisible(true);
            DATANASCIMENTO.setVisible(true);
            LDATANASCIMENTO.setVisible(true);
            TELEFONE.setVisible(true);
            LTELEFONE.setVisible(true);
            CADASTRO.setEnabled(true);
            LISTAGEM.setEnabled(true);
            DELETE.setEnabled(false);
            LN1.setVisible(true);
            LN2.setVisible(true);
            LN1.setText("Matricula");
            LN2.setText("Periodo");
            N1.setVisible(true);
            N2.setVisible(true);

        }
        else if (Seletor.getSelectedIndex()==2){
            NOME.setVisible(true);
            LNOME.setVisible(true);
            DATANASCIMENTO.setVisible(true);
            LDATANASCIMENTO.setVisible(true);
            TELEFONE.setVisible(true);
            LTELEFONE.setVisible(true);
            CADASTRO.setEnabled(true);
            LISTAGEM.setEnabled(true);
            DELETE.setEnabled(false);

            LN1.setVisible(true);
            LN2.setVisible(true);
            LN1.setText("Data de Admissao");
            LN2.setText("Salario Bruto");
            N1.setVisible(true);
            N2.setVisible(true);
        }

        else if(Seletor.getSelectedIndex() == 3){
            NOME.setVisible(false);
            LNOME.setVisible(false);
            DATANASCIMENTO.setVisible(false);
            LDATANASCIMENTO.setVisible(false);
            TELEFONE.setVisible(false);
            LTELEFONE.setVisible(false);
            CADASTRO.setEnabled(false);
            LISTAGEM.setEnabled(false);
            DELETE.setEnabled(true);
            LN1.setVisible(false);
            N1.setVisible(false);
            LN2.setVisible(false);
            N2.setVisible(false);
        }
    }//GEN-LAST:event_SeletorActionPerformed

    //Cancela a modificação de dados
    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        BTNBUSCAR.setEnabled(true);
        //MODCPF.setText("");
        MODCPF.setEnabled(true);
        setMODFalse();
    }//GEN-LAST:event_CANCELActionPerformed
    
    private void MODNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODNomeActionPerformed

    //Efetua uma alteração de dados
    private void ALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERARActionPerformed
        ConexoesMySql conexao = new ConexoesMySql();

        int dadosPessoais,dados;
        if(tag == "aluno"){
            aluno objAluno = new aluno();
            try{
                int periodo = -1;
                if(!MODN2.getText().equals("")) periodo = Integer.parseInt(MODN2.getText());

                long matricula = -1;
                if(!MODN1.getText().equals("")) matricula = Long.parseLong(MODN1.getText());

                objAluno.setDados(MODNome.getText(),MODDataNascimento.getText(),
                                  Long.parseLong(MODCPF.getText()),MODTelefone.getText(),
                                 matricula,periodo);
                dadosPessoais = conexao.atualizaDadosNoMySQLPessoa(MODCPF.getText(), MODNome.getText(), MODDataNascimento.getText(), MODTelefone.getText());
                dados = conexao.atualizaDadosNoMySQLAluno(MODCPF.getText(), MODN1.getText(), MODN2.getText());
                if(dadosPessoais == 2 || dados == 2) {JOptionPane.showMessageDialog(null,mensagensDeAviso("Dados Atualizados com Sucesso."),"SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                    TabelaAlunos.modifyTable(MODCPF.getText(), MODNome.getText(), MODDataNascimento.getText(),
                                         MODTelefone.getText(), MODN1.getText(), MODN2.getText());
                }
                }catch(Exception e){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos sao invalidos"),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(tag == "professor"){
            Professor objProfessor = new Professor();
            try{
                double salBruto = -1;
                if(!MODN2.getText().equals("")) salBruto = Double.parseDouble(MODN2.getText());
                objProfessor.setDados(MODNome.getText(),MODDataNascimento.getText(),
                                      Long.parseLong(MODCPF.getText()),MODTelefone.getText(),
                                      MODN1.getText(),salBruto);
                dadosPessoais = conexao.atualizaDadosNoMySQLPessoa(MODCPF.getText(), MODNome.getText(), MODDataNascimento.getText(), MODTelefone.getText());
                dados = conexao.atualizaDadosNoMySQLProfessor(MODCPF.getText(), MODN1.getText(), MODN2.getText());
                if(dadosPessoais == 2 || dados == 2) {
                    TabelaProfessores.modifyTable(objProfessor);
                    JOptionPane.showMessageDialog(null,mensagensDeAviso("Dados Atualizados com Sucesso."),"SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Um ou mais dados fornecidos sao invalidos"),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
            }
        }
        this.CANCELActionPerformed(evt);
    }//GEN-LAST:event_ALTERARActionPerformed
    
    //limpa os campos de cadastro
    public void limpaDados(){
        NOME.setText("");
        DATANASCIMENTO.setText("");
        TELEFONE.setText("");
        CPF.setText("");
        N1.setText("");
        N2.setText("");
    }
    
    private void MODN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODN2ActionPerformed

    private void MODN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODN1ActionPerformed

    //Busca um CPF para efetuar a alteracao dos dados
    private void BTNBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARActionPerformed
        ConexoesMySql conec = new ConexoesMySql();
        try{
            Long.parseLong(MODCPF.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,mensagensDeAviso("Entrada invalida."),"AVISO",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ((MODCPF.getText()).equals("")) return;
        
        Object obj = conec.buscaCadastro(MODCPF.getText());
        try{
            int tipo = (int)obj;
            if(tipo == 0)JOptionPane.showMessageDialog(null,mensagensDeAviso("Este CPF nao esta cadastrado."),"CPF Invalido",JOptionPane.ERROR_MESSAGE);
            return;
        }
        catch(Exception e){
            ALTERAR.setEnabled(true);
            CANCEL.setEnabled(true);
            INFOPESSOAL.setVisible(true);
            MODNome.setVisible(true);
            LMODNome.setVisible(true);
            MODDataNascimento.setVisible(true);
            LMODDataNascimento.setVisible(true);
            MODTelefone.setVisible(true);
            LMODTelefone.setVisible(true);
        }
        try{
            aluno Aluno = (aluno)obj;
            System.out.println(Aluno.nome);
            MODNome.setText(Aluno.nome);
            MODDataNascimento.setText(Aluno.dataNascimento);
            MODTelefone.setText(Aluno.telefone);
            MODN1.setText(Long.toString(Aluno.getMatricula()));
            MODN2.setText(Integer.toString(Aluno.getPeriodo()));
            INFON.setText("Informacoes Academicas");
            INFON.setVisible(true);
            BTNBUSCAR.setEnabled(false);
            MODCPF.setEnabled(false);
            tag = "aluno";
            LMODN2.setVisible(true);
            LMODN2.setText("Periodo");
            LMODN1.setText("Matricula");
            MODN2.setVisible(true);
            MODN1.setVisible(true);
            LMODN1.setVisible(true);
        }
        catch(Exception e){
            Professor Prof = (Professor)obj;
            MODNome.setText(Prof.nome);
            MODDataNascimento.setText(Prof.dataNascimento);
            MODTelefone.setText(Prof.telefone);
            MODN1.setText(Prof.getDataAdm());
            MODN2.setText(Double.toString(Prof.getSalarioBruto()));
            INFON.setText("Informacoes Profissionais");
            INFON.setVisible(true);
            BTNBUSCAR.setEnabled(false);
            MODCPF.setEnabled(false);
            tag = "professor";
            LMODN2.setText("Salario Bruto");
            LMODN1.setText("Data de Admissao");
            MODN2.setVisible(true);
            MODN1.setVisible(true);
            LMODN1.setVisible(true);
            LMODN2.setVisible(true);
        }
    }//GEN-LAST:event_BTNBUSCARActionPerformed
    
    public JLabel mensagensDeAviso(String mensagem){
        JLabel label = new JLabel(mensagem);
        label.setFont(new Font("Shrek", 1, 13));
        return label;
    }
    
    private void MODCPF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODCPF
        // TODO add your handling code here:
    }//GEN-LAST:event_MODCPF

    //Altera o estado de botoes,campos de texto e labels que modificam os dados
    public void setMODFalse(){
        INFOPESSOAL.setVisible(false);
        INFON.setVisible(false);
        MODNome.setVisible(false);
        LMODNome.setVisible(false);
        MODDataNascimento.setVisible(false);
        LMODDataNascimento.setVisible(false);
        MODTelefone.setVisible(false);
        LMODTelefone.setVisible(false);
        LMODN2.setVisible(false);
        MODN2.setVisible(false);
        MODN1.setVisible(false);
        LMODN1.setVisible(false);
        INFON.setVisible(false);
        CANCEL.setEnabled(false);
        MODN1.setText("");
        MODN2.setText("");
        MODNome.setText("");
        MODDataNascimento.setText("");
        MODTelefone.setText("");
        ALTERAR.setEnabled(false);
        
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ABAS;
    private javax.swing.JButton ALTERAR;
    private javax.swing.JButton BTNBUSCAR;
    private javax.swing.JButton CADASTRO;
    private javax.swing.JButton CANCEL;
    private javax.swing.JTextField CPF;
    private javax.swing.JTextField DATANASCIMENTO;
    private javax.swing.JButton DELETE;
    private ementorPlus.OutlineLabel INFON;
    private ementorPlus.OutlineLabel INFOPESSOAL;
    private ementorPlus.OutlineLabel LCPF;
    private ementorPlus.OutlineLabel LDATANASCIMENTO;
    private javax.swing.JButton LISTAGEM;
    private ementorPlus.OutlineLabel LMODCPF;
    private ementorPlus.OutlineLabel LMODDataNascimento;
    private ementorPlus.OutlineLabel LMODN1;
    private ementorPlus.OutlineLabel LMODN2;
    private ementorPlus.OutlineLabel LMODNome;
    private ementorPlus.OutlineLabel LMODTelefone;
    private ementorPlus.OutlineLabel LN1;
    private ementorPlus.OutlineLabel LN2;
    private ementorPlus.OutlineLabel LNOME;
    private ementorPlus.OutlineLabel LTELEFONE;
    private javax.swing.JTextField MODCPF;
    private javax.swing.JTextField MODDataNascimento;
    private javax.swing.JTextField MODN1;
    private javax.swing.JTextField MODN2;
    private javax.swing.JTextField MODNome;
    private javax.swing.JTextField MODTelefone;
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JTextField NOME;
    private javax.swing.JComboBox<String> Seletor;
    private javax.swing.JTextField TELEFONE;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private ementorPlus.PainelImagemFundo painelImagemFundo1;
    private ementorPlus.PainelImagemFundo painelImagemFundo2;
    private ementorPlus.PainelImagemFundo painelImagemFundo3;
    // End of variables declaration//GEN-END:variables
}
