package Applications;

import Funcionarios.Funcionario;
import Produtos.Produtos;
import Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

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
            System.out.println("2 - Gestao de Clintes");
            System.out.println("3 - Gestao de Produtos");
            System.out.println("0 - Sair");
            System.out.println("Digite a opcao desejada: ");
            op = sc.nextInt();
            switch (op){

                case 1:
                    int opFuncionario;
                  do {
                      System.out.println("=== Menu funcionario ===");
                      System.out.println();
                      System.out.println();
                      System.out.println();
                      System.out.println();
                      opFuncionario = sc.nextInt();
                  }while(opFuncionario != 0);

                case 2:
                case 3:
                case 0:

            }




        }while(op != 0);
        sc.close();

    }
}
