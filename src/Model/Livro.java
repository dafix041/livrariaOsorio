package Model;

import java.io.Serializable;

public class Livro implements Serializable {

    private  static  Integer sequencia = 1;
    private String titulo;
    private String autor;
    private String genero;
    private Integer codigo;
    private String anoDePublicacao;
    private Integer numeroDeExemplares;

    public Livro(String titulo, String autor, String genero, Integer codigo, String anoDePublicacao,
            Integer numeroDeExemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.codigo = sequencia++;
        this.anoDePublicacao = anoDePublicacao;
        this.numeroDeExemplares = numeroDeExemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String setAnoDePublicacao(String anoDePublicacao) {
        return this.anoDePublicacao = anoDePublicacao;
    }

    public Integer getNumeroDeExemplares() {
        return numeroDeExemplares;
    }

    public void setNumeroDeExemplares(Integer numeroDeExemplares) {
        this.numeroDeExemplares = numeroDeExemplares;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", codigo=" + codigo
                + ", anoDePublicacao=" + anoDePublicacao + ", numeroDeExemplares=" + numeroDeExemplares + "]";
    }

}
