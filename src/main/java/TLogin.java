
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public final class TLogin extends javax.swing.JFrame {

    private static ResourceBundle traducoes;

    public TLogin(ResourceBundle traducoes) {
        initComponents();
        TLogin.traducoes = traducoes;
        this.traduzir();
    }

    public void traduzir() {
        this.bAcessar.setText(TLogin.traducoes.getString("tlogin_botao_acessar"));
        this.labelSenha.setText(TLogin.traducoes.getString("tlogin_senha"));
        this.labelSistema.setText(TLogin.traducoes.getString("tlogin_entrar_sistema"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelAdmin = new javax.swing.JLabel();
        labelSistema = new javax.swing.JLabel();
        StrAdmin = new javax.swing.JTextField();
        bAcessar = new javax.swing.JButton();
        StrSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect Data - Login");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 10, 76));
        jLabel4.setText("Connect Data - 1.2.1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 380, 110, 20);

        labelSenha.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        labelSenha.setText("Senha:");
        getContentPane().add(labelSenha);
        labelSenha.setBounds(30, 160, 90, 18);

        labelAdmin.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        labelAdmin.setText("Admin:");
        getContentPane().add(labelAdmin);
        labelAdmin.setBounds(30, 110, 90, 18);

        labelSistema.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        labelSistema.setText("Entrar no Sistema");
        getContentPane().add(labelSistema);
        labelSistema.setBounds(90, 210, 140, 16);
        getContentPane().add(StrAdmin);
        StrAdmin.setBounds(30, 130, 220, 22);

        bAcessar.setBackground(new java.awt.Color(255, 255, 255));
        bAcessar.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        bAcessar.setText("Acessar");
        bAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(bAcessar);
        bAcessar.setBounds(30, 230, 220, 30);
        getContentPane().add(StrSenha);
        StrSenha.setBounds(30, 180, 220, 22);

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

    /**
     * Realiza o login no sistema. Verifica se o campo de usuário e senha estão
     * preenchidos. Verifica se os dados fornecidos correspondem ao usuário e
     * senha corretos. Caso os dados estejam corretos, abre a tela principal do
     * sistema.
     */
    public void login() {
        if ("".equals(StrAdmin.getText()) || StrSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, traducoes.getString("tlogin_joption1"), "Connect Data - 1.2.1", JOptionPane.WARNING_MESSAGE);
        } else if (!"123".equals(StrSenha.getText()) || !"admin".equals(StrAdmin.getText())) {
            JOptionPane.showMessageDialog(null, traducoes.getString("tlogin_joption1.2"), "Connect Data - 1.2.1", JOptionPane.WARNING_MESSAGE);
            StrAdmin.setText("");
            StrSenha.setText("");
        } else {
            // Instancia a tela THome e torna-a visível
            new THome(traducoes).setVisible(true);
            dispose();
        }
    }

    private void bAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAcessarActionPerformed
        login();

    }//GEN-LAST:event_bAcessarActionPerformed

    public static void main(String args[]) {
        //Criando uma instância da classe TLogin e a tornando visível ao usuário
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
                new TLogin(traducoes).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrAdmin;
    private javax.swing.JPasswordField StrSenha;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton bAcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSistema;
    // End of variables declaration//GEN-END:variables

}
