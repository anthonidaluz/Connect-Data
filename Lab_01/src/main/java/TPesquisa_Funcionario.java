import Classes.Banco;
import Classes.Funcionario;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class TPesquisa_Funcionario extends javax.swing.JFrame {
    
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private Banco banco = new Banco();
    private ArrayList<Funcionario> ListaFuncionarios;
    
    public TPesquisa_Funcionario() {
        ListaFuncionarios = new ArrayList<>();
        initComponents();
        //Pegando os dados no banco de dados MYSQL
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionario","root","naruto2001");
       
            Statement st = con.createStatement();
            String sql = "select * from funcionario";
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                Funcionario funcionario = new Funcionario();
                String id = String.valueOf(rs.getInt("idFuncionario"));
                int idINT = Integer.parseInt(id);
                funcionario.setIdFuncionário(idINT);
                
                String nome = String.valueOf(rs.getString("nome"));
                funcionario.setNome(nome);
                
                String cpf = String.valueOf(rs.getString("cpf"));
                funcionario.setCpf(cpf);
                
                String email = String.valueOf(rs.getString("email"));
                funcionario.setEmail(email);
                
                String genero = String.valueOf(rs.getString("genero"));
                char generoC = genero.charAt(0);
                funcionario.setGenero(generoC);
                
                String telefone = String.valueOf(rs.getString("telefone"));
                funcionario.setTelefone(telefone);
                
                String endereco = String.valueOf(rs.getString("endereco"));
                funcionario.setEndereco(endereco);
                
                String bairro = String.valueOf(rs.getString("bairro"));
                funcionario.setBairro(bairro);
                
                String cidade = String.valueOf(rs.getString("cidade"));
                funcionario.setCidade(cidade);
                
                String cep = String.valueOf(rs.getString("cep"));
                funcionario.setCep(cep);
                
                String nacionalidade = String.valueOf(rs.getString("nacionalidade"));
                funcionario.setNacionalidade(nacionalidade);
                
                String cnh = String.valueOf(rs.getInt("cnh"));
                int cnhINT = Integer.parseInt(cnh);
                funcionario.setCnh(cnhINT);
                
                
                String dataContratado = rs.getString("data_contrtado");
                LocalDate data_contratado = LocalDate.parse(dataContratado, formatador);
                funcionario.setData_contrtado(data_contratado);
                
                String periodo = String.valueOf(rs.getString("periodo"));
                funcionario.setPeriodo(periodo);
                
                String empresa = String.valueOf(rs.getString("nome_empresa"));
                funcionario.setNome_empresa(empresa);
                
                String idDepartamento = String.valueOf(rs.getInt("idDepartamento"));
                int idD = Integer.parseInt(idDepartamento);
                funcionario.setIdDepartamento(idD);
                
                String foto = String.valueOf(rs.getString("foto"));
                funcionario.setFoto(foto);
                
                String idRelatorios = String.valueOf(rs.getInt("idRelatorios"));
                int idR = Integer.parseInt(idRelatorios);
                funcionario.setIdRelatorios(idR);
                
                String MetaCumprida = String.valueOf(rs.getInt("MetaCumprida"));
                int meta = Integer.parseInt(MetaCumprida);
                funcionario.setMetaCumprida(meta);
                
                ListaFuncionarios.add(funcionario);
                String tbData [] = {id,nome,cpf,email,genero,telefone,endereco,bairro,cidade,cep,nacionalidade,
                    cnh,dataContratado,periodo,empresa,idDepartamento,foto,idRelatorios,MetaCumprida};
                DefaultTableModel tblModel = (DefaultTableModel)this.tFuncionarios.getModel();
                
                tblModel.addRow(tbData);
                
            }
            
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_pesquisa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_cpf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton_data = new javax.swing.JButton();
        jButton_deletar = new javax.swing.JButton();
        jButton_cadastro1 = new javax.swing.JButton();
        jButton_editar = new javax.swing.JButton();
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
        jLabel6.setBounds(20, 238, 100, 20);

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
        jButton_pesquisa.setBounds(980, 20, 200, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 20, 40, 17);
        getContentPane().add(jTextField_cpf);
        jTextField_cpf.setBounds(370, 20, 560, 22);

        jPanel1.setLayout(null);

        jButton_data.setBackground(new java.awt.Color(49, 10, 76));
        jButton_data.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton_data.setForeground(new java.awt.Color(255, 255, 255));
        jButton_data.setText("Mostrar Data");
        jButton_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dataActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_data);
        jButton_data.setBounds(20, 320, 240, 70);

        jButton_deletar.setBackground(new java.awt.Color(49, 10, 76));
        jButton_deletar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton_deletar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_deletar.setText("Deletar");
        jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_deletar);
        jButton_deletar.setBounds(20, 220, 240, 70);

        jButton_cadastro1.setBackground(new java.awt.Color(49, 10, 76));
        jButton_cadastro1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton_cadastro1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cadastro1.setText("Cadastrar");
        jButton_cadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cadastro1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_cadastro1);
        jButton_cadastro1.setBounds(20, 13, 240, 70);

        jButton_editar.setBackground(new java.awt.Color(49, 10, 76));
        jButton_editar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton_editar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_editar.setText("Editar");
        jButton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_editar);
        jButton_editar.setBounds(20, 110, 240, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 260, 280, 410);

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
                false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true
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
        jScrollPane1.setBounds(320, 60, 860, 620);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TCadastro.png"))); // NOI18N
        getContentPane().add(WallPaper);
        WallPaper.setBounds(0, 0, 1200, 720);

        setSize(new java.awt.Dimension(1200, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        new THome().setVisible(true);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesquisaActionPerformed
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionario","root","naruto2001");
            String cpf = this.jTextField_cpf.getText();

            String sql = "SELECT * FROM funcionario WHERE cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);

            ResultSet rs = pst.executeQuery();

            if(rs.next()) {
                // Se a consulta retornar um resultado, atualize a JTable aqui.
                DefaultTableModel tblModel = (DefaultTableModel)tFuncionarios.getModel();
                tblModel.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

                do {
                    String tbData[] = {
                        String.valueOf(rs.getInt("idFuncionario")),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("genero"),
                        rs.getString("telefone"),
                        rs.getString("endereco"),
                        rs.getString("bairro"),
                        rs.getString("cidade"),
                        rs.getString("cep"),
                        rs.getString("nacionalidade"),
                        String.valueOf(rs.getInt("cnh")),
                        rs.getString("data_contrtado"),
                        rs.getString("periodo"),
                        rs.getString("nome_empresa"),
                        String.valueOf(rs.getInt("idDepartamento")),
                        rs.getString("foto"),
                        String.valueOf(rs.getInt("idRelatorios")),
                        String.valueOf(rs.getInt("MetaCumprida"))
                    };

                    tblModel.addRow(tbData);
                } while(rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
            }

            con.close();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton_pesquisaActionPerformed

    private void jButton_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dataActionPerformed
        //Zerando a tabela antiga para inserir a nova
        DefaultTableModel model = (DefaultTableModel) this.tFuncionarios.getModel();
        model.setRowCount(0); 
        //Pegando os dados no banco de dados MYSQL
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionario","root","naruto2001");
       
            Statement st = con.createStatement();
            String sql = "select * from funcionario";
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                String id = String.valueOf(rs.getInt("idFuncionario"));
                String nome = String.valueOf(rs.getString("nome"));
                String cpf = String.valueOf(rs.getString("cpf"));
                String email = String.valueOf(rs.getString("email"));
                String genero = String.valueOf(rs.getString("genero"));
                String telefone = String.valueOf(rs.getString("telefone"));
                String endereco = String.valueOf(rs.getString("endereco"));
                String bairro = String.valueOf(rs.getString("bairro"));
                String cidade = String.valueOf(rs.getString("cidade"));
                String cep = String.valueOf(rs.getString("cep"));
                String nacionalidade = String.valueOf(rs.getString("nacionalidade"));
                String cnh = String.valueOf(rs.getInt("cnh"));
                String dataContratado = String.valueOf(rs.getString("data_contrtado"));
                String periodo = String.valueOf(rs.getString("periodo"));
                String empresa = String.valueOf(rs.getString("nome_empresa"));
                String idDepartamento = String.valueOf(rs.getInt("idDepartamento"));
                String foto = String.valueOf(rs.getString("foto"));
                String idRelatorios = String.valueOf(rs.getInt("idRelatorios"));
                String MetaCumprida = String.valueOf(rs.getInt("MetaCumprida"));
                
                
                String tbData [] = {id,nome,cpf,email,genero,telefone,endereco,bairro,cidade,cep,nacionalidade,
                    cnh,dataContratado,periodo,empresa,idDepartamento,foto,idRelatorios,MetaCumprida};
                DefaultTableModel tblModel = (DefaultTableModel)this.tFuncionarios.getModel();
                
                tblModel.addRow(tbData);
            }
            
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }        

        
    }//GEN-LAST:event_jButton_dataActionPerformed

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletarActionPerformed
    try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionario","root","naruto2001");
    String cpf;
    boolean cpfEncontrado = false;
    int option;
    do {
        cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa que deseja deletar do sistema, ou clique em Cancelar para sair:");
        if (cpf == null) {
            return;
        }
        cpfEncontrado = false;
        for (Funcionario funcionario : ListaFuncionarios) {
            if(funcionario.getCpf().equalsIgnoreCase(cpf)){
                cpfEncontrado = true;
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja deletar o funcionário?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(resposta == JOptionPane.YES_OPTION){
                    String sql = "DELETE FROM funcionario WHERE cpf = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, cpf);

                    int rowsAffected = pst.executeUpdate();

                    if(rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Funcionário deletado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao deletar funcionário.");
                    }
                    // Como encontrou o CPF e já tomou a ação, sair do loop
                    break;
                } else {
                    // Caso o usuário não queira deletar, apenas sair do loop
                    break;
                }
            }
        }
        if (!cpfEncontrado) {
            JOptionPane.showMessageDialog(null, "CPF não encontrado. Por favor, digite novamente.");
        }
    } while (!cpfEncontrado);

        con.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_jButton_deletarActionPerformed

    private void jButton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editarActionPerformed
        String atributo = "";
        String atual = "";
        String mudanca = "";
        try {
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
                            String dataNova = JOptionPane.showInputDialog("Digite a nova data de contratação (formato: dd/MM/yyyy).");
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
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
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionario", "root", "naruto2001");

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
                    sql = "UPDATE funcionario SET data_contrtado=? WHERE cpf=?";
                    break;
                case "periodo":
                    sql = "UPDATE funcionario SET periodo=? WHERE cpf=?";
                    break;
                case "nome_empresa":
                    sql = "UPDATE funcionario SET nome_empresa=? WHERE cpf=?";
                    break;
                case "MetaCumprida":
                    sql = "UPDATE funcionario SET meta_cumprida=? WHERE cpf=?";
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
    }//GEN-LAST:event_jButton_editarActionPerformed

    private void jButton_cadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cadastro1ActionPerformed
        
    }//GEN-LAST:event_jButton_cadastro1ActionPerformed

    public void setColor(JPanel p) {
        p.setBackground(new Color(90, 74, 143));
    }

    public void resetColor(JPanel p) {
        p.setBackground(new Color(49, 10, 76));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WallPaper;
    private javax.swing.JButton jButton_cadastro1;
    private javax.swing.JButton jButton_data;
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JButton jButton_editar;
    private javax.swing.JButton jButton_pesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_cpf;
    private javax.swing.JTable tFuncionarios;
    // End of variables declaration//GEN-END:variables
}
