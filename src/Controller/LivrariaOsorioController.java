package Controller;

import java.util.List;

import Model.LivrariaOsorio;
import Model.Livro;
import Model.Usuario;

public class LivrariaOsorioController extends BibliotecaController {

  List<LivrariaOsorio> livrariaosorio;

  @Override
  public Livro buscarLivroPorCodigo(List<Livro> listaLivros, Integer codigo) {
    for (Livro livro1 : listaLivros) {
      if (livro1.getCodigo().equals(codigo)) {
        return livro1;
      }
    }
    return null;

  }

  @Override
  public Livro buscarLivroPorTitulo(String titulo, List<Livro> listaLivros) {
    for (Livro livro1 : listaLivros) {
      if (livro1.getTitulo().equals(titulo)) {
        return livro1;
      }
    }
    return null;
  }

  @Override
  public void cadastrarUsuario(List<Usuario> listaDeUsuarios) {

    for (Usuario usuario1 : listaDeUsuarios) {
      if (usuario1.getNome() != null && usuario1.getCpf() != null && usuario1.getEndereco() != null
          && usuario1.getEmail() != null && usuario1.getTelefone() != null) {
        List<Usuario> usuarios = livrariaosorio.get(0).getListaUsuarios();
        usuarios.add(usuario1);
        livrariaosorio.get(0).setListaUsuarios(usuarios);
      }

    }

  }

  @Override
  public void cadastrarLivro(List<Livro> listaLivros) {

    for (Livro livro2 : listaLivros) {
      if (livro2.getTitulo() != null && livro2.getAutor() != null && livro2.getGenero() != null
          && livro2.getAnoDePublicacao() != null && livro2.getNumeroDeExemplares() != null) {
        List<Livro> livros = livrariaosorio.get(0).getListadeLivros();
        listaLivros.add(livro2);
        livrariaosorio.get(0).setListadeLivros(livros);
      }

    }

  }

}
