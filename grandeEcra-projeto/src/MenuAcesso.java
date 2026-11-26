import biblioteaca.MenuAdmin;

import java.util.Scanner;

import static biblioteaca.MenuAdmin.menuAdmin;
import static biblioteaca.MenuCliente.menuCliente;

public class MenuAcesso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=========== GRANDEECRA ===========");
            System.out.println("Grandes histórias merecem um grande ecrã.");
            System.out.println("1 - ADMIN");
            System.out.println("2 - CLIENTE");
            System.out.println("0 - SAIR");

            System.out.println("Digite a opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Selecionou sair...");
                    break;
                case 1:
                    System.out.println("teste admin");
                    // se loginAdmin() for verdadeiro --> entra em menuAdmin();
                    // se nao
                    //mensagem de login invalido

                    break;
                case 2:
                    System.out.println("teste cliente");
                    menuCliente();
                    //se selecionar adimin
                    // exibir menuCliente()
                    break;
                default:
                    System.out.println("\nOpção Inválida: " + opcao + "\n");
                    break;
            }

        }while (opcao != 0);
    }

}
