package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Usuario;

public class UsuarioController {
    private static List<Usuario> listaDeUsuarios;

    public UsuarioController(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

     static public void cadastrarUsuario(String nome, String endereco, String email, String telefone, String cpf) {

        if (nome != null) {
            System.out.println("Error");
        } else {
            listaDeUsuarios.add(new Usuario(nome, endereco, email, telefone, cpf));
        }
    }
}
