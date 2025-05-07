package interpreter;

import interfaces.Expressao;

public class CaixaAltaExpressao implements Expressao {
    private char[] texto;

    public CaixaAltaExpressao(char[] texto) {
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        StringBuilder resultado = new StringBuilder();

        for (char caracteres : texto) {
            if (caracteres >= 'a' && caracteres <= 'z') {
                resultado.append((char)(caracteres - 32));
            } else {
                resultado.append(caracteres);
            }
        }

        return resultado.toString();
    }
}