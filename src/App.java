import java.util.Scanner;

import Controller.LivroController;

public class App {
    static Scanner in = new Scanner(System.in);
    static boolean menu = true;

    public static void main(String[] args) throws Exception {

        while (menu) {
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
    }
}
