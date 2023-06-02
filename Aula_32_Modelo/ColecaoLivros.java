import java.util.ArrayList;
import java.util.List;

class ColecaoLivros extends Livro {
    private List<Livro> livros;

    public ColecaoLivros(String codigo, String titulo, String autor, int anoLancamento, int quantidadeEstoque, double preco) {
        super(codigo, titulo, autor, anoLancamento, quantidadeEstoque, preco);
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
