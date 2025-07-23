package Applications;

import Funcionarios.CLT;
import Funcionarios.Funcionario;
import Funcionarios.PJ;
import Produtos.Produtos;
import Usuario.Usuario;

import java.util.*;
import java.util.spi.AbstractResourceBundleProvider;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Produtos> produtosList = new ArrayList<>();
        List<Funcionario> funcionarioList = new ArrayList<>();
        List<Usuario> usuarioList = new ArrayList<>();

        int op;

        do{
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Gestao de Funcionarios");
            System.out.println("2 - Gestao de Clientes");
            System.out.println("3 - Gestao de Produtos");
            System.out.println("0 - Sair");
            System.out.println("Digite a opcao desejada: ");
            op = sc.nextInt();

            System.out.println("__________________________________________________________________");
            switch (op){

                // usando o metodo do, eu farei o menu roda ate ser digitado o numero 0
                // isso vale para todas as partes

                case 1:
                    int opFuncionario;
                  do {
                      System.out.println("=== Menu funcionario ===");
                      System.out.println("1 - Cadastro de Funcionario");
                      System.out.println("2 - Lista de Funcionario");
                      System.out.println("3 - Buscar Funcionario");
                      System.out.println("4 - Remover Funcionario");
                      System.out.println("0 - Sair");
                      opFuncionario = sc.nextInt();
                      System.out.println("------------------------------------------------------------------------------");

                      switch (opFuncionario){
                          // parte usada para o desenvolvimento do cadastro do funcionario, como pode ver iremos inserir os dados
                          // depois armazena nunca lista ja extendida da class Funcionario
                          // as listas serao diferente dependo da class de funcionario que o usuario inserir, clt ou pj
                          // decidir um metodo que aprendi atraves de estudos para deixar o main mais organizado
                          case 1:
                              // so os dados do static ultilizado fora do main
                              cadrastaFuncionario(sc, funcionarioList);
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
                              System.out.println("Programa sendo encerrado...");
                              break;
                          default:
                              System.out.println("Opcao invalida, tente novamente.");
                      }
                  }while(opFuncionario != 0);

                  break;


                case 2:
                    int opCliente;
                    do {
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        opCliente = sc.nextInt();
                    }while (opCliente != 0);

                case 3:
                case 0:

            }




        }while(op != 0);
        sc.close();

    }

    // PARTE DA CLASS FUNCIONARIO
    // metodo apenas usado para o cadrasto de funcionario
    public static void cadrastaFuncionario(Scanner sc, List<Funcionario> funcionarioList){
        System.out.println("=== CADASTRADO DE FUNCIONARIO ===");

        System.out.println("Quantos funcionarios deseja cadastrado: ");
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <N ; i++) {
            System.out.println("Funcionario #" + (i + 1) + ": ");
            System.out.println("CLT ou PJ (C/P): ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Salario Base: ");
            Double salarioBase = sc.nextDouble();

            if (type == 'c'){
                System.out.println("Beneficios: ");
                double beneficios = sc.nextDouble();

                funcionarioList.add(new CLT(nome, salarioBase,beneficios));
            }else if (type == 'p'){
                System.out.print("Horas trabalhadas: ");
                int horas = sc.nextInt();

                System.out.println("Valor por horas: ");
                double valorHoras = sc.nextDouble();

                funcionarioList.add(new PJ(nome, salarioBase, horas, valorHoras));
        }else {
        System.out.println("Tipo Invalido !");
            }
        }
    }
    // metodo apenas usado para lista funcionarios
    public static void listaFuncionario(List<Funcionario> funcionarioList) {
        System.out.println("Listando Funcionarios");
        for (Funcionario funcionario : funcionarioList){
            System.out.println(funcionario);
        }
    }

    // metodo apenas usado para encotrar funcionario
    public static void buscaFuncionario(Scanner sc, List<Funcionario> funcionarioList){
        System.out.println("=== Busca por Funcionarios ===");
        System.out.print("Informe o nome do funcionario que deseja buscar: ");
        String nomeBusca = sc.nextLine();
        boolean encotrado = false;
        for (Funcionario funcionario : funcionarioList){
            if (funcionario.getNome().equalsIgnoreCase(nomeBusca)){
                encotrado = true;
                System.out.println("Funcionario encontrado com sucesso.");
                System.out.println(funcionario);

        }
    }
    if (!encotrado){
        System.out.println("Funcionario nao encotrado.");
    }
    }
    // metodo usado apenas para remover funcionario
    public static void removerFuncionario(Scanner sc, List<Funcionario> funcionarioList){
        System.out.println("=== Remover Funcionario ===");
        System.out.print("Qual funcionario deseja remover: ");
        String nomeRemover = sc.nextLine();
        boolean encotrado = false;

        Iterator<Funcionario> iterator = funcionarioList.iterator();
        for (Funcionario funcionario : funcionarioList){
            if (funcionario.getNome().equalsIgnoreCase(nomeRemover)){
                iterator.remove();
                break;
            }
        }
        if (!encotrado){
            System.out.println("Nome nao encotrado.");
        }

    }

}
