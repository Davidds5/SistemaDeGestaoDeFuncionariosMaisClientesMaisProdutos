package Produtos;

import java.util.Date;

public class ProdutoUsado extends Produtos {
    private Date dataFabricacao;

    protected ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public Double precoEtiqueta() {
        return preco * 0.08;
    }

    @Override
    public String toString(){
        return super.toString() + "(usado, fabriaco em: " + dataFabricacao + ")";
    }
}
