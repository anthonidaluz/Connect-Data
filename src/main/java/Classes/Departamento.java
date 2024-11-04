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
    
    
}
