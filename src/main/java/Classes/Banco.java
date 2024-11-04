
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Banco {
    //Atributos
    private static String url = "jdbc:mysql://localhost:3306/funcionario";
    private static String user = "root";
    private static String senha = "";
    
    //Construtor
    public Banco() {
       
    }

    //Métodos de conexão
    public Statement Conexao() {
        Statement st = null;
        Connection con = null;
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(url,user,senha);
    
    st = con.createStatement();
    
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
     return(st);   
    }
    
    public void Fechar_conexao(Statement st, Connection con){
        try{
        st.close();
        con.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public Connection Con() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,senha);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;   
    }
}
