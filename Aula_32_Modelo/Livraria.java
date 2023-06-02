import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

class Livraria {
    private Map<String, Livro> livros;

    public Livraria() {
        livros = new HashMap<>();
        inicializarEstoque();
    }

    public void cadastrarLivro() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Digite o código do livro:");
        String codigo = scanner.nextLine();
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Digite o ano de lançamento do livro:");
        int anoLancamento = scanner.nextInt();
        System.out.println("Digite a quantidade em estoque do livro:");
        int quantidadeEstoque = scanner.nextInt();
        System.out.println("Digite o preço do livro:");
        double preco = scanner.nextDouble();

        Livro livro = new Livro(codigo, titulo, autor, anoLancamento, quantidadeEstoque, preco);
        livros.put(codigo, livro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    public void cadastrarColecao() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Digite o código da coleção:");
        String codigo = scanner.nextLine();
        System.out.println("Digite o título da coleção:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor da coleção:");
        String autor = scanner.nextLine();
        System.out.println("Digite o ano de lançamento da coleção:");
        int anoLancamento = scanner.nextInt();
        System.out.println("Digite a quantidade em estoque da coleção:");
        int quantidadeEstoque = scanner.nextInt();
        System.out.println("Digite o preço da coleção:");
        double preco = scanner.nextDouble();

        ColecaoLivros colecao = new ColecaoLivros(codigo, titulo, autor, anoLancamento, quantidadeEstoque, preco);

        System.out.println("Digite o número de livros na coleção:");
        int numeroLivros = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < numeroLivros; i++) {
            System.out.println("Digite o código do livro:");
            String livroCodigo = scanner.nextLine();
            Livro livro = livros.get(livroCodigo);
            if (livro != null) {
                colecao.adicionarLivro(livro);
            } else {
                System.out.println("Livro não encontrado. A coleção será cadastrada sem esse livro.");
            }
        }

        livros.put(codigo, colecao);

        System.out.println("Coleção cadastrada com sucesso!");
    }

    public void consultarLivro() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Digite o código do livro:");
        String codigo = scanner.nextLine();

        Livro livro = livros.get(codigo);

        if (livro != null) {
            System.out.println("Código: " + livro.getCodigo());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de Lançamento: " + livro.getAnoLancamento());
            System.out.println("Quantidade em Estoque: " + livro.getQuantidadeEstoque());
            System.out.println("Preço: " + livro.getPreco());
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public void efetuarVenda() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Digite o código do livro ou da coleção:");
        String codigo = scanner.nextLine();

        Livro livro = livros.get(codigo);

        if (livro != null) {
            try {
                livro.venderLivro();
                System.out.println("Venda realizada com sucesso!");
            } catch (EstoqueEsgotadoException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    private void inicializarEstoque() {
        Livro livro1 = new Livro("001", "Livro 1", "Autor 1", 2021, 10, 29.99);
        Livro livro2 = new Livro("002", "Livro 2", "Autor 2", 2022, 5, 19.99);
        Livro livro3 = new Livro("003", "Livro 3", "Autor 3", 2023, 3, 9.99);

        livros.put(livro1.getCodigo(), livro1);
        livros.put(livro2.getCodigo(), livro2);
        livros.put(livro3.getCodigo(), livro3);
    }
}
