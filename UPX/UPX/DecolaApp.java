package UPX.UPX;

import java.util.ArrayList;
import java.util.Scanner;

public class DecolaApp {
    public static void main(String[] args) {
        System.out.println("=== Olá, seja Bem-vindo ao Decola! ===\n");
        System.out.println("---------------------\n");

        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> lstUsuario = new ArrayList<>();
        ArrayList<Trilha> trilhas = new ArrayList<>();
        int opt;

        do {
            System.out.println("\n=== MENU DECOLA ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Explorar Trilhas");
            System.out.println("3 - Teste Vocacional");
            System.out.println("4 - Listar Usuários Cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("\nDigite seu nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite seu email: ");
                    String email = sc.nextLine();
                    System.out.print("Interesse principal: ");
                    String interesse = sc.nextLine();

                    Usuario u = new Usuario(nome, email, interesse);
                    lstUsuario.add(u);

                    System.out.println("\nUsuário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println();

                    break;

                case 3:
                    System.out.println("\nTeste Vocacional ainda não implementado.");
                    break;
                case 4:
                    System.out.println("\n=== Usuários Cadastrados ===");
                    for (Usuario user : lstUsuario) {
                        System.out.println(user.Mostrar());
                    }
                    break;
                default:
                    if (opt != 0) {
                        System.out.println("\nOpção inválida. Tente novamente.");
                    }
                    break;
            }
        } while (opt != 0);

        sc.close();
    }

}



