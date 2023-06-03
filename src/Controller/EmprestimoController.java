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


    public String emprestimoDeLivro(Usuario usuario, List<Livro> livro){
        for (Emprestimo emprestimo : ListadeEmprestimos) {
            if(emprestimo.getBiblioteca().getListaUsuarios().contains(usuario)){
                System.out.println(emprestimo.getUsuario().equals(usuario));
                System.out.println(emprestimo.getDataDevolucao().isAfter(LocalDate.now()));


                if(emprestimo.getUsuario().equals(usuario)) {
                    if(emprestimo.getDataDevolucao().isAfter(LocalDate.now())) {
                    for (Livro livro2 : livro) {
                        if(livro2.getNumeroDeExemplares() > 0){
                            int quantidadeDeLivros = livro2.getNumeroDeExemplares() - 1;
                            LocalDate dataAtual = LocalDate.now();
                            livro2.setNumeroDeExemplares(quantidadeDeLivros);
                            Emprestimo emprestimo2 = new Emprestimo(dataAtual, dataAtual.plusDays(7), usuario, livro, emprestimo.getBiblioteca());
                            ListadeEmprestimos.add(emprestimo2);
                            return "O Emprestimo foi registrado no sistema!";
                            }
                        }
                    }
                }else{
                    return "Você tem um emprestimo pendente !";
                }
            }else {
                return "Você não está cadastrado em nenhuma biblioteca";
            }
        }
        return "Por favor, tente novamente mais tarde!";
    }


  
    public Usuario devolucaoDeLivros(Usuario usuario, List<Livro> livroDevolvidos) {
        try {
            for (int i = 0; i < ListadeEmprestimos.size(); i++) {
                if (ListadeEmprestimos.get(i).getUsuario().equals(usuario)) {
                    if (livroDevolvidos.get(i).getCodigo() == livroDevolvidos.get(i).getTitulo().get(i).getId()) {
                        int estoqueAtual = livroDevolvidos.get(i).getNumeroDeExemplares();
                        ListadeEmprestimos.get(i).getListadeLivro().get(i).setNumeroDeExemplares(estoqueAtual + 1);
                        livroDevolvidos.get(i).setDataDevolucao(LocalDate.now());
                    }
                }
            }
            return usuario;
        } catch (Exception e) {
            System.out.println("Ocorreu na devolução: " + e.getMessage());
            return null; 
        }
    }
}
