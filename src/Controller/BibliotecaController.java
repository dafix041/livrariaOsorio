package Controller;

import java.io.Serializable;
import java.util.List;

import Model.Livro;
import Model.Usuario;

public abstract class BibliotecaController implements Serializable {

    public abstract Livro buscarLivroPorCodigo(Integer codigo);

    public abstract Livro buscarLivroPorTitulo(String titulo);

    public abstract void cadastrarLivro(Livro livrao);

}
