package adapter;

import interfaces.CalculadoraDesconto;

public class DescontoAdapter implements CalculadoraDesconto {
    private SistemaDescontoExterno sistema;

    public DescontoAdapter() {
        this.sistema = new SistemaDescontoExterno();
    }

    @Override
    public double calcular(double valor, double percentual) {
        return sistema.aplicarDescontoPercentual(valor, percentual);
    }
}