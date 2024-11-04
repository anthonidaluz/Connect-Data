
import Classes.Banco;
import Classes.Funcionario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class TCadastro extends javax.swing.JFrame {
    Banco banco = new Banco();
    Funcionario funcionario = new Funcionario();
    ArrayList<Funcionario> ListaFuncionarios= new ArrayList();
    
    
    public TCadastro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        StrEmpresa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comboDepart = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        comboPeri = new javax.swing.JComboBox<>();
        comboCNH = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        StrRelatorio = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        StrMetas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton_foto = new javax.swing.JButton();
        jButton_cadastro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        StrNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        StrEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        StrCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioMasc = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        StrTell = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StrDataCont = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        StrEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        StrBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        StrCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        StrCEP = new javax.swing.JTextField();
        StrNacio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("<<");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21);
        jLabel21.setBounds(20, 20, 40, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jLabel1.setText("Informação Profissional");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 370, 230, 40);

        jLabel2.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jLabel2.setText("Informação Pessoal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 9, 210, 30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        StrEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrEmpresaKeyTyped(evt);
            }
        });
        jPanel4.add(StrEmpresa);
        StrEmpresa.setBounds(20, 40, 340, 22);

        jLabel14.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel14.setText("Empresa:");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(20, 20, 70, 20);

        jLabel16.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel16.setText("Departamento:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(20, 70, 100, 20);

        comboDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produção", "RH", "Marketing", "Finanças", "Vendas" }));
        jPanel4.add(comboDepart);
        comboDepart.setBounds(20, 90, 340, 22);

        jLabel17.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel17.setText("Período:");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(20, 120, 60, 20);

        comboPeri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Integral", "Meio Período" }));
        jPanel4.add(comboPeri);
        comboPeri.setBounds(20, 140, 340, 22);

        comboCNH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Possui", "Não possui" }));
        jPanel4.add(comboCNH);
        comboCNH.setBounds(480, 140, 340, 22);

        jLabel18.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel18.setText("CNH:");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(480, 120, 40, 20);

        jLabel19.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel19.setText("Relatório");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(480, 70, 130, 20);

        StrRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrRelatorioKeyTyped(evt);
            }
        });
        jPanel4.add(StrRelatorio);
        StrRelatorio.setBounds(480, 90, 340, 22);

        jLabel20.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel20.setText("Metas:");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(480, 20, 70, 20);

        StrMetas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrMetasKeyTyped(evt);
            }
        });
        jPanel4.add(StrMetas);
        StrMetas.setBounds(480, 40, 340, 22);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfi.png"))); // NOI18N
        jPanel4.add(jLabel22);
        jLabel22.setBounds(930, 20, 128, 120);

        jButton_foto.setBackground(new java.awt.Color(49, 10, 76));
        jButton_foto.setForeground(new java.awt.Color(255, 255, 255));
        jButton_foto.setText("Carregar Foto");
        jButton_foto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jButton_foto);
        jButton_foto.setBounds(930, 150, 130, 30);

        jButton_cadastro.setBackground(new java.awt.Color(49, 10, 76));
        jButton_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cadastro.setText("Cadastrar Funcionário");
        jButton_cadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cadastroActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_cadastro);
        jButton_cadastro.setBounds(800, 200, 200, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 410, 1090, 260);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel6.setText("Nome Completo:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 20, 110, 20);

        StrNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrNomeKeyTyped(evt);
            }
        });
        jPanel3.add(StrNome);
        StrNome.setBounds(30, 40, 340, 22);

        jLabel7.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel7.setText("E-mail:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 60, 60, 30);

        StrEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrEmailKeyTyped(evt);
            }
        });
        jPanel3.add(StrEmail);
        StrEmail.setBounds(30, 90, 340, 22);

        jLabel8.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel8.setText("CPF:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 110, 50, 30);

        StrCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrCPFKeyTyped(evt);
            }
        });
        jPanel3.add(StrCPF);
        StrCPF.setBounds(30, 140, 340, 22);

        jLabel3.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel3.setText("Gênero:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 270, 60, 20);

        radioMasc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioMasc);
        radioMasc.setText("Masculino");
        jPanel3.add(radioMasc);
        radioMasc.setBounds(90, 270, 90, 21);

        radioFem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioFem);
        radioFem.setText("Feminino");
        jPanel3.add(radioFem);
        radioFem.setBounds(180, 270, 90, 21);

        StrTell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrTellKeyTyped(evt);
            }
        });
        jPanel3.add(StrTell);
        StrTell.setBounds(30, 190, 340, 22);

        jLabel4.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel4.setText("Data Contratado:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 220, 120, 20);

        jLabel5.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel5.setText("Telefone:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 170, 70, 20);

        StrDataCont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrDataContKeyTyped(evt);
            }
        });
        jPanel3.add(StrDataCont);
        StrDataCont.setBounds(30, 240, 340, 22);

        jLabel9.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel9.setText("Endereço:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(480, 20, 110, 20);

        StrEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrEnderecoKeyTyped(evt);
            }
        });
        jPanel3.add(StrEndereco);
        StrEndereco.setBounds(480, 40, 340, 22);

        jLabel10.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel10.setText("Bairro:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(480, 60, 60, 30);

        StrBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrBairroKeyTyped(evt);
            }
        });
        jPanel3.add(StrBairro);
        StrBairro.setBounds(480, 90, 340, 22);

        jLabel11.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel11.setText("Cidade:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(480, 110, 50, 30);

        StrCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrCidadeKeyTyped(evt);
            }
        });
        jPanel3.add(StrCidade);
        StrCidade.setBounds(480, 140, 340, 22);

        jLabel12.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel12.setText("CEP:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(480, 170, 70, 20);

        StrCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrCEPKeyTyped(evt);
            }
        });
        jPanel3.add(StrCEP);
        StrCEP.setBounds(480, 190, 340, 22);

        StrNacio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrNacioKeyTyped(evt);
            }
        });
        jPanel3.add(StrNacio);
        StrNacio.setBounds(480, 240, 340, 22);

        jLabel13.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel13.setText("Nacionalidade:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(480, 220, 120, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 40, 1090, 330);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 20, 1110, 680);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TCadastro.png"))); // NOI18N
        getContentPane().add(WallPaper);
        WallPaper.setBounds(0, 0, 1200, 720);

        jLabel15.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        jLabel15.setText("Empresa:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 20, 70, 20);

        setSize(new java.awt.Dimension(1200, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        dispose();
        new TPesquisa_Funcionario().setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void StrNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrNomeKeyTyped
        String caracteres=",.*=+@0987654321";//Lógica para o nome receber apenas letras em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        String nome = this.StrNome.getText();
        funcionario.setNome(nome);
    }//GEN-LAST:event_StrNomeKeyTyped

    private void StrEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrEnderecoKeyTyped
        String endereco = this.StrEndereco.getText();
        funcionario.setEndereco(endereco);
    }//GEN-LAST:event_StrEnderecoKeyTyped

    private void StrEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrEmailKeyTyped
        String email = this.StrEmail.getText();
        funcionario.setEmail(email);
    }//GEN-LAST:event_StrEmailKeyTyped

    private void StrBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrBairroKeyTyped
        String bairro = this.StrBairro.getText();
        funcionario.setBairro(bairro);
    }//GEN-LAST:event_StrBairroKeyTyped

    private void StrCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrCPFKeyTyped
        String caracteres="abcdefghijklmnopqrstuvwxyz";//Lógica para receber apenas números em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        String cpf = this.StrCPF.getText();
        funcionario.setCpf(cpf);
    }//GEN-LAST:event_StrCPFKeyTyped

    private void StrCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrCidadeKeyTyped
        String caracteres=",.*=+@0987654321";//Lógica para a cidade receber apenas letras em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        String cidade = this.StrCidade.getText();
        funcionario.setCidade(cidade);
    }//GEN-LAST:event_StrCidadeKeyTyped

    private void StrTellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrTellKeyTyped
        String caracteres="abcdefghijklmnopqrstuvwxyz";//Lógica para receber apenas números em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        String telefone = this.StrTell.getText();
        funcionario.setTelefone(telefone);
    }//GEN-LAST:event_StrTellKeyTyped

    private void StrCEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrCEPKeyTyped
        String caracteres="abcdefghijklmnopqrstuvwxyz";//Lógica para receber apenas números em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        String cep = this.StrCEP.getText();
        funcionario.setCep(cep);
    }//GEN-LAST:event_StrCEPKeyTyped

    private void StrDataContKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrDataContKeyTyped
        String caracteres="abcdefghijklmnopqrstuvwxyz";//Lógica para receber apenas números em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        DateTimeFormatter formatador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String datatxt = this.StrDataCont.getText();
        LocalDate data = LocalDate.parse(datatxt,formatador);
        funcionario.setData_contrtado(data);
    }//GEN-LAST:event_StrDataContKeyTyped

    private void StrNacioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrNacioKeyTyped
        String caracteres=",.*=+@0987654321";//Lógica para a nacionalidade receber apenas letras em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        String nacao = this.StrNacio.getText();
        funcionario.setNacionalidade(nacao);
    }//GEN-LAST:event_StrNacioKeyTyped

    private void StrEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrEmpresaKeyTyped
        String empresa = this.StrEmpresa.getText();
        funcionario.setNome_empresa(empresa);
    }//GEN-LAST:event_StrEmpresaKeyTyped

    private void StrMetasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrMetasKeyTyped
        String caracteres="abcdefghijklmnopqrstuvwxyz";//Lógica para receber apenas números em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        String metastxt = this.StrMetas.getText();
        int metas = Integer.parseInt(metastxt);
        funcionario.setMetaCumprida(metas);
    }//GEN-LAST:event_StrMetasKeyTyped

    private void StrRelatorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrRelatorioKeyTyped
        String caracteres="abcdefghijklmnopqrstuvwxyz";//Lógica para receber apenas números em sua digitação
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
}
        String relatorioTXT = this.StrRelatorio.getText();
        int relatorio = Integer.parseInt(relatorioTXT);
        funcionario.setIdRelatorios(relatorio);
    }//GEN-LAST:event_StrRelatorioKeyTyped

    private void jButton_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cadastroActionPerformed
        if(this.radioMasc.isSelected()){
            funcionario.setGenero('M');
        }
        else if(this.radioFem.isSelected()){
            funcionario.setGenero('F');
        }
        
        int n = this.comboDepart.getSelectedIndex();
        switch (n) {
            case 0: //producao
                funcionario.setIdDepartamento(5);
                break;
            case 1://rh
                funcionario.setIdDepartamento(1);
                break;
            case 2://marketing
                funcionario.setIdDepartamento(3);
                break;
            case 3://finanças
                funcionario.setIdDepartamento(2);
                break;
            case 4://vendas
                funcionario.setIdDepartamento(4);
                break;
            default:
                throw new AssertionError();
        }
        
        int nm = this.comboPeri.getSelectedIndex();
        switch (nm) {
            case 0://integral
                funcionario.setPeriodo("Integral");
                break;
            case 1://mp
                funcionario.setPeriodo("Meio período");
                break;
            default:
                throw new AssertionError();
        }
        
        int num = this.comboCNH.getSelectedIndex();
        switch (num) {
            case 0:
                funcionario.setCnh(1);
                break;
            case 1:
                funcionario.setCnh(0);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jButton_cadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrBairro;
    private javax.swing.JTextField StrCEP;
    private javax.swing.JTextField StrCPF;
    private javax.swing.JTextField StrCidade;
    private javax.swing.JTextField StrDataCont;
    private javax.swing.JTextField StrEmail;
    private javax.swing.JTextField StrEmpresa;
    private javax.swing.JTextField StrEndereco;
    private javax.swing.JTextField StrMetas;
    private javax.swing.JTextField StrNacio;
    private javax.swing.JTextField StrNome;
    private javax.swing.JTextField StrRelatorio;
    private javax.swing.JTextField StrTell;
    private javax.swing.JLabel WallPaper;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboCNH;
    private javax.swing.JComboBox<String> comboDepart;
    private javax.swing.JComboBox<String> comboPeri;
    private javax.swing.JButton jButton_cadastro;
    private javax.swing.JButton jButton_foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMasc;
    // End of variables declaration//GEN-END:variables
}
