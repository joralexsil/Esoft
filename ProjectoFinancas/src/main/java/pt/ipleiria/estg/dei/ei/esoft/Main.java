package pt.ipleiria.estg.dei.ei.esoft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, id = 1;
        GestorDespesa gestor = new GestorDespesa();

        do {
            System.out.println("\n=== ORÇAMENTO DE DESPESAS ===");
            System.out.println("1. Adicionar despesa");
            System.out.println("2. Listar todas as despesas");
            System.out.println("3. Editar despesa");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    Despesa Novadespesa = new Despesa(id);
                    SeletorDatas novadata;
                    int dia,mes,ano;

                    System.out.print("Nome da despesa: ");
                    Novadespesa.descricao = sc.next();

                    System.out.print("Valor(€): ");
                    Novadespesa.valor = sc.nextDouble();

                    System.out.println("Vamos Inserir a Data!");
                    System.out.print("Dia: ");
                    dia = sc.nextInt();
                    System.out.print("Mes: ");
                    mes = sc.nextInt();
                    System.out.print("Ano: ");
                    ano = sc.nextInt();

                    novadata = new SeletorDatas(dia, mes, ano);
                    Novadespesa.setData(novadata);
                    gestor.registar(Novadespesa);
                }
                case 2 -> {return;}
                case 3 ->{
                    Despesa Novadespesa = new Despesa(0);
                    SeletorDatas novadata;
                    int dia,mes,ano, id;

                    System.out.print("ID da Despesa a alterar: ");
                    id = sc.nextInt();

                    System.out.print("Nome da despesa: ");
                    Novadespesa.descricao = sc.next();

                    System.out.print("Valor(€): ");
                    Novadespesa.valor = sc.nextDouble();

                    System.out.println("Vamos Inserir a Data!");
                    System.out.print("Dia: ");
                    dia = sc.nextInt();
                    System.out.print("Mes: ");
                    mes = sc.nextInt();
                    System.out.print("Ano: ");
                    ano = sc.nextInt();

                    novadata = new SeletorDatas(dia, mes, ano);
                    Novadespesa.setData(novadata);
                    gestor.editar(id, Novadespesa);

                    System.out.println("Despesa alterada com sucesso!");
                }
                case 0 -> System.out.println("A sair...");
                default -> System.out.println("Opção inválida!");
                //
            }
        } while (opcao != 0);

        sc.close();
    }
}