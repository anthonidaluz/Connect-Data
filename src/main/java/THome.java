
import DAO.Funcionario_DAO;
import java.awt.Color;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public final class THome extends javax.swing.JFrame {
    
    private static ResourceBundle traducoes;

    // Criando objeto funcionario para sinzonizar com banco
    private Funcionario_DAO funcionario_DAO = new Funcionario_DAO();

    public THome(ResourceBundle traducoes) {
        initComponents();
        THome.traducoes = traducoes;
        traduzir();

        // Atualiza o texto do JLabel e a JprogressBar com o total de funcionários consultando o banco de dados de forma dinâmica
        String totalF = funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario", "total");
        int totalf = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario", "total"));
        this.jLabel_TotalFuncionarios.setText(totalF);
        this.jProgressBar_funcionarios.setValue(totalf);
        
        // Atualiza o texto do JLabel e a JprogressBar com a soma das metas cumpridas pelos funcionários consultando o banco de dados de forma dinâmica
        String totalM = funcionario_DAO.Consulta("SELECT SUM(MetaCumprida) AS total_metacumprida FROM funcionario", "total_metacumprida");
        int totalm = Integer.parseInt(totalM);
        this.jLabel_metas.setText(totalM);
        this.jProgressBar_metas.setValue(totalm*2);
    }

    public void traduzir() {
        this.labelOla.setText(THome.traducoes.getString("thome_titulo1"));
        this.labelBemvindo.setText(THome.traducoes.getString("thome_titulo2"));
        this.labelFunci.setText(THome.traducoes.getString("thome_botao1"));
        this.labelDepart.setText(THome.traducoes.getString("thome_botao2"));
        this.labelSuporte.setText(THome.traducoes.getString("thome_botao3"));
        this.labelFechar.setText(THome.traducoes.getString("thome_botao4"));
        this.labelTotalfunci.setText(THome.traducoes.getString("thome_card1"));
        this.labelNovosfunci.setText(THome.traducoes.getString("thome_card2"));
        this.labelMetas.setText(THome.traducoes.getString("thome_card3"));
        this.labelAdmin.setText(THome.traducoes.getString("thome_card4"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        J1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        J2 = new javax.swing.JPanel();
        labelFunci = new javax.swing.JLabel();
        J3 = new javax.swing.JPanel();
        labelDepart = new javax.swing.JLabel();
        J4 = new javax.swing.JPanel();
        labelSuporte = new javax.swing.JLabel();
        J5 = new javax.swing.JPanel();
        labelFechar = new javax.swing.JLabel();
        labelBemvindo = new javax.swing.JLabel();
        labelOla = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        J9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        labelAdmin = new javax.swing.JLabel();
        J8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_metas = new javax.swing.JLabel();
        jProgressBar_metas = new javax.swing.JProgressBar();
        labelMetas = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        J7 = new javax.swing.JPanel();
        labelNovosfunci = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel18 = new javax.swing.JLabel();
        J6 = new javax.swing.JPanel();
        labelTotalfunci = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar_funcionarios = new javax.swing.JProgressBar();
        jLabel_TotalFuncionarios = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect Data - Home");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario_icon.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 160, 150);

        J1.setBackground(new java.awt.Color(49, 10, 76));
        J1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J1MouseExited(evt);
            }
        });
        J1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dash.png"))); // NOI18N
        jLabel12.setText("Login");
        J1.add(jLabel12);
        jLabel12.setBounds(70, 0, 120, 60);

        jPanel1.add(J1);
        J1.setBounds(10, 270, 260, 60);

        J2.setBackground(new java.awt.Color(49, 10, 76));
        J2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J2MouseExited(evt);
            }
        });
        J2.setLayout(null);

        labelFunci.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelFunci.setForeground(new java.awt.Color(255, 255, 255));
        labelFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastro.png"))); // NOI18N
        labelFunci.setText("Funcionários");
        J2.add(labelFunci);
        labelFunci.setBounds(40, 0, 180, 60);

        jPanel1.add(J2);
        J2.setBounds(10, 350, 260, 60);

        J3.setBackground(new java.awt.Color(49, 10, 76));
        J3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J3MouseExited(evt);
            }
        });
        J3.setLayout(null);

        labelDepart.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelDepart.setForeground(new java.awt.Color(255, 255, 255));
        labelDepart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/depart.png"))); // NOI18N
        labelDepart.setText("Departamentos");
        J3.add(labelDepart);
        labelDepart.setBounds(30, 0, 200, 60);

        jPanel1.add(J3);
        J3.setBounds(10, 430, 260, 60);

        J4.setBackground(new java.awt.Color(49, 10, 76));
        J4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J4MouseExited(evt);
            }
        });
        J4.setLayout(null);

        labelSuporte.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelSuporte.setForeground(new java.awt.Color(255, 255, 255));
        labelSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/admindash.png"))); // NOI18N
        labelSuporte.setText("Suporte");
        J4.add(labelSuporte);
        labelSuporte.setBounds(50, 0, 150, 60);

        jPanel1.add(J4);
        J4.setBounds(10, 510, 260, 60);

        J5.setBackground(new java.awt.Color(49, 10, 76));
        J5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J5MouseExited(evt);
            }
        });
        J5.setLayout(null);

        labelFechar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelFechar.setForeground(new java.awt.Color(255, 255, 255));
        labelFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        labelFechar.setText("Fechar");
        J5.add(labelFechar);
        labelFechar.setBounds(60, 0, 120, 60);

        jPanel1.add(J5);
        J5.setBounds(10, 590, 260, 60);

        labelBemvindo.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        labelBemvindo.setForeground(new java.awt.Color(0, 0, 0));
        labelBemvindo.setText("Seja Bem-Vindo!");
        jPanel1.add(labelBemvindo);
        labelBemvindo.setBounds(60, 200, 180, 30);

        labelOla.setFont(new java.awt.Font("Alef", 1, 30)); // NOI18N
        labelOla.setForeground(new java.awt.Color(0, 0, 0));
        labelOla.setText("Olá");
        jPanel1.add(labelOla);
        labelOla.setBounds(110, 160, 90, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 280, 680);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(49, 10, 76));
        jPanel3.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Alef", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("+ Notificações");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(90, 40, 160, 30);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("<html> Para os colaboradores do Departamento de Tecnologia da Informação (TI), informamos que haverá um ajuste salarial de 12% a partir do próximo mês. Certifiquem-se de verificar seus contracheques para ver os novos valores. <html>");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(120, 170, 530, 50);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("<html> No próximo sábado (25/05), nosso sistema passará por manutenção. O acesso ao sistema estará indisponível das 8h às 12h. Pedimos desculpas por qualquer inconveniente. <html>");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(120, 120, 530, 40);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("<html> Atenção! Na próxima semana, teremos um treinamento obrigatório sobre segurança cibernética. Todos os funcionários devem participar. Detalhes serão enviados por e-mail. <html>");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(120, 80, 530, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(40, 400, 770, 260);

        J9.setBackground(new java.awt.Color(49, 10, 76));
        J9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        J9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J9.setLayout(null);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/admin.png"))); // NOI18N
        J9.add(jLabel11);
        jLabel11.setBounds(240, 40, 130, 120);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("1/5");
        J9.add(jLabel20);
        jLabel20.setBounds(20, 100, 60, 40);

        jProgressBar4.setBackground(new java.awt.Color(49, 10, 76));
        jProgressBar4.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar4.setValue(20);
        jProgressBar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        J9.add(jProgressBar4);
        jProgressBar4.setBounds(10, 140, 160, 10);

        labelAdmin.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        labelAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelAdmin.setText("Admin Online");
        J9.add(labelAdmin);
        labelAdmin.setBounds(20, 10, 160, 30);

        jPanel2.add(J9);
        J9.setBounds(440, 220, 370, 160);

        J8.setBackground(new java.awt.Color(49, 10, 76));
        J8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        J8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J8.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/metas.png"))); // NOI18N
        J8.add(jLabel9);
        jLabel9.setBounds(250, 50, 120, 110);

        jLabel_metas.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel_metas.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_metas.setText("xx");
        J8.add(jLabel_metas);
        jLabel_metas.setBounds(20, 100, 50, 40);

        jProgressBar_metas.setBackground(new java.awt.Color(49, 10, 76));
        jProgressBar_metas.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar_metas.setValue(40);
        jProgressBar_metas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        J8.add(jProgressBar_metas);
        jProgressBar_metas.setBounds(10, 140, 160, 10);

        labelMetas.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        labelMetas.setForeground(new java.awt.Color(255, 255, 255));
        labelMetas.setText("Metas");
        J8.add(labelMetas);
        labelMetas.setBounds(20, 10, 70, 30);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("/50");
        J8.add(jLabel25);
        jLabel25.setBounds(60, 100, 50, 40);

        jPanel2.add(J8);
        J8.setBounds(40, 220, 370, 160);

        J7.setBackground(new java.awt.Color(49, 10, 76));
        J7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        J7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J7.setLayout(null);

        labelNovosfunci.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        labelNovosfunci.setForeground(new java.awt.Color(255, 255, 255));
        labelNovosfunci.setText("Total departamentos");
        J7.add(labelNovosfunci);
        labelNovosfunci.setBounds(20, 10, 210, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funovos.png"))); // NOI18N
        J7.add(jLabel7);
        jLabel7.setBounds(250, 30, 120, 130);

        jProgressBar2.setBackground(new java.awt.Color(49, 10, 76));
        jProgressBar2.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setValue(100);
        jProgressBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        J7.add(jProgressBar2);
        jProgressBar2.setBounds(10, 140, 160, 10);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("05");
        J7.add(jLabel18);
        jLabel18.setBounds(30, 100, 50, 37);

        jPanel2.add(J7);
        J7.setBounds(440, 30, 370, 160);

        J6.setBackground(new java.awt.Color(49, 10, 76));
        J6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        J6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J6.setLayout(null);

        labelTotalfunci.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        labelTotalfunci.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalfunci.setText("Total Funcionários");
        J6.add(labelTotalfunci);
        labelTotalfunci.setBounds(20, 20, 200, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fun.png"))); // NOI18N
        J6.add(jLabel8);
        jLabel8.setBounds(240, 30, 130, 130);

        jProgressBar_funcionarios.setBackground(new java.awt.Color(49, 10, 76));
        jProgressBar_funcionarios.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar_funcionarios.setValue(85);
        jProgressBar_funcionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        J6.add(jProgressBar_funcionarios);
        jProgressBar_funcionarios.setBounds(10, 140, 160, 10);

        jLabel_TotalFuncionarios.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel_TotalFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TotalFuncionarios.setText("x");
        J6.add(jLabel_TotalFuncionarios);
        jLabel_TotalFuncionarios.setBounds(30, 100, 50, 37);

        jPanel2.add(J6);
        J6.setBounds(40, 30, 370, 160);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(320, 20, 860, 680);

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/THome.png"))); // NOI18N
        Wallpaper.setText("jLabel1");
        getContentPane().add(Wallpaper);
        Wallpaper.setBounds(0, 0, 1242, 720);

        setSize(new java.awt.Dimension(1200, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Método para ajustar a cor do botão a passar o cursor 
    public void setColor(JPanel p) {
        p.setBackground(new Color(90, 74, 143));
    }

    public void resetColor(JPanel p) {
        p.setBackground(new Color(49, 10, 76));
    }


    private void J5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_J5MouseClicked

    private void J5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseEntered
        setColor(J5);

    }//GEN-LAST:event_J5MouseEntered

    private void J5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseExited
        resetColor(J5);

    }//GEN-LAST:event_J5MouseExited

    private void J1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J1MouseEntered
        setColor(J1);

    }//GEN-LAST:event_J1MouseEntered

    private void J1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J1MouseExited
        resetColor(J1);
    }//GEN-LAST:event_J1MouseExited

    private void J2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseEntered
        setColor(J2);

    }//GEN-LAST:event_J2MouseEntered

    private void J2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseExited
        resetColor(J2);
    }//GEN-LAST:event_J2MouseExited

    private void J3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseEntered
        setColor(J3);

    }//GEN-LAST:event_J3MouseEntered

    private void J3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseExited
        resetColor(J3);

    }//GEN-LAST:event_J3MouseExited

    private void J4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseEntered
        setColor(J4);

    }//GEN-LAST:event_J4MouseEntered

    private void J4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseExited
        resetColor(J4);
    }//GEN-LAST:event_J4MouseExited

    private void J1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J1MouseClicked
        //Lógica para voltar à tela de login
        dispose();
        new TLogin(traducoes).setVisible(true);
    }//GEN-LAST:event_J1MouseClicked

    private void J2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseClicked
        //Indo para a tela de pesquisa de funcionários
        dispose();
        new TPesquisa_Funcionario(traducoes).setVisible(true);
    }//GEN-LAST:event_J2MouseClicked

    private void J3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseClicked
        //Indo para a tela de departamentos
        dispose();
        new TDepartamento(traducoes).setVisible(true);

    }//GEN-LAST:event_J3MouseClicked
    //Entrar em contato com o suporte técnico
    private void J4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseClicked
        String input = JOptionPane.showInputDialog(traducoes.getString("thome_suporte1"));
        if (input != null) {
            JOptionPane.showMessageDialog(null,
                    traducoes.getString("thome_suporte2"),
                    traducoes.getString("thome_suporte3"),
                    JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_J4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel J1;
    private javax.swing.JPanel J2;
    private javax.swing.JPanel J3;
    private javax.swing.JPanel J4;
    private javax.swing.JPanel J5;
    private javax.swing.JPanel J6;
    private javax.swing.JPanel J7;
    private javax.swing.JPanel J8;
    private javax.swing.JPanel J9;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_TotalFuncionarios;
    private javax.swing.JLabel jLabel_metas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar_funcionarios;
    private javax.swing.JProgressBar jProgressBar_metas;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelBemvindo;
    private javax.swing.JLabel labelDepart;
    private javax.swing.JLabel labelFechar;
    private javax.swing.JLabel labelFunci;
    private javax.swing.JLabel labelMetas;
    private javax.swing.JLabel labelNovosfunci;
    private javax.swing.JLabel labelOla;
    private javax.swing.JLabel labelSuporte;
    private javax.swing.JLabel labelTotalfunci;
    // End of variables declaration//GEN-END:variables
}
