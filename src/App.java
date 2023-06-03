import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.event.ListDataEvent;

import Controller.LivrariaOsorioController;
import Controller.LivroController;
import Controller.Salvar;
import Controller.UsuarioController;
import Model.Biblioteca;
import Model.LivrariaOsorio;
import Model.Livro;
import Model.Usuario;

public class App {
    public static Scanner in = new Scanner(System.in);
    static boolean menu = true;
    public static String nome, endereco, email, telefone, cpf;

    public static void main(String[] args) throws Exception {


        Livro livro1 = new Livro("Harry potter e a Pedra Filosofal", "JK Rowling", "Fantasia", "1997", 23) {
        };

        Usuario usuario = new Usuario("Vinicius", "Rua professor rodolfo belz", "vcruzz1977@gmail.com", "41920019554",
                "08857449541") {

        };

        List<Livro> livros = new ArrayList<Livro>();
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario);
        livros.add(livro1);
        LivrariaOsorio biblioteca = new LivrariaOsorio(livros, usuarios) {
        };
        List<LivrariaOsorio> livraria = new ArrayList<LivrariaOsorio>();
        livraria.add(biblioteca);

        LivrariaOsorioController teste = new LivrariaOsorioController(new ArrayList<Livro>(), usuarios);

        // teste funcionando
        // teste.buscarLivroPorTitulo("Harry potter e a Pedra Filosofal");
        // System.out.println(livro);//

        while (menu)

        {
            System.out.println(
                    "Bem vindo a Livraria Osório! \n" +
                            "Por favor,escolha uma das opções abaixo\n" +
                            "1 - Cadastrar Livro.\n" +
                            "2 - Cadastrar Usuario.\n" +
                            "3 - Buscar Livro.\n" +
                            "4 - Emprestar Livro.\n" +
                            "5 - Devolver Livro.\n" +
                            "6 - Relatorios.\n" +
                            "7 - Sair.\n");

            int op = in.nextInt();
            switch (op) {
                case 1:
                    List<Livro> listaLivros = new ArrayList<>();
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Digite o nome do livro:");
                    String titulo = scanner.nextLine();

                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();

                    System.out.println("Digite o genero do livro:");
                    String genero = scanner.nextLine();

                    System.out.println("Digite o  ano de publicacao:");
                    String anoPublicacao = scanner.nextLine();

                    scanner.close();
                    break;

                case 2:
                    List<Usuario> listaUsurios = new ArrayList<>();
                    Scanner scanner2 = new Scanner(System.in);

                    System.out.println("Digite o nome do usuário");
                    String nome = scanner2.nextLine();

                    System.out.println("Digite seu endereco");
                    String endereco = scanner2.nextLine();

                    System.out.println(" Digite seu email ");
                    String email = scanner2.nextLine();

                    System.out.println("Digite seu cpf");
                    String cpf = scanner2.nextLine();
                    LivrariaOsorioController livrariaController = new LivrariaOsorioController();


                
                    break;
                case 3:
                    System.out.println("Digite o titulo do livro");
                    List<Livro> listdeLivros;
                    Scanner scanner3 = new Scanner(System.in);
                    String tituloBusca = scanner3.nextLine();
                    LivrariaOsorioController livrariaOsorioController = new LivrariaOsorioController();
                    livrariaOsorioController.buscarLivroPorTitulo(tituloBusca);

                    break;
                case 4:
                    System.out.println("Emprestar livro");
                    break;
                case 5:
                    System.out.println("Devolver livro");
                    break;
                case 6:
                    System.out.println("Relatorios");

                    if (Salvar.lerArquivo() != null) {
                        usuario = (Usuario) Salvar.lerArquivo();
                    } else {
                        System.out.println("Erro");
                    }
                    Salvar.salvarArquivo(usuario);

                    break;
                case 7:
                    System.out.println("A livraria osorio agradece sua visita !");
                    menu = false;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, digite novamente.");
                    break;

            }
        }

    }
}
