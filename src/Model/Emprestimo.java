package Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Emprestimo implements Serializable {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Biblioteca biblioteca;
    private Usuario usuario;
    private List<Livro>listadeLivro;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Usuario usuario2, List<Livro> livro,
            Biblioteca biblioteca2) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.biblioteca = biblioteca;
        this.usuario = usuario;
        this.listadeLivro =listadeLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public  void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Livro> getListadeLivro() {
        return listadeLivro;
    }

    public void setListadeLivro(List<Livro> listadeLivro) {
        this.listadeLivro = listadeLivro;
    }

    @Override
    public String toString() {
        return "Emprestimo [dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + ", biblioteca="
                + biblioteca + ", usuario=" + usuario + ", listadeLivro=" + listadeLivro + "]";
    }
    
    
    
   
}
