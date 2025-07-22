package Produtos;

import java.util.Date;

public class ProdutoUsado extends Produtos {
    private Date dataFabricacao;

    protected ProdutoUsado(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public Double precoEtiqueta() {
        return 0.0;
    }
}
