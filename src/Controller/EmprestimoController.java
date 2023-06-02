package Controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import Model.Emprestimo;
import Model.Livro;
import Model.Usuario;

public class EmprestimoController implements Serializable {
    private List<Emprestimo> ListadeEmprestimos;

    public EmprestimoController(List<Emprestimo> listadeEmprestimos) {
        ListadeEmprestimos = listadeEmprestimos;
    }

    @Override
    public String toString() {
        return "EmprestimoController [ListadeEmprestimos=" + ListadeEmprestimos + "]";
    }

    public String emprestarLivro(Usuario usuario, List<Livro> listaparaEmprestar) {
        int quantidadeLivros = ListadeEmprestimos.get(0).getListadeLivro().size();
        for (Emprestimo emprestimo : ListadeEmprestimos) {
            if (emprestimo.getBiblioteca().getListaUsuarios().contains(usuario)) {
                if (emprestimo.getUsuario().getId() == usuario.getId() && quantidadeLivros > 0) {
                    if (emprestimo.getBiblioteca().getListadeLivros().get(quantidadeLivros)
                            .getNumeroDeExemplares() > 0) {
                        LocalDate inicioEmprestimo = LocalDate.now();
                        int exemplares = emprestimo.getBiblioteca().getListadeLivros().get(quantidadeLivros)
                                .getNumeroDeExemplares();
                        Emprestimo emprestimo2 = new Emprestimo(inicioEmprestimo, inicioEmprestimo.plusDays(7),
                                emprestimo.getBiblioteca(), usuario, listaparaEmprestar);
                        ListadeEmprestimos.add(emprestimo2);
                        return "Emprestimo realiazado com sucesso";

                    }
                    return "Erro 1";
                }
                return "Erro 2";

            }
            return "Erro 3";

        }
        return "Erro 4";
    }

    public List<Emprestimo> getListadeEmprestimos() {
        return ListadeEmprestimos;
    }

    public void setListadeEmprestimos(List<Emprestimo> listadeEmprestimos) {
        ListadeEmprestimos = listadeEmprestimos;
    }

}
