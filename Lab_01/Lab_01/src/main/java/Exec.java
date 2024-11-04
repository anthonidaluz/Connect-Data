
import Classes.Banco;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Exec {

    public static void main(String[] args) throws SQLException {
        TLogin tl = new TLogin();
        tl.setVisible(true);
        tl.setLocationRelativeTo(null);
        tl.setTitle("Connect Data - 1.0");
//        Connection conexao = Banco.getConnection();
//        if(conexao!=null){
//            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
//        }
        
    }
}
