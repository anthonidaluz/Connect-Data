
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TDepartamento extends javax.swing.JFrame {

    public TDepartamento() {
        initComponents();

        Object[] dadosProducao = {"001", "Produção", "10", "É responsável por coordenar e gerenciar todos os processos relacionados à fabricação de produtos ou prestação de serviços."};
        Object[] dadosRH = {"002", "RH", "10", "A base do setor responsável são as funções de recrutamento, seleção, treinamento, remuneração e benefícios aos trabalhadores"};
        Object[] dadosMarketing = {"003", "Marketing", "10", "É uma parte da empresa que reúne os profissionais empenhados em criar campanhas e divulgar o nome da marca para a sociedade."};
        Object[] dadosFinancas = {"004", "Finanças", "10", "Responsável pelo desempenho e gestão das finanças de uma empresa."};
        Object[] dadosVendas = {"005", "Vendas", "10", "O departamento de vendas está ligado diretamente ao faturamento da empresa, é ele que faz as vendas dos produtos/serviços ofertados pela empresa."};

        DefaultTableModel inseridos = (DefaultTableModel) tDepartamentos.getModel();
        inseridos.addRow(dadosProducao);
        inseridos.addRow(dadosRH);
        inseridos.addRow(dadosMarketing);
        inseridos.addRow(dadosFinancas);
        inseridos.addRow(dadosVendas);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tDepartamentos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        StrMeta = new javax.swing.JTextField();
        StrID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        StrDesc = new javax.swing.JTextArea();
        StrDepart = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        WallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        tDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Departamento", "Departamento", "Meta", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tDepartamentos);
        if (tDepartamentos.getColumnModel().getColumnCount() > 0) {
            tDepartamentos.getColumnModel().getColumn(0).setResizable(false);
            tDepartamentos.getColumnModel().getColumn(1).setResizable(false);
            tDepartamentos.getColumnModel().getColumn(2).setResizable(false);
            tDepartamentos.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 10, 880, 690);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 260, 300, 10);

        StrMeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrMetaKeyTyped(evt);
            }
        });
        getContentPane().add(StrMeta);
        StrMeta.setBounds(20, 390, 260, 20);

        StrID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrIDKeyTyped(evt);
            }
        });
        getContentPane().add(StrID);
        StrID.setBounds(20, 290, 260, 20);

        StrDesc.setColumns(20);
        StrDesc.setRows(5);
        jScrollPane2.setViewportView(StrDesc);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 440, 260, 210);
        getContentPane().add(StrDepart);
        StrDepart.setBounds(20, 340, 260, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Departamento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 270, 120, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descrição:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 420, 70, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Meta:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 370, 70, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Departamento:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 320, 110, 20);

        jLabel6.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Connect Data 1.0");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 228, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 250, 180);

        back.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("<<");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 20, 40, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Cadastrar Departamento");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 660, 260, 40);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TCadastro.png"))); // NOI18N
        getContentPane().add(WallPaper);
        WallPaper.setBounds(0, 0, 1200, 720);

        setSize(new java.awt.Dimension(1200, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        new THome().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ("".equals(StrDepart.getText()) || "".equals(StrID.getText()) || "".equals(StrMeta.getText()) || "".equals(StrDesc.getText())) {
            JOptionPane.showMessageDialog(null, "Informe todos os Dados para Cadastrar um Departamento", "Connect Data - Error", 2);
            StrID.setText("");
            StrDepart.setText("");
            StrMeta.setText("");
            StrDesc.setText("");

        } else {
            Object[] dados2 = {StrID.getText(), StrDepart.getText(), StrMeta.getText(), StrDesc.getText()};
            DefaultTableModel departamento = (DefaultTableModel) tDepartamentos.getModel();
            departamento.addRow(dados2);
            StrID.setText("");
            StrDepart.setText("");
            StrMeta.setText("");
            StrDesc.setText("");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void StrIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrIDKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_StrIDKeyTyped

    private void StrMetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrMetaKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_StrMetaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrDepart;
    private javax.swing.JTextArea StrDesc;
    private javax.swing.JTextField StrID;
    private javax.swing.JTextField StrMeta;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tDepartamentos;
    // End of variables declaration//GEN-END:variables
}
