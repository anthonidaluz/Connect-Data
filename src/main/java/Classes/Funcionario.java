package Classes;

import java.time.LocalDate;

public class Funcionario {
    
    //Atributos
    private int idFuncionário;
    private String nome;
    private String cpf;
    private String email;
    private char genero;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String nacionalidade;
    private int cnh;
    private LocalDate data_contratado;
    private String periodo;
    private String nome_empresa;
    private int idDepartamento;
    private String foto;
    private int idRelatorios;
    private int MetaCumprida;
    
    //Construtor

    public Funcionario(int idFuncionário, String nome, String cpf) {
        this.idFuncionário = idFuncionário;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Funcionario(int idFuncionário, String nome, String cpf, String email, char genero, String telefone, String endereco, String bairro, String cidade, String cep, String nacionalidade, int cnh, LocalDate data_contratado, String periodo, String nome_empresa, int idDepartamento, String foto, int idRelatorios, int MetaCumprida) {
        this.idFuncionário = idFuncionário;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.genero = genero;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.nacionalidade = nacionalidade;
        this.cnh = cnh;
        this.data_contratado = data_contratado;
        this.periodo = periodo;
        this.nome_empresa = nome_empresa;
        this.idDepartamento = idDepartamento;
        this.foto = foto;
        this.idRelatorios = idRelatorios;
        this.MetaCumprida = MetaCumprida;
    }

    public Funcionario() {
    }
    
    
    //Métodos Getter e Setter

    public int getIdFuncionário() {
        return idFuncionário;
    }

    public void setIdFuncionário(int idFuncionário) {
        this.idFuncionário = idFuncionário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public LocalDate getData_contrtado() {
        return data_contratado;
    }

    public void setData_contrtado(LocalDate data_contratado) {
        this.data_contratado = data_contratado;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIdRelatorios() {
        return idRelatorios;
    }

    public void setIdRelatorios(int idRelatorios) {
        this.idRelatorios = idRelatorios;
    }

    public int getMetaCumprida() {
        return MetaCumprida;
    }

    public void setMetaCumprida(int MetaCumprida) {
        this.MetaCumprida = MetaCumprida;
    }
    
    
    //MÉTODOS PERSONALIZADOS

    @Override
    public String toString() {
        return "funcion\u00e1rio{" + "idFuncion\u00e1rio=" + idFuncionário + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", genero=" + genero + ", telefone=" + telefone + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", nacionalidade=" + nacionalidade + ", cnh=" + cnh + ", data_contratado=" + data_contratado + ", periodo=" + periodo + ", nome_empresa=" + nome_empresa + ", idDepartamento=" + idDepartamento + ", foto=" + foto + ", idRelatorios=" + idRelatorios + ", MetaCumprida=" + MetaCumprida + '}';
    }
    
    
    
}
