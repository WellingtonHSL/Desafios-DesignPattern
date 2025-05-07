package adapter;

import interfaces.CalculadoraDesconto;

import java.util.Scanner;

public class MainAdapter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("\n--- SUBMENU ---");
        System.out.println("Digite → Valor = x, percentual = y");
        System.out.println("voltar → para voltar ao menu");

        while (true) {
            System.out.print("Digite: ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("voltar")) {
                break;
            }

            double valor = 0;
            double percentual = 0;
            boolean valorInformado = false;
            boolean percentualInformado = false;

            String[] partes = entrada.split(",");

            for (String parte : partes) {
                parte = parte.trim().toLowerCase();
                if (!parte.contains("=")) {
                    System.out.println("Formato inválido. Use: valor=100, percentual=10");
                    continue;
                }

                String[] chaveValor = parte.split("=");
                if (chaveValor.length != 2) {
                    System.out.println("Erro ao interpretar: " + parte);
                    continue;
                }

                String chave = chaveValor[0].trim();
                String valorStr = chaveValor[1].trim();

                try {
                    if (chave.equals("valor")) {
                        valor = Double.parseDouble(valorStr);
                        valorInformado = true;
                    } else if (chave.equals("percentual")) {
                        percentual = Double.parseDouble(valorStr);
                        percentualInformado = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido: " + valorStr);
                }
            }

            if (valorInformado && percentualInformado) {
                CalculadoraDesconto calculadora = new DescontoAdapter();
                double resultado = calculadora.calcular(valor, percentual);
                System.out.printf("Valor com desconto: R$%.2f%n", resultado);
            } else {
                System.out.println("Por favor, informe os dois valores no formato: valor=100, percentual=10");
            }

            System.out.println();
        }
    }
}