package Controller;

import java.io.Serializable;
import java.util.List;

import Model.Emprestimo;

public class EmprestimoController  implements Serializable{
    private List<Emprestimo>ListadeEmprestimos;

    public List<Emprestimo> getListadeEmprestimos() {
        return ListadeEmprestimos;
    }

    public void setListadeEmprestimos(List<Emprestimo> listadeEmprestimos) {
        ListadeEmprestimos = listadeEmprestimos;
    }

    
}
