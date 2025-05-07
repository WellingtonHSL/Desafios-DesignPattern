package interpreter;

import interfaces.Expressao;

public class RepetirExpressao implements Expressao {
    private int vezes;
    private char[] texto;

    public RepetirExpressao(int vezes, char[] texto) {
        this.vezes = vezes;
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < vezes; i++) {
            for (char caracteres : texto) {
                resultado.append(caracteres);
            }
        }
        return resultado.toString();
    }
}