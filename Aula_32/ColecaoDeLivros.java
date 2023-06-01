import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ColecaoDeLivros extends Livro {
    private String descricao;

    private List<Livro> livros;

    static int codigoGerado = 0 ;

    public ColecaoDeLivros(String titulo, String autor, int anoDeLancamento, int estoque, double preco, String descricao){
        super(titulo,autor,anoDeLancamento,estoque,preco);
        this.descricao = descricao;
        codigoGerado++;
        this.codigo = Integer.toString(codigoGerado) ;
        livros = new ArrayList<>();
    }
    public ColecaoDeLivros(){

    }
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Livro> getLivros(){
        return livros;
    }


}
