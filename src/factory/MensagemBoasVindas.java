package factory;

import interfaces.Mensagem;

public class MensagemBoasVindas implements Mensagem {
    @Override
    public String formatar(String nome) {
        return "Bem-vindo, " + nome + "!";
    }
}