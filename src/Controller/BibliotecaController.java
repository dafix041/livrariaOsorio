package Controller;

import java.util.List;

import Model.Livro;
import Model.Usuario;

public abstract class BibliotecaController {

    public abstract Livro buscarLivroPorCodigo( List<Livro> listaLivros, Integer codigo);

    public abstract Livro buscarLivroPorTitulo(String titulo, List<Livro>listaLivros);

    public abstract void cadastrarUsuario(List<Usuario> listaUsuarios);

    public abstract void cadastrarLivro(List<Livro>listaLivros);

}
