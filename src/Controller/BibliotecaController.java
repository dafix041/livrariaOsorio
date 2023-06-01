package Controller;

import java.util.List;

import Model.Livro;
import Model.Usuario;

public abstract class BibliotecaController {

    public abstract Livro buscarLivroPorCodigo(Integer codigo);

    public abstract Livro buscarLivroPorTitulo(String titulo);

    public abstract void cadastrarUsuario(List<Usuario> listaUsuarios);

    public abstract void cadastrarLivro(List<Livro>listaLivros);

}
