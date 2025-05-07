import adapter.MainAdapter;
import factory.MainFactory;
import interpreter.MainInterpreter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Desafio 1 - Interpreter Pattern");
            System.out.println("2. Desafio 2 - Factory Pattern");
            System.out.println("3. Desafio 3 - Adapter Pattern");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> MainInterpreter.main(new String[0]);
                case 2 -> MainFactory.main(new String[0]);
                case 3 -> MainAdapter.main(new String[0]);
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}