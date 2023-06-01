package Exercicio1;

class Alimento {
    private String nome;
    private double quantidade;
    private String tipo;

    public Alimento(String nome, double quantidade, String tipo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }
}
