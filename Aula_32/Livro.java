public class Livro {
    protected String codigo;
    protected String titulo;
    protected String autor;
    protected int anoDeLancamento;
    protected int estoque;
    protected double preco;

    static int codigoGerado = 0 ;

    public Livro(String titulo, String autor, int anoDeLancamento, int estoque, double preco ){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
        this.estoque = estoque;
        this.preco = preco;
        codigoGerado++;
        this.codigo = Integer.toString(codigoGerado) ;
    }

    public Livro(){

    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
      this.anoDeLancamento = anoDeLancamento;
    }

    public int getEstoque(){
        return estoque;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
       this.preco = preco;
    }

    public void venderLivro() throws EstoqueEsgotadoException {
        if (estoque > 0){
            estoque--;
        }else {
            throw new EstoqueEsgotadoException("EstoqueEsgotado");
        }
    }

}
