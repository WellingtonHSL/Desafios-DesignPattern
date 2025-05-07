package factory;

import interfaces.Mensagem;

public class MensagemDespedida implements Mensagem {
    @Override
    public String formatar(String nome) {
        return "Até logo, " + nome + "!";
    }
}