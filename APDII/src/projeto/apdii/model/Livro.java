package projeto.apdii.model;

import projeto.apdii.constant.Genero;

import java.util.Date;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class Livro {

    private long identificador;
    private long edicao;

    private String descricao;
    private String isbn;
    private String idioma;
    private String editora;

    private double peso;
    private double largura;
    private double profundidade;
    private double preco;

    private Date dataAdicao;

    private Genero genero;


    public Livro() {
    }

    public Livro(long identificador, long edicao, String descricao, String isbn, String idioma, String editora, double peso, double largura, double profundidade, double preco, Date dataAdicao) {
        this.identificador = identificador;
        this.edicao = edicao;
        this.descricao = descricao;
        this.isbn = isbn;
        this.idioma = idioma;
        this.editora = editora;
        this.peso = peso;
        this.largura = largura;
        this.profundidade = profundidade;
        this.preco = preco;
        this.dataAdicao = dataAdicao;
    }

    public long getIdentificador() {
        return identificador;
    }

    public long getEdicao() {
        return edicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getEditora() {
        return editora;
    }

    public double getPeso() {
        return peso;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public double getPreco() {
        return preco;
    }

    public Date getDataAdicao() {
        return dataAdicao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public void setEdicao(long edicao) {
        this.edicao = edicao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataAdicao(Date dataAdicao) {
        this.dataAdicao = dataAdicao;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
