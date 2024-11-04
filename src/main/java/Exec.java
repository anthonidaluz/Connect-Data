import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exec {

    public static void main(String[] args) throws SQLException {

        // Obter idioma e país do sistema operacional
        String idioma = System.getProperty("user.language");
        String pais = System.getProperty("user.country");

        // Lista de idiomas disponíveis
        ArrayList<String> traducoesDisponiveis = new ArrayList<>();
        traducoesDisponiveis.add("en");
        traducoesDisponiveis.add("es");
        traducoesDisponiveis.add("pt");

        // Verifica se o idioma do sistema está disponível, senão define padrão
        if (!traducoesDisponiveis.contains(idioma)) {
            idioma = "en";
            pais = "US";
        }

        // Configura o locale corrente
        Locale localCorrente = new Locale(idioma, pais);
        ResourceBundle traducoes = ResourceBundle.getBundle("Idiomas/MessagesBundle", localCorrente);

        String nomeArquivo = "src/main/resources/Idiomas/MessagesBundle_" + idioma + "_" + pais + ".properties";
        InputStream newInputStream;

        // Tenta carregar o arquivo de propriedades específico
        try {
            newInputStream = Files.newInputStream(Paths.get(nomeArquivo));
            traducoes = new PropertyResourceBundle(newInputStream);

        } catch (IOException ex) {
            Logger.getLogger(Exec.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Criando uma instância TLogin para ir para a janela inicial
        // Para entrar no sistema utilize o login padrão: user = admin senha = 123
        TLogin tl = new TLogin(traducoes);
        tl.setVisible(true);
        tl.setLocationRelativeTo(null);
        tl.setTitle("Connect Data - 1.2.1");
    }

}
