package Model;

import java.util.List;

public  abstract class Biblioteca {

private List<Livro> listadeLivros;
private List<Usuario>listaUsuarios;
private Emprestimo emprestimo;

public Biblioteca(List<Livro> listadeLivros, List<Usuario> listaUsuarios) {
    this.listadeLivros = listadeLivros;
    this.listaUsuarios = listaUsuarios;
}
public List<Livro> getListadeLivros() {
    return listadeLivros;
}
public void setListadeLivros(List<Livro> listadeLivros) {
    this.listadeLivros = listadeLivros;
}
public List<Usuario> getListaUsuarios() {
    return listaUsuarios;
}
public void setListaUsuarios(List<Usuario> listaUsuarios) {
    this.listaUsuarios = listaUsuarios;
}
@Override
public String toString() {
    return "Biblioteca [listadeLivros=" + listadeLivros + ", listaUsuarios=" + listaUsuarios + "]";
}


}
