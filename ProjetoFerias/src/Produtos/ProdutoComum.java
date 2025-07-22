package Produtos;

public class ProdutoComum extends Produtos{

    protected ProdutoComum(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public Double precoEtiqueta() {
        return preco;
    }

}
