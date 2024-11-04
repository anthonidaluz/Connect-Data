
package DAO;

import Classes.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface Dao<T> {
    public T Adicionar(String sql, T t);
    public void listar(String sql, DefaultTableModel tblModel);
    public boolean get(String sql, String cpf, DefaultTableModel tblModels);
    public boolean atualizar(Funcionario funcionario, String atributo, String novoValor);
    public void excluir(String cpf);
    public String Consulta(String sql , String tipo_total);
    
    
    
}