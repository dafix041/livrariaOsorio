package Controller;

import java.util.List;

import Model.LivrariaOsorio;
import Model.Livro;
import Model.Usuario;

public class LivrariaOsorioController extends BibliotecaController {

  private  LivrariaOsorio livrariaosorio;

  public LivrariaOsorioController(){
    
  }
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
      if (livro1.getTitulo() == titulo) {
        System.out.println("passei aqui");
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

    
  }

  @Override
  public String toString() {
    return "LivrariaOsorioController [livrariaosorio=" + livrariaosorio + "]";
  }

}
