
class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private int quantidadeEstoque;
    private double preco;

    public Livro(String codigo, String titulo, String autor, int anoLancamento, int quantidadeEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void venderLivro() throws EstoqueEsgotadoException {
        if (quantidadeEstoque > 0) {
            quantidadeEstoque--;
        } else {
            throw new EstoqueEsgotadoException("Estoque esgotado");
        }
    }
}


