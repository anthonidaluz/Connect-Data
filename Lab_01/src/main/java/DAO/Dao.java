
package DAO;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
    public boolean salvar(T t);
    public List<T> listar();
    public T get(int codigo);
    public boolean atualizar(T t);
    public boolean excluir(T t);
    public boolean excluirPorID(int codigo);
    public T salvarRetornandoID (T t);
    
    
    
    
}