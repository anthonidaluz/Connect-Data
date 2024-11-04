
package Classes;

public class Relatorio {
    //Atributos
    private int idRelatorios;
    private int idDepartamento;
    private int totalMetasCumpridas;
    private int faltas;
    private String avaliacao;
    
    //Construtor
    public Relatorio(int idRelatorios, int idDepartamento, int totalMetasCumpridas, int faltas, String avaliacao) {
        this.idRelatorios = idRelatorios;
        this.idDepartamento = idDepartamento;
        this.totalMetasCumpridas = totalMetasCumpridas;
        this.faltas = faltas;
        this.avaliacao = avaliacao;
    }

    public Relatorio() {
    }
    
    
    //Métodos Getter e Setter

    public int getIdRelatorios() {
        return idRelatorios;
    }

    public void setIdRelatorios(int idRelatorios) {
        this.idRelatorios = idRelatorios;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getTotalMetasCumpridas() {
        return totalMetasCumpridas;
    }

    public void setTotalMetasCumpridas(int totalMetasCumpridas) {
        this.totalMetasCumpridas = totalMetasCumpridas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    //Métodos personalizados
    @Override
    public String toString() {
        return "relatorios{" + "idRelatorios=" + idRelatorios + ", idDepartamento=" + idDepartamento + ", totalMetasCumpridas=" + totalMetasCumpridas + ", faltas=" + faltas + ", avaliacao=" + avaliacao + '}';
    }
    
    
}
