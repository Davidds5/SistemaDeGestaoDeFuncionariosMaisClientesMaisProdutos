package Applications;

import Funcionarios.CLT;
import Funcionarios.Funcionario;
import Funcionarios.PJ;
import Produtos.Produtos;
import Usuario.Usuario;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Produtos> produtosList = new ArrayList<>();
        List<Funcionario> funcionarioList = new ArrayList<>();
        List<Usuario> usuarioList = new ArrayList<>();

        int op;

        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Gestão de Funcionários");
            System.out.println("2 - Gestão de Clientes");
            System.out.println("3 - Gestão de Produtos");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            op = sc.nextInt();
            sc.nextLine(); // Limpa buffer

            System.out.println("________________________________________________");

            switch (op) {
                case 1:
                    menuFuncionarios(sc, funcionarioList);
                    break;
                case 2:
                    System.out.println("Módulo de clientes ainda não implementado.");
                    break;
                case 3:
                    System.out.println("Módulo de produtos ainda não implementado.");
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (op != 0);

        sc.close();
    }

    // Menu de funcionários
    public static void menuFuncionarios(Scanner sc, List<Funcionario> funcionarioList) {
        int opFuncionario;

        do {
            System.out.println("=== Menu Funcionários ===");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Buscar Funcionário");
            System.out.println("4 - Remover Funcionário");
            System.out.println("0 - Voltar");
            System.out.print("Digite a opção desejada: ");
            opFuncionario = sc.nextInt();
            sc.nextLine(); // Limpa buffer
            System.out.println("------------------------------------------------");

            switch (opFuncionario) {
                case 1:
                    cadastraFuncionario(sc, funcionarioList);
                    break;
                case 2:
                    listaFuncionario(funcionarioList);
                    break;
                case 3:
                    buscaFuncionario(sc, funcionarioList);
                    break;
                case 4:
                    removerFuncionario(sc, funcionarioList);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opFuncionario != 0);
    }

    // Cadastrar funcionário
    public static void cadastraFuncionario(Scanner sc, List<Funcionario> funcionarioList) {
        System.out.println("=== Cadastro de Funcionário ===");
        System.out.print("Quantos funcionários deseja cadastrar? ");
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.print("CLT ou PJ (C/P): ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário Base: ");
            double salarioBase = sc.nextDouble();

            if (type == 'c') {
                System.out.print("Benefícios: ");
                double beneficios = sc.nextDouble();
                funcionarioList.add(new CLT(nome, salarioBase, beneficios));
            } else if (type == 'p') {
                System.out.print("Horas trabalhadas: ");
                int horas = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();
                funcionarioList.add(new PJ(nome, salarioBase, horas, valorHora));
            } else {
                System.out.println("Tipo inválido! Funcionário não cadastrado.");
            }

            sc.nextLine(); // Limpa buffer
        }
    }

    // Listar funcionários
    public static void listaFuncionario(List<Funcionario> funcionarioList) {
        System.out.println("=== Lista de Funcionários ===");
        if (funcionarioList.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarioList) {
                System.out.println(funcionario);
            }
        }
    }

    // Buscar funcionário
    public static void buscaFuncionario(Scanner sc, List<Funcionario> funcionarioList) {
        System.out.println("=== Busca por Funcionário ===");
        System.out.print("Informe o nome do funcionário: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;

        for (Funcionario funcionario : funcionarioList) {
            if (funcionario.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Funcionário encontrado:");
                System.out.println(funcionario);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }

    // Remover funcionário
    public static void removerFuncionario(Scanner sc, List<Funcionario> funcionarioList) {
        System.out.println("=== Remover Funcionário ===");
        System.out.print("Informe o nome do funcionário a remover: ");
        String nomeRemover = sc.nextLine();
        boolean encontrado = false;

        Iterator<Funcionario> iterator = funcionarioList.iterator();
        while (iterator.hasNext()) {
            Funcionario funcionario = iterator.next();
            if (funcionario.getNome().equalsIgnoreCase(nomeRemover)) {
                iterator.remove();
                System.out.println("Funcionário removido com sucesso.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
