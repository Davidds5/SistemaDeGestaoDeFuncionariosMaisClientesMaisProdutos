package Funcionarios;

public class CLT extends Funcionario{
    private Double beneficios;


    public  CLT(String nome, Double salarioBase, Double beneficios) {
        super(nome, salarioBase);
        this.beneficios = beneficios;
    }

    public Double getBeneficios(){
        return beneficios;
    }

    @Override
    public Double pagamentos() {
        return salarioBase += beneficios;
    }

}
