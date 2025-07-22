package Funcionarios;

public class PJ extends Funcionario {
    private Integer horas;
    private Double valorHora;

    public PJ(String nome, Double salarioBase, Integer projetos, Double valorHora) {
        super(nome, salarioBase);
        this.horas = projetos;
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    @Override
    public Double pagamentos() {
        return salarioBase + (horas * valorHora);
    }


    public Double getValorHora() {
        return valorHora;
    }
}

