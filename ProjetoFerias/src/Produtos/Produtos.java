package Produtos;

public abstract class Produtos {
    private String nome;
    private Double preco;

    protected Produtos(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
    public Double precoEtiqueta(){
        return precoEtiqueta();
    }

    public String toString(){
        return String.format("Nome: %s | Preco: R$ %.2fd", nome, preco);
    }
}
