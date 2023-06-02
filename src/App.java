import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.LivrariaOsorioController;
import Controller.LivroController;
import Controller.Salvar;
import Model.Biblioteca;
import Model.LivrariaOsorio;
import Model.Livro;
import Model.Usuario;


public class App {
    public static Scanner in = new Scanner(System.in);
    static boolean menu = true;
    public static String nome, endereco, email,telefone, cpf;

    public static void main(String[] args) throws Exception {

        

        Livro livro = new Livro("Harry potter e a Pedra Filosofal", "JK Rowling", "Fantasia", 1, "1997", 23){

        };
        
        Usuario usuario = new Usuario("Vinicius", "Rua professor rodolfo belz", "vcruzz1977@gmail.com", "41920019554", "08857449541"){

        };

        List<Livro> livros = new ArrayList<Livro>();
        List<Usuario> usuarios = new ArrayList <Usuario>();
        usuarios.add(usuario);
        livros.add(livro);
        LivrariaOsorio biblioteca = new LivrariaOsorio(livros, usuarios) {
        };
        List<LivrariaOsorio> livraria = new ArrayList<LivrariaOsorio>();
        livraria.add(biblioteca);

        LivrariaOsorioController teste = new LivrariaOsorioController(new ArrayList<Livro>(), usuarios);

        teste.buscarLivroPorTitulo("Harry potter e a Pedra Filosofal");
        System.out.println(teste);  

        if (Salvar.lerArquivo() != null) {
            //nesta linha chamamos o método estático da classe salvar e tentamos iniciar o banco
            usuario = (Usuario) Salvar.lerArquivo(); 
        }else {
            //Caso o retorno seja vazio adicionamos a conta corrente ao banco, garantindo que a conta não será inserida duas vezes
            System.out.println("Erro");
        }
        Salvar.salvarArquivo(usuario);


        }

        public static void solicitarDados(){
            System.out.println("Nome: ");
            nome = in.nextLine();
            System.out.println("endereco: ");
            endereco = in.nextLine();
            System.out.println("email: ");
            email = in.nextLine();
            System.out.println("Telefone: ");
            telefone = in.nextLine();
            System.out.println("cpf: ");
            cpf = in.nextLine();

     /*    while (menu) {
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
                    System.out.println("Cadastrar novo livro.");

                    break;
                case 2:
                    System.out.println("Cadastrar novo usuario");
                    ;
                    break;
                case 3:
                    System.out.println("Buscar livro");
                    break;
                case 4:
                    System.out.println("Emprestar livro");
                    break;
                case 5:
                    System.out.println("Devolver livro");
                    break;
                case 6:
                    System.out.println("Relatorios");
                    break;
                case 7:
                    System.out.println("A livraria osorio agradece sua visita !");
                    break;
                case 0:
                    menu = false;
                    break;
            }
        }
    } /* /* */
}
}