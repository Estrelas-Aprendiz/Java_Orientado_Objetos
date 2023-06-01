import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Livraria {
    private Map<String, Livro> livros;

    public Livraria(){
        livros = new HashMap<>();
        inicializarEstoque();
    }

    public void cadastrarLivro(){
        Livro livro = new Livro();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Digite um titulo do livro:");
        livro.setTitulo(scanner.nextLine());
        System.out.println("Digite um autor do livro:");
        livro.setAutor(scanner.nextLine());
        System.out.println("Digite um ano do lancamento do livro:");
        livro.setAnoDeLancamento(scanner.nextInt());
        System.out.println("Digite um quantidade em estoque do livro:");
        livro.setEstoque(scanner.nextInt());
        System.out.println("Digite um preco do livro:");
        livro.setPreco(scanner.nextDouble());

        livros.put(livro.codigo, livro);
        System.out.println("Livro cadastrado com sucesso!");
    }
    public void cadastrarColecao(){
        ColecaoDeLivros colecao = new ColecaoDeLivros();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Digite um preco da colecao:");
        colecao.setPreco(scanner.nextDouble());

        System.out.println("Digite um descrição do livro:");
        colecao.setDescricao(scanner.next());

        System.out.println("Colecao cadastrada com sucesso!");

    }

    private void inicializarEstoque() {
        Livro livro1 = new Livro("Livro 1", "Autor 1", 2021, 10, 29.99);
        Livro livro2 = new Livro( "Livro 2", "Autor 2", 2022, 5, 19.99);
        Livro livro3 = new Livro( "Livro 3", "Autor 3", 2023, 3, 9.99);

        livros.put(livro1.getCodigo(), livro1);
        livros.put(livro2.getCodigo(), livro2);
        livros.put(livro3.getCodigo(), livro3);
    }

    public void consultarLivro() {
        System.out.println("Livros disponiveis para consulta:" +livros);
        System.out.println("Digite o codigo do livro que deseja");
//       try{
//           String codigoUsuario =
//           for (String codigo: livros.keySet()) {
//
//           }
//        }catch (NullPointerException exceptionNull){
//
//       }
    }
}
