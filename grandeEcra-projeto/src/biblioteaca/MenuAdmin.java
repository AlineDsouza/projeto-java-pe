package biblioteaca;

import java.util.Scanner;

import static biblioteaca.FuncoesAdmin.*;

public class MenuAdmin {

    public static void menuAdmin(){
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("=========== MENU ADMINISTRADOR ===========");
            System.out.println("1 - Consultar ficheiros ");
            System.out.println("2 -  Estatisticas gerais de vendas ");
            System.out.println("2 - Receita por sala ");
            System.out.println("4 - Receita por filme ");
            System.out.println("5 - Top 3 filmes com maior receita ");
            System.out.println("6 - Resetar lotacao de uma sala ");
            System.out.println("0 - Voltar");


            System.out.println("Digite a opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Voltar");
                    // chama o menu MenuAcesso (MENU PRINCIPAL)e unico lugar onde posso sair do programa
                    break;
                case 1:
                    System.out.println("Consultar ficheiros");
                    consultarFicheiros();
                    break;
                case 2:
                    System.out.println("Estatisticas gerais de vendas");
                    estatisticasVendas();
                    break;
                case 03:
                    System.out.println("Receita por sala");
                    receitaSala();
                case 04:
                    System.out.println("Receita por filme");
                    receitaFilme();
                case 05:
                    System.out.println("Top 3 filmes com maior receita ");
                    topFilmesMaiorReceita();
                    break;
                case 06:
                    System.out.println("Resetar lotacao de uma sala");
                    resetarAriquivo();
                default:
                    System.out.println("\nOpção Inválida: " + opcao + "\n");
                    break;
            }

        }while (opcao != 0);
    }
}
