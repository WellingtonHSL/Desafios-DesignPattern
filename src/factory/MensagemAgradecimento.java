package factory;

import interfaces.Mensagem;

public class MensagemAgradecimento implements Mensagem {
    @Override
    public String formatar(String nome) {
        return "Obrigado pela visita, " + nome + "!";
    }
}