
import Classes.Departamento;
import Classes.Funcionario;
import Classes.Relatorio;
import javax.swing.JOptionPane;

public class TLogin extends javax.swing.JFrame {

    public TLogin() {
           initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StrAdmin = new javax.swing.JTextField();
        bEntrar = new javax.swing.JButton();
        StrSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect Data - Login");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jButton1.setText("Fechar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 380, 90, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 10, 76));
        jLabel4.setText("Connect Data - 1.0");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 380, 100, 20);

        jLabel2.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 160, 50, 18);

        jLabel3.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jLabel3.setText("Admin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 37, 18);

        jLabel5.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jLabel5.setText("Entrar no Sistema");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 210, 100, 16);
        getContentPane().add(StrAdmin);
        StrAdmin.setBounds(30, 130, 220, 20);

        bEntrar.setBackground(new java.awt.Color(255, 255, 255));
        bEntrar.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        bEntrar.setText("Acessar");
        bEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(bEntrar);
        bEntrar.setBounds(30, 230, 220, 30);
        getContentPane().add(StrSenha);
        StrSenha.setBounds(30, 180, 220, 20);

        jLabel1.setFont(new java.awt.Font("Alef", 1, 36)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 30, 100, 50);

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CDLogin.png"))); // NOI18N
        getContentPane().add(Wallpaper);
        Wallpaper.setBounds(0, 0, 700, 400);

        setSize(new java.awt.Dimension(700, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        if ("".equals(StrAdmin.getText()) || StrSenha.getText() == "") {
            JOptionPane.showMessageDialog(null, "Informe Usuário e Senha para Entrar no Sistema.", "Connect Data - 1.0", 2);

        } else if (!"123".equals(StrSenha.getText()) || !"anthoni".equals(StrAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Dados incorretos para entrar no Sistema.", "Connect Data - 1.0", 2);
            StrAdmin.setText("");
            StrSenha.setText("");

        } else if ("123".equals(StrSenha.getText()) || !"anthoni".equals(StrAdmin.getText())) {
            

            new THome().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_bEntrarActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrAdmin;
    private javax.swing.JPasswordField StrSenha;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
