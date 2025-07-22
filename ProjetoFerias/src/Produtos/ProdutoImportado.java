package Produtos;

public class ProdutoImportado extends Produtos {
    private Double taxaImportacao;

    protected ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }


    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    @Override
    public Double precoEtiqueta() {
        return preco + taxaImportacao;

    }

    public String toString(){
        return super.toString() + "(taxa: R$ " + String.format("%.2f", taxaImportacao) + ")";
    }


}
