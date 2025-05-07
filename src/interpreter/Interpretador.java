package interpreter;

import interfaces.Expressao;

public class Interpretador {
    public static Expressao interpretarComando(String comando) {
        if (comando.startsWith("caixa_alta")) {
            int inicio = comando.indexOf('"') + 1;
            int fim = comando.lastIndexOf('"');
            String conteudo = comando.substring(inicio, fim);
            return new CaixaAltaExpressao(conteudo.toCharArray());
        }

        if (comando.startsWith("repetir")) {
            int inicio = comando.indexOf('(') + 1;
            int virgula = comando.indexOf(',');
            int fim = comando.lastIndexOf('"');

            int n = Integer.parseInt(comando.substring(inicio, virgula).trim());
            int textoInicio = comando.indexOf('"') + 1;
            String conteudo = comando.substring(textoInicio, fim);
            return new RepetirExpressao(n, conteudo.toCharArray());
        }

        throw new IllegalArgumentException("Comando não reconhecido.");
    }
}