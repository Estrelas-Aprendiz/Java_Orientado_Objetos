import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("===== MENU =====");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Coleção");
            System.out.println("3. Consultar Livro por código");
            System.out.println("4. Efetuar Venda");
            System.out.println("5. Sair");
            System.out.println("Digite a opção desejada:");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    livraria.cadastrarLivro();
                    break;
                case 2:
                    livraria.cadastrarColecao();
                    break;
                case 3:
                    livraria.consultarLivro();
                    break;
                case 4:
                    livraria.efetuarVenda();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println();
        }
    }
}
