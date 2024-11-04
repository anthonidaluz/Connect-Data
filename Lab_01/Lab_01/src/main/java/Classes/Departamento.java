package Classes;

public class Departamento {

    //Atributos
    private int idDepartamento;
    private String nome_departamento;
    private int meta;
    private String descricao;
    
    //Construtor

    public Departamento(int idDepartamento, String nome_departamento, int meta, String descricao) {
        this.idDepartamento = idDepartamento;
        this.nome_departamento = nome_departamento;
        this.meta = meta;
        this.descricao = descricao;
    }

    public Departamento() {
    }
    
    
    //Métodos Getter e Setter

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNome_departamento() {
        return nome_departamento;
    }

    public void setNome_departamento(String nome_departamento) {
        this.nome_departamento = nome_departamento;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //Métodos personalizados

    @Override
    public String toString() {
        return "departamento{" + "idDepartamento=" + idDepartamento + ", nome_departamento=" + nome_departamento + ", meta=" + meta + ", descricao=" + descricao + '}';
    }
    
}
