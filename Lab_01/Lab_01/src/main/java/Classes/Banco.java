
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Banco {
    //Atributos
    private ArrayList<Funcionario> ListaFuncionarios;
    private ArrayList<Departamento> ListaDepartamentos;
    private ArrayList<Relatorio> ListaRelatorios;
    private static String url = "jdbc:mysql://localhost:3306/funcionario";
    private static String user = "root";
    private static String password = "naruto2001";
    
    //Construtor

    public Banco() {
    }
    
    public List<Funcionario> listar() throws SQLException{
        Connection conexao = Banco.getConnection();
        ArrayList<Funcionario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM funcionário where idFuncionário = ?"; // Substitua pela sua consulta SQL
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
            Funcionario objeto;
            
            while (resultados.next()) {
                int idFuncionário = Integer.parseInt(resultados.getString("id"));
                String nomePessoa = resultados.getString("nome");
                String cpf = resultados.getString("cpf");
                objeto = new Funcionario(idFuncionário, nomePessoa, cpf);
                lista.add(objeto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
    public boolean salvar(Funcionario funcionario) throws SQLException{
        Connection conexao = Banco.getConnection();
        boolean resultado = false;
        
        String sql = "INSERT INTO funcionário(nome, endereco, email, bairro, cpf, cidade, telefone, cep, dataContratado, nacionalidade, empresa, metas, departamento, "
                + "relatorio, periodo, cnh ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement consulta;
        try{
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, funcionario.getNome());
            consulta.setString(2, funcionario.getCpf());
            consulta.execute();
            resultado = true;
        }
        catch(SQLException ex){
            resultado = false;
            System.out.println("Erro ao inserir dados "+ex.getMessage());
        }
        return resultado;
    }
    
    //Métodos GET E SET
    public ArrayList<Funcionario> getListaFuncionarios() {
        return ListaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> ListaFuncionarios) {
        this.ListaFuncionarios = ListaFuncionarios;
    }

    public ArrayList<Departamento> getListaDepartamentos() {
        return ListaDepartamentos;
    }

    public void setListaDepartamentos(ArrayList<Departamento> ListaDepartamentos) {
        this.ListaDepartamentos = ListaDepartamentos;
    }

    public ArrayList<Relatorio> getListaRelatorios() {
        return ListaRelatorios;
    }

    public void setListaRelatorios(ArrayList<Relatorio> ListaRelatorios) {
        this.ListaRelatorios = ListaRelatorios;
    }
    
    //Métodos personalizados
    public static Connection getConnection() throws SQLException{
        Connection connection = null;
        connection = DriverManager.getConnection(url, user , password);
        
        return connection;
    }
    
    public Banco(ArrayList<Funcionario> ListaFuncionarios, ArrayList<Departamento> ListaDepartamentos, ArrayList<Relatorio> ListaRelatorios){
        
        this.ListaFuncionarios = ListaFuncionarios;
        this.ListaDepartamentos = ListaDepartamentos;
        this.ListaRelatorios = ListaRelatorios;
    }

    public int totalFuncionarios() {
        return 0;
    }
    public int totalDepartamentos(){
        
        return 0;
    }
    public int totalRelatorios(){
        
        return 0;
    }
    
}
