
import Classes.Funcionario;
import DAO.Funcionario_DAO;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public final class TDepartamento extends javax.swing.JFrame {

    private static ResourceBundle traducoes;

    private ArrayList<Funcionario> ListaFuncionarios;
    private Funcionario_DAO funcionario_DAO = new Funcionario_DAO();

    public TDepartamento(ResourceBundle traducoes) {
        ListaFuncionarios = new ArrayList<>();
        initComponents();
        DefaultTableModel tblModel = (DefaultTableModel) this.tFuncionarios.getModel();
        funcionario_DAO.listar("select * from funcionario", tblModel);
        TDepartamento.traducoes = traducoes;
        traduzir();
    }

    public void traduzir() {
        this.labeID.setText(TDepartamento.traducoes.getString("tdepartamento_titulo1"));
        this.labelDepart.setText(TDepartamento.traducoes.getString("tdepartamento_titulo2"));
        this.labelMetaC.setText(TDepartamento.traducoes.getString("tdepartamento_titulo3"));
        this.labelDescricao.setText(TDepartamento.traducoes.getString("tdepartamento_titulo4"));
        this.jButton_selecionar.setText(TDepartamento.traducoes.getString("tdepartamento_botao"));
        this.jButton_selecionar1.setText(TDepartamento.traducoes.getString("tdepartamento_grafico"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tFuncionarios = new javax.swing.JTable();
        StrMeta = new javax.swing.JTextField();
        StrID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        StrDesc = new javax.swing.JTextArea();
        StrDepart = new javax.swing.JTextField();
        labeID = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        labelMetaC = new javax.swing.JLabel();
        labelDepart = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jButton_selecionar = new javax.swing.JButton();
        jButton_selecionar1 = new javax.swing.JButton();
        WallPaper = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

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
        getContentPane().add(tFuncionarios);
        tFuncionarios.setBounds(290, 30, 890, 630);

        StrMeta.setEditable(false);
        StrMeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrMetaKeyTyped(evt);
            }
        });
        getContentPane().add(StrMeta);
        StrMeta.setBounds(20, 390, 260, 24);

        StrID.setEditable(false);
        StrID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StrIDKeyTyped(evt);
            }
        });
        getContentPane().add(StrID);
        StrID.setBounds(20, 290, 260, 24);

        StrDesc.setEditable(false);
        StrDesc.setColumns(20);
        StrDesc.setRows(5);
        StrDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(StrDesc);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 440, 260, 210);

        StrDepart.setEditable(false);
        getContentPane().add(StrDepart);
        StrDepart.setBounds(20, 340, 260, 24);

        labeID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labeID.setForeground(new java.awt.Color(255, 255, 255));
        labeID.setText("ID Departamento:");
        getContentPane().add(labeID);
        labeID.setBounds(20, 270, 160, 20);

        labelDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDescricao.setForeground(new java.awt.Color(255, 255, 255));
        labelDescricao.setText("Descrição:");
        getContentPane().add(labelDescricao);
        labelDescricao.setBounds(20, 420, 110, 20);

        labelMetaC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelMetaC.setForeground(new java.awt.Color(255, 255, 255));
        labelMetaC.setText("Total meta cumprida:");
        getContentPane().add(labelMetaC);
        labelMetaC.setBounds(20, 370, 170, 20);

        labelDepart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDepart.setForeground(new java.awt.Color(255, 255, 255));
        labelDepart.setText("Departamento:");
        getContentPane().add(labelDepart);
        labelDepart.setBounds(20, 320, 140, 20);

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

        jButton_selecionar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_selecionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_selecionar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_selecionar.setText("Buscar Departamento");
        jButton_selecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selecionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_selecionar);
        jButton_selecionar.setBounds(20, 660, 260, 40);

        jButton_selecionar1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_selecionar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_selecionar1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_selecionar1.setText("Mostrar gráfico");
        jButton_selecionar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_selecionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selecionar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_selecionar1);
        jButton_selecionar1.setBounds(920, 670, 260, 40);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TCadastro.png"))); // NOI18N
        getContentPane().add(WallPaper);
        WallPaper.setBounds(0, 0, 1200, 720);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 10, 880, 670);

        setSize(new java.awt.Dimension(1200, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        new THome(traducoes).setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void jButton_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selecionarActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) this.tFuncionarios.getModel();
        
        //Não consegui traduzir esse JOptionPane
        String opcao = JOptionPane.showInputDialog(traducoes.getString("tdepartamento_joption1")+"\n"+traducoes.getString("tdepartamento_joption1.2")
        +"\n"+traducoes.getString("tdepartamento_joption1.3")+"\n"+traducoes.getString("tdepartamento_joption1.4")+"\n"
                +traducoes.getString("tdepartamento_joption1.5")+"\n"
                +traducoes.getString("tdepartamento_joption1.6"));
        int opcaoINT = Integer.valueOf(opcao);
        if (opcaoINT > 5 || opcaoINT < 1) {
            JOptionPane.showMessageDialog(null, traducoes.getString("tdepartamento_joption2"), "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            switch (opcaoINT) {
                case 1:
                    this.StrID.setText("1");
                    this.StrDepart.setText("Recursos humanos");
                    this.StrDesc.setText("RH recruta, desenvolve e mantém funcionários para o sucesso organizacional.");
                    this.StrMeta.setText(String.valueOf(funcionario_DAO.Consulta("SELECT SUM(MetaCumprida) AS total_metacumprida FROM funcionario WHERE "
                            + "idDepartamento = 1", "total_metacumprida")));
                    tblModel.setRowCount(0);
                    funcionario_DAO.listar("select * from funcionario WHERE idDepartamento = 1", tblModel);
                    break;
                case 2:
                    this.StrID.setText("2");
                    this.StrDepart.setText("Finanças");
                    this.StrDesc.setText("Finanças gerenciam recursos, alocações, custos e desempenho financeiro.");
                    this.StrMeta.setText(String.valueOf(funcionario_DAO.Consulta("SELECT SUM(MetaCumprida) AS total_metacumprida FROM funcionario WHERE "
                            + "idDepartamento = 2", "total_metacumprida")));
                    tblModel.setRowCount(0);
                    funcionario_DAO.listar("select * from funcionario WHERE idDepartamento = 2", tblModel);
                    break;
                case 3:
                    this.StrID.setText("3");
                    this.StrDepart.setText("Marketing");
                    this.StrDesc.setText("Marketing promove produtos, atrai clientes e fortalece a marca.");
                    this.StrMeta.setText(String.valueOf(funcionario_DAO.Consulta("SELECT SUM(MetaCumprida) AS total_metacumprida FROM funcionario WHERE "
                            + "idDepartamento = 3", "total_metacumprida")));
                    tblModel.setRowCount(0);
                    funcionario_DAO.listar("select * from funcionario WHERE idDepartamento = 3", tblModel);
                    break;

                case 4:
                    this.StrID.setText("4");
                    this.StrDepart.setText("Vendas");
                    this.StrDesc.setText("Vendas impulsionam receitas, fechando negócios e cultivando relacionamentos.");
                    this.StrMeta.setText(String.valueOf(funcionario_DAO.Consulta("SELECT SUM(MetaCumprida) AS total_metacumprida FROM funcionario WHERE "
                            + "idDepartamento = 4", "total_metacumprida")));
                    tblModel.setRowCount(0);
                    funcionario_DAO.listar("select * from funcionario WHERE idDepartamento = 4", tblModel);
                    break;
                case 5:
                    
                    this.StrID.setText("5");
                    this.StrDepart.setText("Produção");
                    this.StrDesc.setText("Produção fabrica produtos de alta qualidade com eficiência operacional.");
                    this.StrMeta.setText(String.valueOf(funcionario_DAO.Consulta("SELECT SUM(MetaCumprida) AS total_metacumprida FROM funcionario WHERE "
                            + "idDepartamento = 5", "total_metacumprida")));
                    tblModel.setRowCount(0);
                    funcionario_DAO.listar("select * from funcionario WHERE idDepartamento = 5", tblModel);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }//GEN-LAST:event_jButton_selecionarActionPerformed

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

    private void jButton_selecionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selecionar1ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int cnh = 0;
        int scnh = 0;
        int h = 0;
        int m = 0;
        int b = 0;
        int op = 0;
        int i = 0;
        int mp = 0;
        
        
        switch (this.StrID.getText()) {
            case "1":
                dataset.setValue(cnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1 and cnh=1", "total")), "marks", "Possui CNH");
                dataset.setValue(scnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1 and cnh=0", "total")) , "marks", "Sem CNH");
                dataset.setValue(h = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1 and genero='M'", "total")), "marks", "Homens");
                dataset.setValue(m = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1 and genero='F'", "total")), "marks", "Mulheres");
                dataset.setValue(b = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1 and nacionalidade='Brasileiro'", "total")), "marks", "Brasileiros");
                dataset.setValue(op = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1 and nacionalidade!='Brasileiro'", "total")), "marks", "Outros países");
                dataset.setValue(i = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1 and periodo='Integral'", "total")), "marks", "Integral");
                dataset.setValue(mp = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 1 and periodo='Meio período'", "total")), "marks", "Meio-período");
                JFreeChart chart2 = ChartFactory.createBarChart("Dados", "Categorias", "Funcionários", dataset, PlotOrientation.VERTICAL, false, true, false);
                CategoryPlot p = chart2.getCategoryPlot();
                p.setRangeGridlinePaint(Color.black);
                ChartFrame frame2 =new ChartFrame("Recursos humanos",chart2);
                frame2.setVisible(true);
                frame2.setSize(950,750);
                break;
            case "2":
                dataset.setValue(cnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2 and cnh=1", "total")), "marks", "Possui CNH");
                dataset.setValue(scnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2 and cnh=0", "total")) , "marks", "Sem CNH");
                dataset.setValue(h = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2 and genero='M'", "total")), "marks", "Homens");
                dataset.setValue(m = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2 and genero='F'", "total")), "marks", "Mulheres");
                dataset.setValue(b = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2 and nacionalidade='Brasileiro'", "total")), "marks", "Brasileiros");
                dataset.setValue(op = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2 and nacionalidade!='Brasileiro'", "total")), "marks", "Outros países");
                dataset.setValue(i = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2 and periodo='Integral'", "total")), "marks", "Integral");
                dataset.setValue(mp = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 2 and periodo='Meio período'", "total")), "marks", "Meio-período");
                chart2 = ChartFactory.createBarChart("Dados", "Categorias", "Funcionários", dataset, PlotOrientation.VERTICAL, false, true, false);
                p = chart2.getCategoryPlot();
                p.setRangeGridlinePaint(Color.black);
                frame2 =new ChartFrame("Finanças",chart2);
                frame2.setVisible(true);
                frame2.setSize(950,750);
                break;
            case "3":
                dataset.setValue(cnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3 and cnh=1", "total")), "marks", "Possui CNH");
                dataset.setValue(scnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3 and cnh=0", "total")) , "marks", "Sem CNH");
                dataset.setValue(h = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3 and genero='M'", "total")), "marks", "Homens");
                dataset.setValue(m = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3 and genero='F'", "total")), "marks", "Mulheres");
                dataset.setValue(b = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3 and nacionalidade='Brasileiro'", "total")), "marks", "Brasileiros");
                dataset.setValue(op = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3 and nacionalidade!='Brasileiro'", "total")), "marks", "Outros países");
                dataset.setValue(i = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3 and periodo='Integral'", "total")), "marks", "Integral");
                dataset.setValue(mp = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 3 and periodo='Meio período'", "total")), "marks", "Meio-período");
                chart2 = ChartFactory.createBarChart("Dados", "Categorias", "Funcionários", dataset, PlotOrientation.VERTICAL, false, true, false);
                p = chart2.getCategoryPlot();
                p.setRangeGridlinePaint(Color.black);
                frame2 =new ChartFrame("Marketing",chart2);
                frame2.setVisible(true);
                frame2.setSize(950,750);
                break;
            case "4":
                dataset.setValue(cnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4 and cnh=1", "total")), "marks", "Possui CNH");
                dataset.setValue(scnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4 and cnh=0", "total")) , "marks", "Sem CNH");
                dataset.setValue(h = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4 and genero='M'", "total")), "marks", "Homens");
                dataset.setValue(m = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4 and genero='F'", "total")), "marks", "Mulheres");
                dataset.setValue(b = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4 and nacionalidade='Brasileiro'", "total")), "marks", "Brasileiros");
                dataset.setValue(op = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4 and nacionalidade!='Brasileiro'", "total")), "marks", "Outros países");
                dataset.setValue(i = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4 and periodo='Integral'", "total")), "marks", "Integral");
                dataset.setValue(mp = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 4 and periodo='Meio período'", "total")), "marks", "Meio-período");
                chart2 = ChartFactory.createBarChart("Dados", "Categorias", "Funcionários", dataset, PlotOrientation.VERTICAL, false, true, false);
                p = chart2.getCategoryPlot();
                p.setRangeGridlinePaint(Color.black);
                frame2 =new ChartFrame("Vendas",chart2);
                frame2.setVisible(true);
                frame2.setSize(950,750);
                break;
            case "5":
                dataset.setValue(cnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5 and cnh=1", "total")), "marks", "Possui CNH");
                dataset.setValue(scnh = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5 and cnh=0", "total")) , "marks", "Sem CNH");
                dataset.setValue(h = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5 and genero='M'", "total")), "marks", "Homens");
                dataset.setValue(m = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5 and genero='F'", "total")), "marks", "Mulheres");
                dataset.setValue(b = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5 and nacionalidade='Brasileiro'", "total")), "marks", "Brasileiros");
                dataset.setValue(op = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5 and nacionalidade!='Brasileiro'", "total")), "marks", "Outros países");
                dataset.setValue(i = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5 and periodo='Integral'", "total")), "marks", "Integral");
                dataset.setValue(mp = Integer.parseInt(funcionario_DAO.Consulta("SELECT COUNT(*) AS total FROM funcionario where idDepartamento = 5 and periodo='Meio período'", "total")), "marks", "Meio-período");
                chart2 = ChartFactory.createBarChart("Dados", "Categorias", "Funcionários", dataset, PlotOrientation.VERTICAL, false, true, false);
                p = chart2.getCategoryPlot();
                p.setRangeGridlinePaint(Color.black);
                frame2 =new ChartFrame("Produção",chart2);
                frame2.setVisible(true);
                frame2.setSize(950,750);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha um departamento para gerar o relatório.", "DATA", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    
    
    
    
    }//GEN-LAST:event_jButton_selecionar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrDepart;
    private javax.swing.JTextArea StrDesc;
    private javax.swing.JTextField StrID;
    private javax.swing.JTextField StrMeta;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton_selecionar;
    private javax.swing.JButton jButton_selecionar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeID;
    private javax.swing.JLabel labelDepart;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelMetaC;
    private javax.swing.JTable tFuncionarios;
    // End of variables declaration//GEN-END:variables
}
