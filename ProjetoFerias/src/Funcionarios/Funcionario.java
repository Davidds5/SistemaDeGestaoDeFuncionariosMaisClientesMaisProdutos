package Funcionarios;

public abstract class Funcionario {
    private String nome;
    protected Double salarioBase;


    protected Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }
    public abstract Double pagamentos();

    public String toString(){
        return String.format("Nome: %s | Salario base: R$ %.2fd", nome, salarioBase);
    }
}
