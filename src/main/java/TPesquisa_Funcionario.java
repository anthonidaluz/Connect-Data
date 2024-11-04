
import Classes.Funcionario;
import DAO.Funcionario_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class TPesquisa_Funcionario extends javax.swing.JFrame {

    private static ResourceBundle traducoes;

// Cria um objeto DateTimeFormatter para formatar datas no padrão "yyyy-MM-dd"
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
// Declara uma lista de objetos do tipo Funcionario
    private ArrayList<Funcionario> ListaFuncionarios;
// Cria um objeto Funcionario_DAO para acessar e manipular dados dos funcionários no banco de dados
    private Funcionario_DAO funcionario_DAO = new Funcionario_DAO();

    public TPesquisa_Funcionario(ResourceBundle traducoes) {
        initComponents();
        // Cria um modelo de tabela padrão com base na tabela de funcionários (tFuncionarios)
        DefaultTableModel tblModel = (DefaultTableModel) this.tFuncionarios.getModel();
        // Inicializa a lista de funcionários como uma nova ArrayList
        ListaFuncionarios = new ArrayList<>();
        // Preenche o modelo da tabela com os dados dos funcionários retornados pela consulta SQL
        funcionario_DAO.listar("select * from funcionario", tblModel);
        this.traducoes = traducoes;
        traduzir();

    }

    public void traduzir() {
        this.jButton_pesquisa.setText(TPesquisa_Funcionario.traducoes.getString("tpesquisa_botao"));
        this.jButton_cadastro1.setText(TPesquisa_Funcionario.traducoes.getString("tpesquisa_botao1"));
        this.jButton_editar.setText(TPesquisa_Funcionario.traducoes.getString("tpesquisa_botao2"));
        this.jButton_deletar.setText(TPesquisa_Funcionario.traducoes.getString("tpesquisa_botao3"));
        this.jButton_data.setText(TPesquisa_Funcionario.traducoes.getString("tpesquisa_botao4"));
        this.jButton_Rel.setText(TPesquisa_Funcionario.traducoes.getString("tpesquisa_botao5"));
        this.jButton_selecionar1.setText(TPesquisa_Funcionario.traducoes.getString("tpesquisa_grafico"));

    }

    ;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_pesquisa = new javax.swing.JButton();
        labelCPF = new javax.swing.JLabel();
        jTextField_cpf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton_data = new javax.swing.JButton();
        jButton_deletar = new javax.swing.JButton();
        jButton_cadastro1 = new javax.swing.JButton();
        jButton_editar = new javax.swing.JButton();
        jButton_Rel = new javax.swing.JButton();
        jButton_selecionar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tFuncionarios = new javax.swing.JTable();
        WallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 50, 300, 180);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<<");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 30, 20);

        jLabel6.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Connect Data 1.0");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 250, 100, 30);

        jButton_pesquisa.setBackground(new java.awt.Color(255, 255, 255));
        jButton_pesquisa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton_pesquisa.setText("Pesquisar");
        jButton_pesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_pesquisa);
        jButton_pesquisa.setBounds(980, 20, 200, 21);

        labelCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelCPF.setForeground(new java.awt.Color(255, 255, 255));
        labelCPF.setText("CPF:");
        getContentPane().add(labelCPF);
        labelCPF.setBounds(330, 20, 40, 17);
        getContentPane().add(jTextField_cpf);
        jTextField_cpf.setBounds(370, 20, 560, 24);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton_data.setBackground(new java.awt.Color(49, 10, 76));
        jButton_data.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_data.setForeground(new java.awt.Color(255, 255, 255));
        jButton_data.setText("Mostrar Data");
        jButton_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dataActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_data);
        jButton_data.setBounds(20, 200, 240, 50);

        jButton_deletar.setBackground(new java.awt.Color(49, 10, 76));
        jButton_deletar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_deletar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_deletar.setText("Deletar");
        jButton_deletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_deletar);
        jButton_deletar.setBounds(20, 140, 240, 50);

        jButton_cadastro1.setBackground(new java.awt.Color(49, 10, 76));
        jButton_cadastro1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_cadastro1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cadastro1.setText("Cadastrar");
        jButton_cadastro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cadastro1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_cadastro1);
        jButton_cadastro1.setBounds(20, 20, 240, 50);

        jButton_editar.setBackground(new java.awt.Color(49, 10, 76));
        jButton_editar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_editar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_editar.setText("Editar");
        jButton_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_editar);
        jButton_editar.setBounds(20, 80, 240, 50);

        jButton_Rel.setBackground(new java.awt.Color(49, 10, 76));
        jButton_Rel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Rel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Rel.setText("Gerar Relatório");
        jButton_Rel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RelActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Rel);
        jButton_Rel.setBounds(20, 260, 240, 50);

        jButton_selecionar1.setBackground(new java.awt.Color(49, 10, 76));
        jButton_selecionar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_selecionar1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_selecionar1.setText("Mostrar gráfico");
        jButton_selecionar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_selecionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selecionar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_selecionar1);
        jButton_selecionar1.setBounds(20, 320, 240, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 280, 280, 410);

        tFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "E-mail", "Gênero", "Telefone", "Endereço", "Bairro", "Cidade", "CEP", "Nacionalidade", "CNH", "Data contratado", "Período", "Empresa", "ID Departamento", "Foto", "ID Relatório", "Meta cumprida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tFuncionarios);
        if (tFuncionarios.getColumnModel().getColumnCount() > 0) {
            tFuncionarios.getColumnModel().getColumn(0).setResizable(false);
            tFuncionarios.getColumnModel().getColumn(1).setResizable(false);
            tFuncionarios.getColumnModel().getColumn(2).setResizable(false);
            tFuncionarios.getColumnModel().getColumn(3).setResizable(false);
            tFuncionarios.getColumnModel().getColumn(4).setResizable(false);
            tFuncionarios.getColumnModel().getColumn(5).setResizable(false);
            tFuncionarios.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 60, 870, 630);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TCadastro.png"))); // NOI18N
        getContentPane().add(WallPaper);
        WallPaper.setBounds(0, 0, 1200, 720);

        setSize(new java.awt.Dimension(1200, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        new THome(traducoes).setVisible(true);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesquisaActionPerformed
        // Cria um modelo de tabela padrão com base na tabela de funcionários (tFuncionarios)
        DefaultTableModel tblModel = (DefaultTableModel) this.tFuncionarios.getModel();
        // Obtém o CPF digitado e atribui como uma String
        String cpf = this.jTextField_cpf.getText();
        // Verifica se existe um funcionário com o CPF fornecido
        boolean existe = funcionario_DAO.get("SELECT * FROM funcionario WHERE cpf = ?", cpf, tblModel);
        // Se o funcionário não existe, exibe uma mensagem de erro
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "CPF não cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton_pesquisaActionPerformed


    private void jButton_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dataActionPerformed
        //Zerando a tabela antiga para inserir a nova
        DefaultTableModel tblModel = (DefaultTableModel) this.tFuncionarios.getModel();
        tblModel.setRowCount(0);
        funcionario_DAO.listar("select * from funcionario", tblModel);


    }//GEN-LAST:event_jButton_dataActionPerformed

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletarActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) this.tFuncionarios.getModel();
        try {
            String cpf = JOptionPane.showInputDialog(traducoes.getString("tpesquisa_delete"));
            if (cpf != null) {
                // Exclui o funcionário do banco de dados
                funcionario_DAO.excluir(cpf);

                // Remove a linha correspondente da tabela
                for (int i = 0; i < tblModel.getRowCount(); i++) {
                    if (tblModel.getValueAt(i, 2).equals(cpf)) { // 2 é o índice da coluna "cpf" na tabela
                        tblModel.removeRow(i);
                        break;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton_deletarActionPerformed

    private void jButton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editarActionPerformed
        String atributo = "";
        String atual = "";
        String mudanca = "";

        try {
            // Conectar ao banco de dados
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionario", "root", "naruto2001");

            // Consultar os funcionários no banco e preencher a lista
            String query = "SELECT * FROM funcionario";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Percorrer o resultado da consulta e adicionar os funcionários à lista
            while (rs.next()) {
                int idFuncionario = rs.getInt("idFuncionario");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                char genero = rs.getString("genero").charAt(0);
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String cep = rs.getString("cep");
                String nacionalidade = rs.getString("nacionalidade");
                int cnh = rs.getInt("cnh");
                LocalDate dataContratado = rs.getDate("data_contratado").toLocalDate();
                String periodo = rs.getString("periodo");
                String nomeEmpresa = rs.getString("nome_empresa");
                int idDepartamento = rs.getInt("idDepartamento");
                String foto = rs.getString("foto");
                int idRelatorios = rs.getInt("idRelatorios");
                int metaCumprida = rs.getInt("MetaCumprida");

                // Criar um objeto Funcionario com os dados do banco e adicionar à lista
                Funcionario funcionario = new Funcionario(idFuncionario, nome, cpf, email, genero, telefone, endereco, bairro,
                        cidade, cep, nacionalidade, cnh, dataContratado, periodo, nomeEmpresa, idDepartamento,
                        foto, idRelatorios, metaCumprida);
                ListaFuncionarios.add(funcionario);
            }

            // Fechar os recursos do banco de dados
            rs.close();
            stmt.close();

    boolean achou = false;
    String CPF = null;
    do {
        CPF = JOptionPane.showInputDialog("Digite o CPF do funcionário que deseja editar: ");
        if (CPF == null) {
            return;
        }

        for (Funcionario funcionario : ListaFuncionarios) {
            if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                achou = true;
                break;
            }
        }
        if (!achou) {
            JOptionPane.showMessageDialog(null, "CPF não cadastrado!", CPF, JOptionPane.ERROR_MESSAGE);
        } else {
            String opcao = JOptionPane.showInputDialog(null, "1- Nome, 2- CPF, 3- E-mail, 4- Gênero, 5- Telefone, 6- Endereço, 7- Bairro, 8- cidade, 9- CEP \n"
                    + "10- Nacionalidade, 11- CNH, 12- Data contratado, 13- Período, 14- Nome empresa, 15- Metas cumpridas.", "Escolha uma das opções!", JOptionPane.INFORMATION_MESSAGE);
            int opcaoINT = Integer.parseInt(opcao);

            if (opcaoINT>16 || opcaoINT<1){
                JOptionPane.showMessageDialog(null, "Opção inválida", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            switch (opcaoINT) {
                case 1:
                    String nomeNovo = JOptionPane.showInputDialog("Digite o novo nome.");
                    for (Funcionario funcionario : ListaFuncionarios) {
                        if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                            atual = funcionario.getNome();
                            funcionario.setNome(nomeNovo);
                            atributo = "nome";
                            mudanca = funcionario.getNome();
                        }
                    }
                    break;
                        case 2:
                            String cpfNovo = JOptionPane.showInputDialog("Digite o novo CPF.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getCpf();
                                    funcionario.setCpf(cpfNovo);
                                    atributo = "cpf";
                                    mudanca = funcionario.getCpf();
                                }
                            }
                            break;
                        case 3:
                            String emailNovo = JOptionPane.showInputDialog("Digite o novo E-mail.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getEmail();
                                    funcionario.setEmail(emailNovo);
                                    atributo = "email";
                                    mudanca = funcionario.getEmail();
                                }
                            }
                            break;
                        case 4:
                            String generoNovo = JOptionPane.showInputDialog("Digite o novo Gênero.");
                            char generoNovoChar = generoNovo.charAt(0);
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = String.valueOf(funcionario.getGenero());
                                    funcionario.setGenero(generoNovoChar);
                                    atributo = "genero";
                                    mudanca = generoNovo;
                                }
                            }
                            break;
                        case 5:
                            String telefoneNovo = JOptionPane.showInputDialog("Digite o novo telefone.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getTelefone();
                                    funcionario.setTelefone(telefoneNovo);
                                    atributo = "telefone";
                                    mudanca = funcionario.getTelefone();
                                }
                            }
                            break;
                        case 6:
                            String enderecoNovo = JOptionPane.showInputDialog("Digite o novo endereço.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getEndereco();
                                    funcionario.setEndereco(enderecoNovo);
                                    atributo = "endereco";
                                    mudanca = funcionario.getEndereco();
                                }
                            }
                            break;
                        case 7:
                            String bairroNovo = JOptionPane.showInputDialog("Digite o novo bairro.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getBairro();
                                    funcionario.setBairro(bairroNovo);
                                    atributo = "bairro";
                                    mudanca = funcionario.getBairro();
                                }
                            }
                            break;
                        case 8:
                            String cidadeNovo = JOptionPane.showInputDialog("Digite a nova cidade.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getCidade();
                                    funcionario.setCidade(cidadeNovo);
                                    atributo = "cidade";
                                    mudanca = funcionario.getCidade();
                                }
                            }
                            break;
                        case 9:
                            String cepNovo = JOptionPane.showInputDialog("Digite o novo cep.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getCep();
                                    funcionario.setCep(cepNovo);
                                    atributo = "cep";
                                    mudanca = funcionario.getCep();
                                }
                            }
                            break;
                        case 10:
                            String nacionalidadeNova = JOptionPane.showInputDialog("Digite a nova nacionalidade.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getNacionalidade();
                                    funcionario.setNacionalidade(nacionalidadeNova);
                                    atributo = "nacionalidade";
                                    mudanca = funcionario.getNacionalidade();
                                }
                            }
                            break;
                        case 11:
                            String cnhNovo = JOptionPane.showInputDialog("Digite se este possui ou não CNH: 0- não/1- Sim.");
                            int cnhNovoINT = Integer.parseInt(cnhNovo);
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = String.valueOf(funcionario.getCnh());
                                    funcionario.setCnh(cnhNovoINT);
                                    atributo = "cnh";
                                    mudanca = cnhNovo;
                                }
                            }
                            break;
                        case 12:
                            String dataNova = JOptionPane.showInputDialog("Digite a nova data de contratação (formato: yyyy-MM-dd).");
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getData_contrtado().format(formatter);
                                    LocalDate localDate = LocalDate.parse(dataNova, formatter);
                                    funcionario.setData_contrtado(localDate);
                                    atributo = "data_contratado";
                                    mudanca = dataNova;
                                }
                            }
                            break;
                        case 13:
                            String periodoNovo = JOptionPane.showInputDialog("Digite o novo período.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getPeriodo();
                                    funcionario.setPeriodo(periodoNovo);
                                    atributo = "periodo";
                                    mudanca = funcionario.getPeriodo();
                                }
                            }
                            break;
                        case 14:
                            String nomeEmpresaNovo = JOptionPane.showInputDialog("Digite o nome da empresa.");
                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = funcionario.getNome_empresa();
                                    funcionario.setNome_empresa(nomeEmpresaNovo);
                                    atributo = "nome_empresa";
                                    mudanca = funcionario.getNome_empresa();
                                }
                            }
                            break;
                        case 15:
                            int metasNovasINT;
                            String metasNovas = null;
                            do {
                                metasNovas = JOptionPane.showInputDialog("Digite a quantidade de metas a serem cumpridas (máximo 2):");
                                metasNovasINT = Integer.parseInt(metasNovas);
                            } while (metasNovasINT > 2 || metasNovasINT < 0);

                            for (Funcionario funcionario : ListaFuncionarios) {
                                if (funcionario.getCpf().equalsIgnoreCase(CPF)) {
                                    atual = String.valueOf(funcionario.getMetaCumprida());
                                    funcionario.setMetaCumprida(metasNovasINT);
                                    atributo = "MetaCumprida";
                                    mudanca = metasNovas;
                                    System.out.println(funcionario.getMetaCumprida());
                                }
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } while (!achou);

            // Zerando a tabela antiga para inserir a nova
            DefaultTableModel model = (DefaultTableModel) tFuncionarios.getModel();
            model.setRowCount(0);

            // Conexão com o banco de dados MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionario", "root", "naruto2001");

            // Query SQL específica para atualizar o atributo desejado
            String sql = "";
            switch (atributo) {
                case "nome":
                    sql = "UPDATE funcionario SET nome=? WHERE cpf=?";
                    break;
                case "cpf":
                    sql = "UPDATE funcionario SET cpf=? WHERE cpf=?";
                    break;
                case "email":
                    sql = "UPDATE funcionario SET email=? WHERE cpf=?";
                    break;
                case "genero":
                    sql = "UPDATE funcionario SET genero=? WHERE cpf=?";
                    break;
                case "telefone":
                    sql = "UPDATE funcionario SET telefone=? WHERE cpf=?";
                    break;
                case "endereco":
                    sql = "UPDATE funcionario SET endereco=? WHERE cpf=?";
                    break;
                case "bairro":
                    sql = "UPDATE funcionario SET bairro=? WHERE cpf=?";
                    break;
                case "cidade":
                    sql = "UPDATE funcionario SET cidade=? WHERE cpf=?";
                    break;
                case "cep":
                    sql = "UPDATE funcionario SET cep=? WHERE cpf=?";
                    break;
                case "nacionalidade":
                    sql = "UPDATE funcionario SET nacionalidade=? WHERE cpf=?";
                    break;
                case "cnh":
                    sql = "UPDATE funcionario SET cnh=? WHERE cpf=?";
                    break;
                case "data_contratado":
                    sql = "UPDATE funcionario SET data_contratado=? WHERE cpf=?";
                    break;
                case "periodo":
                    sql = "UPDATE funcionario SET periodo=? WHERE cpf=?";
                    break;
                case "nome_empresa":
                    sql = "UPDATE funcionario SET nome_empresa=? WHERE cpf=?";
                    break;
                case "MetaCumprida":
                    sql = "UPDATE funcionario SET MetaCumprida=? WHERE cpf=?";
                    break;
                default:
                    break;
            }

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, mudanca); // Novo valor do atributo
            pst.setString(2, CPF); // CPF do funcionário

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                // Se a atualização for bem-sucedida, atualize a JTable aqui.
                DefaultTableModel tblModel = (DefaultTableModel) tFuncionarios.getModel();
                tblModel.setRowCount(0); // Limpa a tabela antes de adicionar novos dados
                // Restante do código para atualizar a JTable...
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
            }
            JOptionPane.showMessageDialog(null, "Update realizado com sucesso!", "UPDATE", JOptionPane.INFORMATION_MESSAGE);
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
}

private String obterNovoValor(Funcionario funcionario, int opcao) {
    String novoValor = null;
    switch (opcao) {
        case 1:
            novoValor = JOptionPane.showInputDialog("Digite o novo nome:", funcionario.getNome());
            break;
        case 2:
            novoValor = JOptionPane.showInputDialog("Digite o novo CPF:", funcionario.getCpf());
            break;
        case 3:
            novoValor = JOptionPane.showInputDialog("Digite o novo E-mail:", funcionario.getEmail());
            break;
        // Adicione os demais casos aqui...
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida.", "ERRO", JOptionPane.ERROR_MESSAGE);
            break;
    }
    return novoValor;
}

private String obterAtributo(int opcao) {
    String atributo = null;
    switch (opcao) {
        case 1:
            atributo = "nome";
            break;
        case 2:
            atributo = "cpf";
            break;
        case 3:
            atributo = "email";
            break;
        // Adicione os demais casos aqui...
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida.", "ERRO", JOptionPane.ERROR_MESSAGE);
            break;
                
    }//GEN-LAST:event_jButton_editarActionPerformed
        return atributo;
    }

    private void jButton_cadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cadastro1ActionPerformed
        dispose();
        new TCadastro(traducoes).setVisible(true);
    }//GEN-LAST:event_jButton_cadastro1ActionPerformed

    /**
     * Gera um relatório dos funcionários. Utiliza a classe MessageFormat para
     * definir o cabeçalho e o rodapé do relatório. Configura a orientação da
     * página como paisagem. Imprime o relatório da tabela de funcionários.
     * Exibe uma mensagem de sucesso caso o relatório seja gerado com sucesso.
     * Exibe uma mensagem de erro caso ocorra um erro ao gerar o relatório.
     */
    public void relFuncionario() {
        MessageFormat header = new MessageFormat(traducoes.getString("tpesquisa_rel"));
        MessageFormat footer = new MessageFormat("Connect Data 1.2.1");

        try {
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.LANDSCAPE);
            tFuncionarios.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
            JOptionPane.showMessageDialog(null, traducoes.getString("tpesquisa_joption1"), "Connect Data 1.2.1", JOptionPane.INFORMATION_MESSAGE);

        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(null, traducoes.getString("tpesquisa_joption1.2"), "Connect Data 1.2.1 - ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jButton_RelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RelActionPerformed
        relFuncionario();

    }//GEN-LAST:event_jButton_RelActionPerformed

    private void jButton_selecionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selecionar1ActionPerformed
        DefaultPieDataset objeto = new DefaultPieDataset(); 
        int totalRH = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1", "total"));
        int totalF = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2", "total"));
        int totalM = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3", "total"));
        int totalV = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4", "total"));
        int totalP = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5", "total"));
        objeto.setValue("Recursos Humanos:"+totalRH, totalRH);
        objeto.setValue("Finanças:"+totalF, totalF);
        objeto.setValue("Marketing:"+totalM, totalM);
        objeto.setValue("Vendas:"+totalV, totalV);
        objeto.setValue("Produção:"+totalP, totalP);

        JFreeChart chart = ChartFactory.createPieChart("Total funcionários: "+funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario", "total"), objeto, true, true, true);
        ChartFrame frame = new ChartFrame("Departamentos",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_jButton_selecionar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WallPaper;
    private javax.swing.JButton jButton_Rel;
    private javax.swing.JButton jButton_cadastro1;
    private javax.swing.JButton jButton_data;
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JButton jButton_editar;
    private javax.swing.JButton jButton_pesquisa;
    private javax.swing.JButton jButton_selecionar1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_cpf;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JTable tFuncionarios;
    // End of variables declaration//GEN-END:variables
}
