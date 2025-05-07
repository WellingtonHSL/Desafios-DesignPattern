package interpreter;


import interfaces.Expressao;

import java.util.Scanner;

public class MainInterpreter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("\n--- SUBMENU ---");
        System.out.println("caixa_alta(\"texto\") → converte o texto para maiúsculas");
        System.out.println("repetir(n, \"texto\") → repete o texto n vezes");
        System.out.println("voltar → para voltar ao menu");

        while (true) {
            System.out.println();
            System.out.print("Digite o comando:");
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("voltar")) {
                break;
            }

            try {
                Expressao expressao = Interpretador.interpretarComando(entrada);
                System.out.println("Saída: " + expressao.interpretar());
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}