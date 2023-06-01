package Model;

public class Emprestimo {
    private String dataEmprestimo;
    private String dataDevolucao;
    public Emprestimo(String dataEmprestimo, String dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    @Override
    public String toString() {
        return "Emprestimo [dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + "]";
    }
    
}
