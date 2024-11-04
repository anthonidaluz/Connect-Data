
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class THome extends javax.swing.JFrame {

    public THome() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        J1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        J2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        J3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        J4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        J5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        J9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        J8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        J7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel18 = new javax.swing.JLabel();
        J6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel17 = new javax.swing.JLabel();
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
        jLabel12.setText("Home");
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

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastro.png"))); // NOI18N
        jLabel14.setText("Funcionários");
        J2.add(jLabel14);
        jLabel14.setBounds(40, 0, 180, 60);

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

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/depart.png"))); // NOI18N
        jLabel15.setText("Departamentos");
        J3.add(jLabel15);
        jLabel15.setBounds(30, 0, 200, 60);

        jPanel1.add(J3);
        J3.setBounds(10, 430, 260, 60);

        J4.setBackground(new java.awt.Color(49, 10, 76));
        J4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J4MouseExited(evt);
            }
        });
        J4.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rel.png"))); // NOI18N
        jLabel16.setText("Relatórios");
        J4.add(jLabel16);
        jLabel16.setBounds(50, 0, 160, 60);

        jPanel1.add(J4);
        J4.setBounds(10, 510, 260, 60);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Alef", 1, 16)); // NOI18N
        jLabel2.setText("Bem-Vindo!");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 180, 100, 20);

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

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jLabel10.setText("Sair");
        J5.add(jLabel10);
        jLabel10.setBounds(80, 0, 90, 60);

        jPanel1.add(J5);
        J5.setBounds(10, 590, 260, 60);

        labelNome.setFont(new java.awt.Font("Alef", 1, 16)); // NOI18N
        labelNome.setText("Olá < nome >");
        jPanel1.add(labelNome);
        labelNome.setBounds(90, 210, 110, 20);

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
        jLabel21.setBounds(30, 10, 160, 30);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("<html> Atenção! Na próxima semana, teremos um treinamento obrigatório sobre segurança cibernética. Todos os funcionários devem participar. Detalhes serão enviados por e-mail. <html>");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(60, 50, 530, 30);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("<html> No próximo sábado (27/04), nosso sistema passará por manutenção. O acesso ao sistema estará indisponível das 8h às 12h. Pedimos desculpas por qualquer inconveniente. <html>");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(60, 90, 530, 40);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("<html> Para os colaboradores do Departamento de Tecnologia da Informação (TI), informamos que haverá um ajuste salarial de 12% a partir do próximo mês. Certifiquem-se de verificar seus contracheques para ver os novos valores. <html>");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(60, 140, 530, 50);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(70, 400, 710, 210);

        J9.setBackground(new java.awt.Color(49, 10, 76));
        J9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        J9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J9.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Admin");
        J9.add(jLabel6);
        jLabel6.setBounds(30, 10, 170, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/admin.png"))); // NOI18N
        J9.add(jLabel11);
        jLabel11.setBounds(210, 10, 130, 150);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("07");
        J9.add(jLabel20);
        jLabel20.setBounds(30, 90, 50, 37);

        jProgressBar4.setBackground(new java.awt.Color(49, 10, 76));
        jProgressBar4.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar4.setValue(100);
        jProgressBar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        J9.add(jProgressBar4);
        jProgressBar4.setBounds(10, 130, 160, 10);

        jPanel2.add(J9);
        J9.setBounds(440, 220, 340, 150);

        J8.setBackground(new java.awt.Color(49, 10, 76));
        J8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        J8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J8.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Metas");
        J8.add(jLabel5);
        jLabel5.setBounds(30, 10, 170, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/metas.png"))); // NOI18N
        J8.add(jLabel9);
        jLabel9.setBounds(220, 30, 120, 120);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("32/50");
        J8.add(jLabel19);
        jLabel19.setBounds(30, 90, 90, 40);

        jProgressBar3.setBackground(new java.awt.Color(49, 10, 76));
        jProgressBar3.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar3.setValue(70);
        jProgressBar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        J8.add(jProgressBar3);
        jProgressBar3.setBounds(10, 130, 160, 10);

        jPanel2.add(J8);
        J8.setBounds(70, 220, 340, 150);

        J7.setBackground(new java.awt.Color(49, 10, 76));
        J7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        J7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J7.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Novos Funcionários");
        J7.add(jLabel4);
        jLabel4.setBounds(30, 10, 220, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funovos.png"))); // NOI18N
        J7.add(jLabel7);
        jLabel7.setBounds(220, 20, 120, 140);

        jProgressBar2.setBackground(new java.awt.Color(49, 10, 76));
        jProgressBar2.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setValue(40);
        jProgressBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        J7.add(jProgressBar2);
        jProgressBar2.setBounds(10, 130, 160, 10);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("02");
        J7.add(jLabel18);
        jLabel18.setBounds(30, 90, 50, 37);

        jPanel2.add(J7);
        J7.setBounds(440, 30, 340, 150);

        J6.setBackground(new java.awt.Color(49, 10, 76));
        J6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        J6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J6.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Funcionários");
        J6.add(jLabel3);
        jLabel3.setBounds(30, 10, 200, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fun.png"))); // NOI18N
        J6.add(jLabel8);
        jLabel8.setBounds(210, 10, 130, 150);

        jProgressBar1.setBackground(new java.awt.Color(49, 10, 76));
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setValue(80);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        J6.add(jProgressBar1);
        jProgressBar1.setBounds(10, 130, 160, 10);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("27");
        J6.add(jLabel17);
        jLabel17.setBounds(30, 90, 50, 37);

        jPanel2.add(J6);
        J6.setBounds(70, 30, 340, 150);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(340, 30, 840, 640);

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/THome.png"))); // NOI18N
        Wallpaper.setText("jLabel1");
        getContentPane().add(Wallpaper);
        Wallpaper.setBounds(0, 0, 1238, 720);

        setSize(new java.awt.Dimension(1200, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setColor(JPanel p) {
        p.setBackground(new Color(90, 74, 143));
    }

    public void resetColor(JPanel p) {
        p.setBackground(new Color(49, 10, 76));
    }
    
//    public void recebeNome(String nome){
//        labelNome.setText(nome);
//    }
    
  
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
        JOptionPane.showMessageDialog(null, "Você já está na Home do Sistema :)", "Connect Data - 1.0", 2);

    }//GEN-LAST:event_J1MouseClicked

    private void J2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseClicked
        dispose();
        new TPesquisa_Funcionario().setVisible(true);

//        new TCadastro().setVisible(true);
    }//GEN-LAST:event_J2MouseClicked

    private void J3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseClicked
        dispose();
        new TDepartamento().setVisible(true);

    }//GEN-LAST:event_J3MouseClicked


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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JLabel labelNome;
    // End of variables declaration//GEN-END:variables
}
