import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        Scanner leiaString = new Scanner(System.in);

        System.out.println("Nome do Leitor: ");
        String nome = leiaString.nextLine();
        System.out.printf("Quantidade de Livros Lidos: ");
        int livrosLidos = leia.nextInt();

        Livro [] listaLivro = new Livro[livrosLidos];

        for(int cont = 0 ; cont < livrosLidos ; cont++){
            Livro listaTot = new Livro();

            //nao funciona se o nome for varias palavras
            System.out.print("\nNome do Livro: ");
            listaTot.setNomeLivro(leiaString.nextLine());

            System.out.print("Quantidade de paginas: ");
            listaTot.setPagina(leia.nextInt());

            listaLivro [cont] = listaTot;
        }

        System.out.print("\n=====LISTA DE LIVROS LIDOS=====\n");
        System.out.print("NOME DO LEITOR: "+ nome +"\n-----LIVROS LIDOS-----\n");

        for(Livro leiaLivros :listaLivro){
            System.out.println("LIVRO: "+leiaLivros.getNomeLivro()+" Nº PAGINAS: " + leiaLivros.getPagina());

        }


    }
}
