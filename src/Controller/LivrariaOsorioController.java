package Controller;

import java.util.List;

import Model.LivrariaOsorio;
import Model.Livro;
import Model.Usuario;

public class LivrariaOsorioController extends BibliotecaController {

  private static LivrariaOsorio livrariaosorio;

  public LivrariaOsorioController(List<Livro> listadeLivros, List<Usuario> listaUsuarios) {

    this.livrariaosorio = new LivrariaOsorio(listadeLivros, listaUsuarios);
  }

  @Override
  public Livro buscarLivroPorCodigo(Integer codigo) {
    List<Livro> livroes = livrariaosorio.getListadeLivros();
    for (Livro livro1 : livroes) {
      if (livro1.getCodigo().equals(codigo)) {
        return livro1;
      }
    }
    return null;

  }

  @Override
  public  Livro buscarLivroPorTitulo(String titulo) {
    List<Livro> testando = livrariaosorio.getListadeLivros();
    for (Livro livro1 : testando) {
      if (livro1.getTitulo().equals(titulo)) {
        return livro1;
      }
    }
    return null;
  }

  @Override
  public void cadastrarLivro(Livro livrao) {

    if (livrao != null) {

    } else {
      livrariaosorio.getListadeLivros().add(livrao);
    }

    
    // classe salvar para salvar para salvar controller isso no main banco código

    // dev recebe lista do usuario, aumenta biblioteca qtd livros e apaga lista
    // usuario

    // instanciar uma lista vazia lista.new lista

    // interface serializable classes herdadas recebem

  }

  @Override
  public String toString() {
    return "LivrariaOsorioController [livrariaosorio=" + livrariaosorio + "]";
  }

}
