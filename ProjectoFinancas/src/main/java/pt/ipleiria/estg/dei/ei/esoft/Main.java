package pt.ipleiria.estg.dei.ei.esoft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== ORÇAMENTO DE DESPESAS ===");
            System.out.println("1. Adicionar despesa");
            System.out.println("2. Listar todas as despesas");
            System.out.println("3. Ver totais por categoria");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome da despesa: ");
                    String nome = sc.next();
                    System.out.print("Categoria (OPERACOES/VENDAS/PESSOAL): ");
                    Categoria cat = Categoria.valueOf(sc.next().toUpperCase());
                    System.out.print("Orçamento (€): ");
                    double orc = sc.nextDouble();
                    System.out.print("Valor real (€): ");
                    double real = sc.nextDouble();

                    Object categoria = null;
                    System.out.println("Despesa adicionada!");
                }
                case 2 -> {return;}
                case 3 ->  {return;}
                case 0 -> System.out.println("A sair...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

// coloquei aqui um comentario
//coloquei um segundo comentario