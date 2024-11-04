
import Classes.Funcionario;
import DAO.Funcionario_DAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public class TCadastro extends javax.swing.JFrame {

    private ResourceBundle traducoes;

    // Cria um objeto DateTimeFormatter para formatar datas no padrão "yyyy-MM-dd"
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    // Cria um novo objeto da classe Funcionario para representar um funcionário
    Funcionario funcionario = new Funcionario();
    // Cria um novo objeto da classe Funcionario_DAO para acessar e manipular dados de funcionários no banco de dados
    Funcionario_DAO funcionario_DAO = new Funcionario_DAO();

    public TCadastro(ResourceBundle traducoes) {
        initComponents();
        this.traducoes = traducoes;
        traduzir();
    }

    public void traduzir() {
        this.labelInfo.setText(this.traducoes.getString("tcadastro_titulo1"));
        this.labelInfo2.setText(this.traducoes.getString("tcadastro_titulo2"));

        this.labelNome.setText(this.traducoes.getString("tcadastro_label1"));
        this.labelEmail.setText(this.traducoes.getString("tcadastro_label2"));
        this.labelCPF.setText(this.traducoes.getString("tcadastro_label3"));
        this.labelTelefone.setText(this.traducoes.getString("tcadastro_label4"));
        this.labelDataC.setText(this.traducoes.getString("tcadastro_label5"));
        this.labelGenero.setText(this.traducoes.getString("tcadastro_label6"));
        this.labelEndereco.setText(this.traducoes.getString("tcadastro_label7"));
        this.labelBairro.setText(this.traducoes.getString("tcadastro_label8"));
        this.labelCidade.setText(this.traducoes.getString("tcadastro_label9"));
        this.labelCEP.setText(this.traducoes.getString("tcadastro_label10"));
        this.labelNaci.setText(this.traducoes.getString("tcadastro_label11"));

        this.labelEmpresa.setText(this.traducoes.getString("tcadastro_label12"));
        this.labelDepart.setText(this.traducoes.getString("tcadastro_label13"));
        this.labelPeri.setText(this.traducoes.getString("tcadastro_label14"));
        this.labelMetas.setText(this.traducoes.getString("tcadastro_label15"));
        this.labelRel.setText(this.traducoes.getString("tcadastro_label16"));
        this.labelCNH.setText(this.traducoes.getString("tcadastro_label17"));
        this.jButton_cadastro.setText(this.traducoes.getString("tcadastro_botao1"));
        this.jButton_foto.setText(this.traducoes.getString("tcadastro_botao2"));

        this.comboDepart.addItem(this.traducoes.getString("tcadastro_combo1"));
        this.comboDepart.addItem(this.traducoes.getString("tcadastro_combo1.2"));
        this.comboDepart.addItem(this.traducoes.getString("tcadastro_combo1.3"));
        this.comboDepart.addItem(this.traducoes.getString("tcadastro_combo1.4"));
        this.comboDepart.addItem(this.traducoes.getString("tcadastro_combo1.5"));

        this.comboPeri.addItem(this.traducoes.getString("tcadastro_combo2.1"));
        this.comboPeri.addItem(this.traducoes.getString("tcadastro_combo2.2"));

        this.comboCNH.addItem(this.traducoes.getString("tcadastro_combo3.1"));
        this.comboCNH.addItem(this.traducoes.getString("tcadastro_combo3.2"));

        this.radioMasc.setText(this.traducoes.getString("tcadastro_radio1"));
        this.radioFem.setText(this.traducoes.getString("tcadastro_radio1.2"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelInfo2 = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        StrEmpresa = new javax.swing.JTextField();
        labelEmpresa = new javax.swing.JLabel();
        labelDepart = new javax.swing.JLabel();
        comboDepart = new javax.swing.JComboBox<>();
        labelPeri = new javax.swing.JLabel();
        comboPeri = new javax.swing.JComboBox<>();
        comboCNH = new javax.swing.JComboBox<>();
        labelCNH = new javax.swing.JLabel();
        labelRel = new javax.swing.JLabel();
        StrRelatorio = new javax.swing.JTextField();
        labelMetas = new javax.swing.JLabel();
        StrMetas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton_foto = new javax.swing.JButton();
        jButton_cadastro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        StrNome = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        StrEmail = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        StrCPF = new javax.swing.JTextField();
        labelGenero = new javax.swing.JLabel();
        radioMasc = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        StrTell = new javax.swing.JTextField();
        labelDataC = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        StrDataCont = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        StrEndereco = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        StrBairro = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        StrCidade = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        StrCEP = new javax.swing.JTextField();
        StrNacio = new javax.swing.JTextField();
        labelNaci = new javax.swing.JLabel();
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

        labelInfo2.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        labelInfo2.setText("Informação Profissional");
        jPanel1.add(labelInfo2);
        labelInfo2.setBounds(10, 370, 230, 40);

        labelInfo.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        labelInfo.setText("Informação Pessoal");
        jPanel1.add(labelInfo);
        labelInfo.setBounds(10, 9, 210, 30);

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

        labelEmpresa.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelEmpresa.setText("Empresa:");
        jPanel4.add(labelEmpresa);
        labelEmpresa.setBounds(20, 20, 90, 20);

        labelDepart.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelDepart.setText("Departamento:");
        jPanel4.add(labelDepart);
        labelDepart.setBounds(20, 70, 140, 20);

        jPanel4.add(comboDepart);
        comboDepart.setBounds(20, 90, 340, 22);

        labelPeri.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelPeri.setText("Período:");
        jPanel4.add(labelPeri);
        labelPeri.setBounds(20, 120, 90, 20);

        jPanel4.add(comboPeri);
        comboPeri.setBounds(20, 140, 340, 22);

        jPanel4.add(comboCNH);
        comboCNH.setBounds(480, 140, 340, 22);

        labelCNH.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelCNH.setText("CNH:");
        jPanel4.add(labelCNH);
        labelCNH.setBounds(480, 120, 50, 20);

        labelRel.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelRel.setText("Relatório");
        jPanel4.add(labelRel);
        labelRel.setBounds(480, 70, 130, 20);
        jPanel4.add(StrRelatorio);
        StrRelatorio.setBounds(480, 90, 340, 22);

        labelMetas.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelMetas.setText("Metas:");
        jPanel4.add(labelMetas);
        labelMetas.setBounds(480, 20, 70, 20);
        jPanel4.add(StrMetas);
        StrMetas.setBounds(480, 40, 340, 22);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfi.png"))); // NOI18N
        jPanel4.add(jLabel22);
        jLabel22.setBounds(930, 20, 128, 120);

        jButton_foto.setBackground(new java.awt.Color(49, 10, 76));
        jButton_foto.setForeground(new java.awt.Color(255, 255, 255));
        jButton_foto.setText("Carregar Foto");
        jButton_foto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_fotoActionPerformed(evt);
            }
        });
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

        labelNome.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelNome.setText("Nome Completo:");
        jPanel3.add(labelNome);
        labelNome.setBounds(30, 20, 130, 20);

        StrNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrNomeKeyTyped(evt);
            }
        });
        jPanel3.add(StrNome);
        StrNome.setBounds(30, 40, 340, 22);

        labelEmail.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelEmail.setText("E-mail:");
        jPanel3.add(labelEmail);
        labelEmail.setBounds(30, 60, 80, 30);

        StrEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrEmailKeyTyped(evt);
            }
        });
        jPanel3.add(StrEmail);
        StrEmail.setBounds(30, 90, 340, 22);

        labelCPF.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelCPF.setText("CPF:");
        jPanel3.add(labelCPF);
        labelCPF.setBounds(30, 110, 50, 30);

        StrCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrCPFKeyTyped(evt);
            }
        });
        jPanel3.add(StrCPF);
        StrCPF.setBounds(30, 140, 340, 22);

        labelGenero.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelGenero.setText("Gênero:");
        jPanel3.add(labelGenero);
        labelGenero.setBounds(30, 270, 60, 20);

        radioMasc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioMasc);
        radioMasc.setText("Masculino");
        jPanel3.add(radioMasc);
        radioMasc.setBounds(90, 270, 90, 20);

        radioFem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioFem);
        radioFem.setText("Feminino");
        jPanel3.add(radioFem);
        radioFem.setBounds(180, 270, 90, 20);

        StrTell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrTellKeyTyped(evt);
            }
        });
        jPanel3.add(StrTell);
        StrTell.setBounds(30, 190, 340, 22);

        labelDataC.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelDataC.setText("Data Contratado: (yyyy/mm/dd)");
        jPanel3.add(labelDataC);
        labelDataC.setBounds(30, 220, 250, 20);

        labelTelefone.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelTelefone.setText("Telefone:");
        jPanel3.add(labelTelefone);
        labelTelefone.setBounds(30, 170, 80, 20);
        jPanel3.add(StrDataCont);
        StrDataCont.setBounds(30, 240, 340, 22);

        labelEndereco.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelEndereco.setText("Endereço:");
        jPanel3.add(labelEndereco);
        labelEndereco.setBounds(480, 20, 150, 20);

        StrEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrEnderecoKeyTyped(evt);
            }
        });
        jPanel3.add(StrEndereco);
        StrEndereco.setBounds(480, 40, 340, 22);

        labelBairro.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelBairro.setText("Bairro:");
        jPanel3.add(labelBairro);
        labelBairro.setBounds(480, 60, 90, 30);

        StrBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrBairroKeyTyped(evt);
            }
        });
        jPanel3.add(StrBairro);
        StrBairro.setBounds(480, 90, 340, 22);

        labelCidade.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelCidade.setText("Cidade:");
        jPanel3.add(labelCidade);
        labelCidade.setBounds(480, 110, 120, 30);

        StrCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrCidadeKeyTyped(evt);
            }
        });
        jPanel3.add(StrCidade);
        StrCidade.setBounds(480, 140, 340, 22);

        labelCEP.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelCEP.setText("CEP:");
        jPanel3.add(labelCEP);
        labelCEP.setBounds(480, 170, 100, 20);

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

        labelNaci.setFont(new java.awt.Font("Alef", 1, 13)); // NOI18N
        labelNaci.setText("Nacionalidade:");
        jPanel3.add(labelNaci);
        labelNaci.setBounds(480, 220, 130, 20);

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
        new TPesquisa_Funcionario(traducoes).setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    // Lógica para bloquear ao digitar certos caracteres
    private void StrNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrNomeKeyTyped
        String caracteres = ",.*=+@0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
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

    // Lógica para bloquear ao digitar certos caracteres
    private void StrCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrCPFKeyTyped
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        String cpf = this.StrCPF.getText();
        funcionario.setCpf(cpf);
    }//GEN-LAST:event_StrCPFKeyTyped

    // Lógica para bloquear ao digitar certos caracteres
    private void StrCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrCidadeKeyTyped
        String caracteres = ",.*=+@0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        String cidade = this.StrCidade.getText();
        funcionario.setCidade(cidade);
    }//GEN-LAST:event_StrCidadeKeyTyped

    // Lógica para bloquear ao digitar certos caracteres
    private void StrTellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrTellKeyTyped
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        String telefone = this.StrTell.getText();
        funcionario.setTelefone(telefone);
    }//GEN-LAST:event_StrTellKeyTyped

    // Lógica para bloquear ao digitar certos caracteres
    private void StrCEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrCEPKeyTyped
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        String cep = this.StrCEP.getText();
        funcionario.setCep(cep);
    }//GEN-LAST:event_StrCEPKeyTyped
    // Lógica para bloquear ao digitar certos caracteres
    private void StrNacioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrNacioKeyTyped
        String caracteres = ",.*=+@0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        String nacao = this.StrNacio.getText();
        funcionario.setNacionalidade(nacao);
    }//GEN-LAST:event_StrNacioKeyTyped

    private void StrEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StrEmpresaKeyTyped
        String empresa = this.StrEmpresa.getText();
        funcionario.setNome_empresa(empresa);
    }//GEN-LAST:event_StrEmpresaKeyTyped

    /**
     * Realiza o cadastro de um novo funcionário no sistema. Verifica se todos
     * os campos obrigatórios estão preenchidos. Se todos os campos estiverem
     * preenchidos, cria um novo objeto Funcionario e atribui os valores
     * fornecidos. Insere o funcionário no banco de dados por meio do
     * Funcionario_DAO. Se algum campo obrigatório estiver vazio, exibe uma
     * mensagem de alerta.
     */
    public void cadastrar() {
        if ((this.radioMasc.isSelected() == false || this.radioFem.isSelected() == false) & this.StrNome.getText().equalsIgnoreCase("") & this.StrBairro.getText().equalsIgnoreCase("")
                & this.StrCEP.getText().equalsIgnoreCase("") & this.StrCPF.getText().equalsIgnoreCase("") & this.StrCidade.getText().equalsIgnoreCase("")
                & this.StrDataCont.getText().equalsIgnoreCase("") & this.StrEmail.getText().equalsIgnoreCase("") & this.StrEmpresa.getText().equalsIgnoreCase("")
                & this.StrEndereco.getText().equalsIgnoreCase("") & this.StrMetas.getText().equalsIgnoreCase("") & this.StrNacio.getText().equalsIgnoreCase("")
                & this.StrNome.getText().equalsIgnoreCase("") & this.StrRelatorio.getText().equalsIgnoreCase("") & this.StrTell.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, traducoes.getString("tcadastro_joption1.2"), "Connect Data - 1.2.1", JOptionPane.WARNING_MESSAGE);
        } else {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(this.StrNome.getText());
            funcionario.setBairro(this.StrBairro.getText());
            funcionario.setCep(this.StrCEP.getText());
            funcionario.setCpf(this.StrCPF.getText());
            funcionario.setCidade(this.StrCidade.getText());

            if (!this.StrDataCont.getText().isEmpty()) {
                funcionario.setData_contrtado(LocalDate.parse(this.StrDataCont.getText(), formatador)); // Conversão para LocalDate
            } else {
                // Tratar o caso em que o campo está vazio, talvez definindo um valor padrão
                funcionario.setData_contrtado(LocalDate.now()); // Por exemplo, definir a data atual como padrão
            }

            funcionario.setEmail(this.StrEmail.getText());
            funcionario.setNome_empresa(this.StrEmpresa.getText());
            funcionario.setEndereco(this.StrEndereco.getText());

            if (!this.StrMetas.getText().isEmpty()) {
                funcionario.setMetaCumprida(Integer.parseInt(this.StrMetas.getText())); // Conversão para int
            } else {
                // Tratar o caso em que o campo está vazio, talvez definindo um valor padrão
                funcionario.setMetaCumprida(0); // Por exemplo, definir como 0
            }

            funcionario.setNacionalidade(this.StrNacio.getText());

            if (!this.StrRelatorio.getText().isEmpty()) {
                funcionario.setIdRelatorios(Integer.parseInt(this.StrRelatorio.getText())); // Conversão para int
            } else {

                // Tratar o caso em que o campo está vazio, talvez definindo um valor padrão
                funcionario.setIdRelatorios(0); // Por exemplo, definir como 0
            }

            funcionario.setTelefone(this.StrTell.getText());
// Converte a data digitada para LocalDate
            if (this.radioMasc.isSelected()) {
                funcionario.setGenero('M');
            } else if (this.radioFem.isSelected()) {
                funcionario.setGenero('F');
            }

            int n = this.comboDepart.getSelectedIndex();
            switch (n) {
                case 0: // producao
                    funcionario.setIdDepartamento(5);
                    break;
                case 1:// rh
                    funcionario.setIdDepartamento(1);
                    break;
                case 2:// marketing
                    funcionario.setIdDepartamento(3);
                    break;
                case 3:// finanças
                    funcionario.setIdDepartamento(2);
                    break;
                case 4:// vendas
                    funcionario.setIdDepartamento(4);
                    break;
                default:
                    throw new AssertionError();
            }

            int nm = this.comboPeri.getSelectedIndex();
            switch (nm) {
                case 0:// integral
                    funcionario.setPeriodo("Integral");
                    break;
                case 1:// mp
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

// Adiciona o funcionário ao banco de dados
            funcionario_DAO.Adicionar("INSERT INTO funcionario (nome, cpf, email, genero, telefone, endereco, bairro, cidade, cep, nacionalidade, cnh, data_contratado, periodo, "
                    + "nome_empresa, idDepartamento, foto, idRelatorios, MetaCumprida) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", funcionario);
        }
    }


    private void jButton_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cadastroActionPerformed
        cadastrar();
    }//GEN-LAST:event_jButton_cadastroActionPerformed

    private void jButton_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_fotoActionPerformed
        JOptionPane.showMessageDialog(null, traducoes.getString("tcadastro_joption1"), "Connect Data - 1.2.1", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton_fotoActionPerformed


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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCNH;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelDataC;
    private javax.swing.JLabel labelDepart;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelInfo2;
    private javax.swing.JLabel labelMetas;
    private javax.swing.JLabel labelNaci;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPeri;
    private javax.swing.JLabel labelRel;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMasc;
    // End of variables declaration//GEN-END:variables
}
