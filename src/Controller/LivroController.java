package Controller;

import java.util.List;

import Model.Livro;

public class LivroController {
    private List<Livro> listadeLivros;

    public LivroController(List<Livro> listadeLivros) {
        this.listadeLivros = listadeLivros;
    }

    @Override
    public String toString() {
        return "LivroController [listadeLivros=" + listadeLivros + "]";
    }

   
}
