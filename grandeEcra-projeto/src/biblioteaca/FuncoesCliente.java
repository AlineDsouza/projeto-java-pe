package biblioteaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FuncoesCliente {

    public static void novoRegisto(){
        System.out.println("teste");
    }

    public static void consultarArquivos(String caminho) throws FileNotFoundException {
        File ficheiroConsulta = new File(caminho);
        Scanner sc = new Scanner(ficheiroConsulta);

        System.out.println("========FILMES EM CARTAZ=========");

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }

    }
    public static void pesquisarFilme(){
        System.out.println("teste");
    }
    public static void visualizarMapa(){
        System.out.println("teste");
    }
    public static void reservarBilhetes(){
        System.out.println("teste");
    }
    public static void recomendarFilmes(){
        System.out.println("teste");
    }
    public static void quiz(){
        System.out.println("teste");
    }
}
