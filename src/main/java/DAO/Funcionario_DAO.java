package DAO;

import Classes.Banco;
import Classes.Funcionario;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Funcionario_DAO implements Dao<Funcionario> {

    //Como  envolve etapas do bd não consegui realizar a tradução para refletir nas outras telas
    
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private Banco banco;
    private Funcionario funcionario;

    public Funcionario_DAO() {
        this.banco = new Banco();

    }

    
    @Override
    public Funcionario Adicionar(String sql, Funcionario t) {
        try {

            PreparedStatement pst = banco.Con().prepareStatement(sql);
            pst.setString(1, t.getNome());
            pst.setString(2, t.getCpf());
            pst.setString(3, t.getEmail());
            pst.setString(4, String.valueOf(t.getGenero()));
            pst.setString(5, t.getTelefone());
            pst.setString(6, t.getEndereco());
            pst.setString(7, t.getBairro());
            pst.setString(8, t.getCidade());
            pst.setString(9, t.getCep());
            pst.setString(10, t.getNacionalidade());
            pst.setInt(11, t.getCnh());
            pst.setString(12, t.getData_contrtado().format(formatador)); // Formatação para String conforme o formato desejado
            pst.setString(13, t.getPeriodo());
            pst.setString(14, t.getNome_empresa());
            pst.setInt(15, t.getIdDepartamento());
            pst.setString(16, "x");
            pst.setInt(17, t.getIdRelatorios());
            pst.setInt(18, t.getMetaCumprida());

            pst.executeUpdate();
            //não consegui traduzir
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!", "Connect Data - 1.2.1", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //não consegui traduzir
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Funcionario", "Connect Data - 1.2.1", JOptionPane.ERROR_MESSAGE);

        }
        return (funcionario);
    }

    @Override
    public void listar(String sql, DefaultTableModel tblModel) {
        try {
            Statement st = banco.Conexao();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                int idINT = rs.getInt("idFuncionario");
                funcionario.setIdFuncionário(idINT);

                String nome = rs.getString("nome");
                funcionario.setNome(nome);

                String cpf = rs.getString("cpf");
                funcionario.setCpf(cpf);

                String email = rs.getString("email");
                funcionario.setEmail(email);

                char generoC = rs.getString("genero").charAt(0);
                funcionario.setGenero(generoC);

                String telefone = rs.getString("telefone");
                funcionario.setTelefone(telefone);

                String endereco = rs.getString("endereco");
                funcionario.setEndereco(endereco);

                String bairro = rs.getString("bairro");
                funcionario.setBairro(bairro);

                String cidade = rs.getString("cidade");
                funcionario.setCidade(cidade);

                String cep = rs.getString("cep");
                funcionario.setCep(cep);

                String nacionalidade = rs.getString("nacionalidade");
                funcionario.setNacionalidade(nacionalidade);

                int cnhINT = rs.getInt("cnh");
                funcionario.setCnh(cnhINT);

                LocalDate data_contratado = LocalDate.parse(rs.getString("data_contratado"), formatador);
                funcionario.setData_contrtado(data_contratado);

                String periodo = rs.getString("periodo");
                funcionario.setPeriodo(periodo);

                String empresa = rs.getString("nome_empresa");
                funcionario.setNome_empresa(empresa);

                int idD = rs.getInt("idDepartamento");
                funcionario.setIdDepartamento(idD);

                String foto = rs.getString("foto");
                funcionario.setFoto(foto);

                int idR = rs.getInt("idRelatorios");
                funcionario.setIdRelatorios(idR);

                int meta = rs.getInt("MetaCumprida");
                funcionario.setMetaCumprida(meta);

                String tbData[] = {String.valueOf(idINT), nome, cpf, email, String.valueOf(generoC), telefone, endereco, bairro, cidade, cep, nacionalidade, String.valueOf(cnhINT), data_contratado.toString(), periodo, empresa, String.valueOf(idD), foto, String.valueOf(idR), String.valueOf(meta)};
                tblModel.addRow(tbData);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public boolean get(String sql, String codigo, DefaultTableModel tblModel) {
        boolean existe = false;
        try {
            // Cria a conexão com o banco de dados
            Connection con = banco.Con();

            // Prepara a consulta parametrizada
            PreparedStatement pst = con.prepareStatement(sql);

            // Define o valor do parâmetro (cpf)
            pst.setString(1, codigo);

            // Executa a consulta
            ResultSet rs = pst.executeQuery();

            // Limpa o modelo da tabela
            tblModel.setRowCount(0);

            // Preenche o modelo da tabela com os resultados da consulta
            while (rs.next()) {
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
                    rs.getString("data_contratado"),
                    rs.getString("periodo"),
                    rs.getString("nome_empresa"),
                    String.valueOf(rs.getInt("idDepartamento")),
                    rs.getString("foto"),
                    String.valueOf(rs.getInt("idRelatorios")),
                    String.valueOf(rs.getInt("MetaCumprida"))
                };

                tblModel.addRow(tbData);
            }
            // Fecha os recursos
            rs.close();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return existe;
    }

    @Override
    public boolean atualizar(Funcionario funcionario, String atributo, String novoValor) {
        return false;
    }

    @Override
    public void excluir(String cpf) {
        try {
            // Estabelece a conexão com o banco de dados
            Connection con = banco.Con();
            System.out.println("CONEXAO: "+con);
            // Prepara a consulta parametrizada para deletar o funcionário
            String sql = "DELETE FROM funcionario WHERE cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);

            // Executa a consulta
            int rowsAffected = pst.executeUpdate();

            // Verifica se a deleção foi bem-sucedida
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar funcionário.");
            }

            // Fecha os recursos
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String Consulta(String sql, String tipo_total) {
        String total = "";
        try {
            Statement st = banco.Conexao();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                total = rs.getString(tipo_total);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return total;
    }
}
