package Funcionarios;

public class PJ extends Funcionario {
    private Double projetos;

    protected PJ(String nome, Double salarioBase, Double projetos) {
        super(nome, salarioBase);
        this.projetos = projetos;
    }

    public Double getProjetos() {
        return projetos;
    }

    @Override
    public Double pagamentos() {
        return salarioBase += projetos;
    }


}

