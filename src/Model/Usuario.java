package Model;

import java.io.Serializable;

/* O sistema deve possuir um cadastro de usuários, com
informações como nome, telefone, endereço, e-mail, entre outros*/
public class Usuario implements Serializable {
    private static int sequencia = 1;
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String cpf;
    public Usuario(String nome, String endereco, String email, String telefone, String cpf) {
        this.id = sequencia++;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", telefone="
                + telefone + ", cpf=" + cpf + "]";
    }

    
}
