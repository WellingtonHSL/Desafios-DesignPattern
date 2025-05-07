package factory;

import interfaces.Mensagem;

import java.util.Scanner;

public class MainFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("\n--- SUBMENU ---");
        System.out.println("Tipos de mensagens: \n  → boasvindas; \n  → despedida; \n  → agradecimento;");
        System.out.println("voltar → para voltar ao menu");
        System.out.println();

        while(true) {
            System.out.print("Digite o tipo da mensagem: ");
            String tipo = sc.nextLine();

            if(tipo.equalsIgnoreCase("voltar")) {
                break;
            }

            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            try {
                Mensagem mensagem = MensagemFactory.criar(tipo);
                System.out.println(mensagem.formatar(nome));
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            System.out.println();
        }
    }
}