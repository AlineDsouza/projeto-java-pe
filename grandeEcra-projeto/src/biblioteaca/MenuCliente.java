package biblioteaca;

import java.util.Scanner;

public class MenuCliente {
    public static void menuCliente(){
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("=========== MENU CLIENTE ===========");
            System.out.println("1 - Novo registo");
            System.out.println("2 - Consultar cartaz cinematografico");
            System.out.println("3 - Pesquisar filmes ");
            System.out.println("4 - Visualizar mapa de uma sala");
            System.out.println("5 - Reservar bilhetes ");
            System.out.println("6 - Recomendar filmes");
            System.out.println("7 - Quiz cinematografico");
            System.out.println("0 - Voltar");


            System.out.println("Digite a opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Voltar");
                    // chama o menu MenuAcesso (MENU PRINCIPAL)e unico lugar onde posso sair do programa
                    break;
                case 1:
                    System.out.println("Novo registo");

                    break;
                case 2:
                    System.out.println("Consultar cartaz cinematografico ");
                    break;
                case 03:
                    System.out.println("Pesquisar filmes");
                case 04:
                    System.out.println("Visualizar mapa de uma sala");
                case 05:
                    System.out.println("Reservar bilhetes");

                case 06:
                    System.out.println("Recomendar filmes");
                    break;
                case 07:
                    System.out.println("Quiz cinematografico ");
                    break;
                default:
                    System.out.println("\nOpção Inválida: " + opcao + "\n");
                    break;
            }

        }while (opcao != 0);
    }
}